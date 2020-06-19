
public class BombaCombustivel {
	private String combustivel;
	private double litros;
	private double preco;
	
	
	public BombaCombustivel(String combustivel, int litros, double preco) {
		this.combustivel = combustivel;
		this.litros = litros;
		this.preco = preco;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public double getLitros() {
		return litros;
	}


	public void setLitros(double litros) {
		this.litros = litros;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double custo(double volume) {
		this.litros -= volume;
		return this.preco * volume;
	}
	
	public double volume(double valor) {
		this.litros -= (valor/this.preco);
		return (valor / this.preco);
	}
	
	

}
