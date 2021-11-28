package entities;

import java.util.Date;

public class Defensor extends Atleta {
	
	private Integer PartidasSemSofrerGol;
	private Integer roubadasDeBola;
	
	public Defensor() {
	}
	
	public Defensor(Integer numeroCamisa, String nome, Double salarioMensal, Date dataAdmissaoClube,
			Integer numCartoesAmarelos, Integer numCartaoVermelhos, Integer faltasCometidas,
			Integer partidasSemSofrerGol, Integer roubadasDeBola) {
		super(numeroCamisa, nome, salarioMensal, dataAdmissaoClube, numCartoesAmarelos, numCartaoVermelhos,
				faltasCometidas);
		PartidasSemSofrerGol = partidasSemSofrerGol;
		this.roubadasDeBola = roubadasDeBola;
	}

	public Integer getPartidasSemSofrerGol() {
		return PartidasSemSofrerGol;
	}

	public void setPartidasSemSofrerGol(Integer partidasSemSofrerGol) {
		PartidasSemSofrerGol = partidasSemSofrerGol;
	}

	public Integer getRoubadasDeBola() {
		return roubadasDeBola;
	}

	public void setRoubadasDeBola(Integer roubadasDeBola) {
		this.roubadasDeBola = roubadasDeBola;
	}
	
	
	
	

}
