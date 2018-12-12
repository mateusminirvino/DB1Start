package br.com.db1.db1start;

public enum Regioes {

	NORTE(new Uf[] {Uf.AM, Uf.PA}),
	SUL(new Uf[] {Uf.PR, Uf.SC}), 
	SUDESTE(new Uf[] {Uf.SP, Uf.MG}), 
	CENTRO_OESTE(new Uf[] {Uf.MT, Uf.MS}), 
	NORDESTE(new Uf[] {Uf.PI, Uf.BA});

	private Uf[] ufs;

	private Regioes(Uf[] ufs) {
		this.ufs = ufs;
	}
	
	public Uf[] getUfs() {
		return ufs;
	}

}
