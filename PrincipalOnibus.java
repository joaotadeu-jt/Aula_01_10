package aula_01_10;

public class PrincipalOnibus {

	public static void main(String[] args) {
		
		
		Carro ferrari =  new Carro("00000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("---------------------------------------------");
		
		
		Onibus marcopolo = new Onibus("111111", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		

	}

}
