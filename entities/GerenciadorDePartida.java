package entities;

import java.util.Date;
import java.util.List;

public interface GerenciadorDePartida {
	
	public Partida iniciaPartida(Date dataPartida, String nomeAdversario,List <Atleta> atletasescalados);
	
	public EventoPartida registrarEvento(Partida partida,TipoEvento tipoEvento, Atleta atletaEnvolvido);
	
	public void imprimirEstatisticas();

	

	

}
