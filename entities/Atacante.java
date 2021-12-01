package entities;

import java.util.Date;

public class Atacante extends MeioCampista{
	
	private Integer gols;
	private Integer finalizacoes;
	
	public Atacante() {
	}
	
	public Atacante(Integer numeroCamisa, String nome, Double salarioMensal, Date dataAdmissaoClube,
			Integer numCartoesAmarelos, Integer numCartaoVermelhos, Integer faltasCometidas, Integer assitencias,
			Integer passes, Integer passesErrados, Integer gols, Integer finalizacoes) {
		super(numeroCamisa, nome, salarioMensal, dataAdmissaoClube, numCartoesAmarelos, numCartaoVermelhos,
				faltasCometidas, assitencias, passes, passesErrados);
		this.gols = gols;
		this.finalizacoes = finalizacoes;
	}

	public Integer getGols() {
		return gols;
	}

	public void setGols(Integer gols) {
		this.gols = gols;
	}

	public Integer getFinalizacoes() {
		return finalizacoes;
	}

	public void setFinalizacoes(Integer finalizacoes) {
		this.finalizacoes = finalizacoes;
	}

	@Override
	public String toString() {
		return "Atacante [gols=" + gols + ", finalizacoes=" + finalizacoes + "]";
	}
	
	
	
	

}
