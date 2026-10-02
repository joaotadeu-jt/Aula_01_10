package aula_01_10;

public class Ferrari implements Veiculo {

	@Override
	public void ligar() {
		System.out.println("A Ferrari liga");

	}

	@Override
	public void desligar() {
		System.out.println("A Ferrari desliga");

	}

	@Override
	public void manobrar() {
		System.out.println("A Ferrari manobra");

	}

	@Override
	public void engatar() {
		System.out.println("A Faerrari engata marcha");

	}

	@Override
	public void acelerar() {
		System.out.println("A ferrari acelera");

	}

	@Override
	public void frear() {
		System.out.println("A ferrari freia");

	}

}
