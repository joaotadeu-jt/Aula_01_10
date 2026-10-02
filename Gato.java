package aula_01_10;

public class Gato implements Animal {

	@Override
	public void dormir() {
		System.out.println("O gato dorme");
	}

	@Override
	public void caminhar() {
		System.out.println("O gato esta caminhando");

	}

	@Override
	public void correr() {
		System.out.println("O gato esta correndo");
	}

	@Override
	public void emitirSom() {
		System.out.println("O gato esta miando");

	}

}
