package moldes;

public class Bicicleta {
	
	//Encapsulamento
	private String modelo;
	private int velocidade = 0;
	private int pedaladasPorMinuto = 0;
	private int marcha = 1;
	
	//setter
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	//setter
	public void setVelocidade(int velocidade) {
		if(velocidade < 0) {
			System.out.println("Inválido.");
			return;
		}
		
		this.velocidade = velocidade;
	}
	
	//setter
	public void setPedaladasPorMinuto(int pedaladas) {
		if(pedaladas < 0) {
			System.out.println("Inválido.");
			return;
		}
		
		pedaladasPorMinuto = pedaladas;
	}
	
	//setter
	public void setMarcha(int marcha) {
		if(marcha <= 0) {
			System.out.println("Inválido.");
			return;
		}
		
		this.marcha = marcha;
	}
	
	//getter
	public String getModelo() {
		return modelo;
	}
	
	//getter
	public int getVelocidade() {
		return velocidade;
	}
	
	//getter
	public int getPedaladasPorMinuto() {
		return pedaladasPorMinuto;
	}
	
	//getter
	public int getMarcha() {
		return marcha;
	}
}
