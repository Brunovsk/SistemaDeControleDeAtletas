package entities;

import java.util.Date;

public class Goleiro extends Defensor{
	
	private Integer defesas;
	
	public Goleiro() {
	}

	public Goleiro(Integer numeroCamisa, String nome, Double salarioMensal, Date dataAdmissaoClube,
			Integer numCartoesAmarelos, Integer numCartaoVermelhos, Integer faltasCometidas,
			Integer partidasSemSofrerGol, Integer roubadasDeBola, Integer defesas) {
		super(numeroCamisa, nome, salarioMensal, dataAdmissaoClube, numCartoesAmarelos, numCartaoVermelhos,
				faltasCometidas, partidasSemSofrerGol, roubadasDeBola);
		this.defesas = defesas;
	}

	public Integer getDefesas() {
		return defesas;
	}

	public void setDefesas(Integer defesas) {
		this.defesas = defesas;
	}
	
	
	

}
