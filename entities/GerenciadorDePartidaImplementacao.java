package entities;

import java.util.Date;
import java.util.List;

public class GerenciadorDePartidaImplementacao implements GerenciadorDePartida {
	
	@Override
	public Partida iniciaPartida(Date dataPartida, String nomeAdversario, List<Atleta> atletasEscalados) {
		Partida partida = new Partida();
		partida.setDataPartida(dataPartida);
		partida.setNomeAdversario(nomeAdversario);
		partida.setAtletasEscalados(atletasEscalados);
		
		return partida;		
	}	
	
	@Override
	public EventoPartida registrarEvento(Partida partida, TipoEvento tipoEvento, Atleta atletaEnvolvido) {
		
		EventoPartida evento = new EventoPartida();
		
		evento.setAtletaEnvolvido(atletaEnvolvido);
		evento.setTipoEvento(tipoEvento);
		return evento;
		
	}

	@Override
	public void imprimirEstatisticas() {
		
		
	}

}
