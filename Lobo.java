package aula_01_10;

public class Lobo implements Animal {

	@Override
	public void dormir() {
		System.out.println("O lobo dorme...");

	}

	@Override
	public void caminhar() {
		System.out.println("O lobo esta caminhando");

	}

	@Override
	public void correr() {
		System.out.println("O lobo esta correndo");

	}

	@Override
	public void emitirSom() {
		System.out.println("O lobo esta uivando");
	}

}
