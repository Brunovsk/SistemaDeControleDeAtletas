package entities;

import java.util.Date;

public abstract class Atleta {
	private Integer numeroCamisa;
	private String nome;
	private Double salarioMensal;
	private Date dataAdmissaoClube;
	private Integer numCartoesAmarelos;
	private Integer numCartaoVermelhos;
    protected Integer faltasCometidas;
	
	public Atleta() {
		
	}
	
	public Atleta(Integer numeroCamisa, String nome, Double salarioMensal, Date dataAdmissaoClube,
			Integer numCartoesAmarelos, Integer numCartaoVermelhos, Integer faltasCometidas) {
		this.numeroCamisa = numeroCamisa;
		this.nome = nome;
		this.salarioMensal = salarioMensal;
		this.dataAdmissaoClube = dataAdmissaoClube;
		this.numCartoesAmarelos = numCartoesAmarelos;
		this.numCartaoVermelhos = numCartaoVermelhos;
		this.faltasCometidas = faltasCometidas;
	}

	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}

	public  void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public Date getDataAdmissaoClube() {
		return dataAdmissaoClube;
	}

	public void setDataAdmissaoClube(Date dataAdmissaoClube) {
		this.dataAdmissaoClube = dataAdmissaoClube;
	}

	public Integer getNumCartoesAmarelos() {
		return numCartoesAmarelos;
	}

	public void setNumCartoesAmarelos(Integer numCartoesAmarelos) {
		this.numCartoesAmarelos = numCartoesAmarelos;
	}

	public Integer getNumCartaoVermelhos() {
		return numCartaoVermelhos;
	}

	public void setNumCartaoVermelhos(Integer numCartaoVermelhos) {
		this.numCartaoVermelhos = numCartaoVermelhos;
	}

	public Integer getFaltasCometidas() {
		return faltasCometidas;
	}

	public void setFaltasCometidas(Integer faltasCometidas) {
		this.faltasCometidas = faltasCometidas;
	}

	@Override
	public String toString() {
		return "Atleta [numeroCamisa=" + numeroCamisa + ", nome=" + nome + ", salarioMensal=" + salarioMensal
				+ ", dataAdmissaoClube=" + dataAdmissaoClube + ", numCartoesAmarelos=" + numCartoesAmarelos
				+ ", numCartaoVermelhos=" + numCartaoVermelhos + ", faltasCometidas=" + faltasCometidas + "]";
	}
	
	
	


}
