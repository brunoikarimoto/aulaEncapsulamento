package principal;

import moldes.*;

public class Programa {
	public static void main(String[] args) {
		String modelo = "Caloi";
		Bicicleta minhaBike = new Bicicleta();
		
		/*minhaBike.setModelo(modelo);
		minhaBike.setVelocidade(30);
		minhaBike.setPedaladasPorMinuto(10);
		minhaBike.setMarcha(2);
		
		System.out.println("Modelo: " + minhaBike.getModelo());
		System.out.println("Velocidade: " + minhaBike.getVelocidade());
		System.out.println("Pedaladas por minuto: " + minhaBike.getPedaladasPorMinuto());
		System.out.println("Marcha: " + minhaBike.getMarcha());*/
		
		Pessoa eu = new Pessoa();
		Pessoa voce = new Pessoa();
		
		eu.setCPF("130.424.459-84");
		eu.setNome("Bruno");
		eu.setPeso(80);
		
		voce.setCPF("123.456.789-10");
		voce.setNome("Pedro");
		voce.setPeso(60);
		
		System.out.println("Minhas informações");
		System.out.println("Nome: " + eu.getNome());
		System.out.println("CPF: " + eu.getCPF());
		System.out.println("Peso: " + eu.getPeso());
		
		System.out.println("Suas informações");
		System.out.println("Nome: " + voce.getNome());
		System.out.println("CPF: " + voce.getCPF());
		System.out.println("Peso: " + voce.getPeso());
	}
}
