package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GerenciadorDePartidaImplementacao implements GerenciadorDePartida {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Partida iniciaPartida(Date dataPartida, String nomeAdversario, List<Atleta> atletasEscalados) {
		Partida partida = new Partida();
		partida.setDataPartida(dataPartida);
		partida.setNomeAdversario(nomeAdversario);
		partida.setAtletasEscalados(atletasEscalados);
		
		return partida;		
	}	
	
	@Override
	public EventoPartida registrarEvento(Partida partida, TipoEvento tipoEvento, Integer numeroCamisa) {
		
		EventoPartida evento = new EventoPartida();
		
		Partida partida1 = partida;
		partida1.setDataPartida(partida.getDataPartida());
		partida1.setNomeAdversario(partida.getNomeAdversario());
		partida1.setAtletasEscalados(partida.atletasEscalados);
		for(Atleta atleta1 : partida.atletasEscalados) {
			if( atleta1.getNumeroCamisa() == numeroCamisa  ) {
				evento.setAtletaEnvolvido(atleta1);
				evento.getAtletaEnvolvido().setNumeroCamisa(atleta1.getNumeroCamisa());				
		}
			
		}
	    
		evento.setTipoEvento(tipoEvento);
		 
		if ( evento.getTipoEvento() == TipoEvento.FALTA_COMETIDA ) {				
				for ( Atleta atleta : partida.atletasEscalados) {
					if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
						atleta.setFaltasCometidas(atleta.getFaltasCometidas()+1);
				}
		}
	}
		return evento;
		
	}

	@Override
	public void imprimirEstatisticas() {
		
		
	}

}
