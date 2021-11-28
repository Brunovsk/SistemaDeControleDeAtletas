package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partida {
	private String nomeAdversario;
	private Date dataPartida;
	List<Atleta> atletasEscalados = new ArrayList<>();
	List <EventoPartida> eventos = new ArrayList<>();
	
	public Partida() {
	}
	
	public Partida(String nomeAdversario, Date dataPartida) {
		this.nomeAdversario = nomeAdversario;
		this.dataPartida = dataPartida;
	}

	public String getNomeAdversario() {
		return nomeAdversario;
	}

	public void setNomeAdversario(String nomeAdversario) {
		this.nomeAdversario = nomeAdversario;
	}

	public Date getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}

	public List<Atleta> getAtletasEscalados() {
		return atletasEscalados;
	}

	public void setAtletasEscalados(List<Atleta> atletasEscalados) {
		this.atletasEscalados = atletasEscalados;
	}

	public List<EventoPartida> getEventos() {
		return eventos;
	}

	public void setEventos(List<EventoPartida> eventos) {
		this.eventos = eventos;
	}
	
	

}
