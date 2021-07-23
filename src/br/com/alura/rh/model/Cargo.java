package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo getProximocargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximocargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximocargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximocargo() {
			return GERENTE;
		}
	};

	public abstract Cargo getProximocargo();

}