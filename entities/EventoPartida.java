package entities;

public class EventoPartida {
	
	private TipoEvento tipoEvento;
	private Atleta atletaEnvolvido;
	
	public EventoPartida() {
	}
	
	public EventoPartida(TipoEvento tipoEvento, Atleta atletaEnvolvido) {
		this.tipoEvento = tipoEvento;
		this.atletaEnvolvido = atletaEnvolvido;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Atleta getAtletaEnvolvido() {
		return atletaEnvolvido;
	}

	public void setAtletaEnvolvido(Atleta atletaEnvolvido) {
		this.atletaEnvolvido = atletaEnvolvido;
	}
	
	

}
