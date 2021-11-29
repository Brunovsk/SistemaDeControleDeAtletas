package entities;

import java.util.Date;

public class MeioCampista extends Atleta{
	private Integer assitencias;
	private Integer passes;
	private Integer passesErrados;
	
	public MeioCampista() {
	}
	
	public MeioCampista(Integer numeroCamisa, String nome, Double salarioMensal, Date dataAdmissaoClube,
			Integer numCartoesAmarelos, Integer numCartaoVermelhos, Integer faltasCometidas, Integer assitencias,
			Integer passes, Integer passesErrados) {
		super(numeroCamisa, nome, salarioMensal, dataAdmissaoClube, numCartoesAmarelos, numCartaoVermelhos,
				faltasCometidas);
		this.assitencias = assitencias;
		this.passes = passes;
		this.passesErrados = passesErrados;
	}

	public Integer getAssitencias() {
		return assitencias;
	}

	public void setAssitencias(Integer assitencias) {
		this.assitencias = assitencias;
	}

	public Integer getPasses() {
		return passes;
	}

	public void setPasses(Integer passes) {
		this.passes = passes;
	}

	public Integer getPassesErrados() {
		return passesErrados;
	}

	public void setPassesErrados(Integer passesErrados) {
		this.passesErrados = passesErrados;
	}

	@Override
	public String toString() {
		return "MeioCampista [assitencias=" + assitencias +
				", FaltasCometidas ="+ faltasCometidas+", passes=" + passes + ", passesErrados=" + passesErrados
				+ "]";
	}
	
	

}
