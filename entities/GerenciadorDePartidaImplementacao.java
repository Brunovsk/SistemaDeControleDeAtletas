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
		
		if ( evento.getTipoEvento() == TipoEvento.DEFESA ) {				
			for ( Atleta atleta : partida.atletasEscalados) {
				if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
					atleta.setFaltasCometidas(atleta.getFaltasCometidas()+1);
			}
		}
	}
		if ( evento.getTipoEvento() == TipoEvento.ROUBADA_DE_BOLA ) {				
			for ( Atleta atleta : partida.atletasEscalados) {
				if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
					atleta.setFaltasCometidas(atleta.getFaltasCometidas()+1);
			}
		}
	}
		if ( evento.getTipoEvento() == TipoEvento.ASSISTENCIA ) {				
			for ( Atleta atleta : partida.atletasEscalados) {
				if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
					atleta.setFaltasCometidas(atleta.getFaltasCometidas()+1);
			}
		}
	}
		if ( evento.getTipoEvento() == TipoEvento.FINALIZACAO ) {				
			for ( Atleta atleta : partida.atletasEscalados) {
				if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
					atleta.setFaltasCometidas(atleta.getFaltasCometidas()+1);
			}
		}
	}
		if ( evento.getTipoEvento() == TipoEvento.GOL_A_FAVOR ) {				
			for ( Atleta atleta : partida.atletasEscalados) {
				if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
					atleta.setFaltasCometidas(atleta.getFaltasCometidas()+1);
			}
		}
	}
		if ( evento.getTipoEvento() == TipoEvento.CARTAO_AMARELO ) {				
			for ( Atleta atleta : partida.atletasEscalados) {
				if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
					atleta.setFaltasCometidas(atleta.getNumCartoesAmarelos()+1);
			}
		}
	}
		if ( evento.getTipoEvento() == TipoEvento.CARTAO_VERMELHO ) {				
			for ( Atleta atleta : partida.atletasEscalados) {
				if( evento.getAtletaEnvolvido().getNumeroCamisa() == atleta.getNumeroCamisa()  ) {
					atleta.setFaltasCometidas(atleta.getNumCartaoVermelhos()+1);
			}
		}
	}
		return evento;
		
	}

		
		

	@Override
	public void imprimirEstatisticas(List<Atleta> atletas) {
		for ( Atleta atleta :atletas) {
			System.out.println("Nome: " + atleta.getNome());
			System.out.println("numero da camisa: "+atleta.getNumeroCamisa());
			System.out.println("salario: "+atleta.getSalarioMensal());
			System.out.println("data admissao: "+ atleta.getDataAdmissaoClube());
			System.out.println("cartão amarelo: "+atleta.getNumCartoesAmarelos());
			System.out.println("cartão vermelho: "+atleta.getNumCartaoVermelhos());
			System.out.println("faltas cometidas: "+ atleta.getFaltasCometidas());
			
			if(atleta instanceof Goleiro) {
				Goleiro goleiro = (Goleiro) atleta;
				System.out.println("numero defesas: "+ goleiro.getDefesas());	
				}
			if(atleta instanceof Defensor) {
				Defensor defensor = (Defensor) atleta;
				System.out.println("partidas sem sofrer gols: "+ defensor.getPartidasSemSofrerGol());
				System.out.println("bolas roubadas: "+ defensor.getRoubadasDeBola());
			}
			if(atleta instanceof Atacante) {
				Atacante atacante = (Atacante) atleta;
				System.out.println("finalizações: "+ atacante.getFinalizacoes());
				System.out.println("numero de gols: "+atacante.getGols());
			}
			if(atleta instanceof MeioCampista) {
				MeioCampista meioCampista = (MeioCampista) atleta;
				System.out.println("Assistencias: " + meioCampista.getAssitencias());
		        System.out.println("Numero de Passes: " + meioCampista.getPasses());
		        System.out.println("Passes Errados: " + meioCampista.getPassesErrados());
		
	        }
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println();
		}
	}
}
	
	