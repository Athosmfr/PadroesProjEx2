
public class Produto {

	protected double Peso; // em Gramas
	protected double Volume; // em Cm3
	protected double Preco; // em Real
	
	protected double frete;
	//protected double freteComSeguro;
	
	public Produto() {
		this.Peso = Peso;
		this.Volume = Volume;
		this.Preco = Preco;
	}
	
	public double getPeso() {
		return Peso;
	}
	
	public void setPeso(double Peso) {
		this.Peso = Peso;
	}
	
	public double getVolume() {
		return Volume;
	}
	
	public void setVolume(double Volume) {
		this.Volume = Volume;
	}
	
	public double getPreco() {
		return Preco;
	}
	
	public void setPreco(double Preco) {
		this.Preco = Preco;
	}
	
	public double calculaFrete() {
		frete = 0.8 * (Peso / 1000) + 1 * (Volume / 1000);
		return frete;
	}
	
//	public double calculaFreteComSeguro() {
//		frete = 0.8 * (Peso / 1000) + 1 * (Volume / 1000);
//		freteComSeguro = frete + (frete * 0.3);
//		return freteComSeguro;
//	}
	
	public double precoTotal() {
		double total = Preco + frete;
		return total;
	}
	
//	public double precoTotalComSeguro() {
//		double total = Preco + freteComSeguro;
//		return total;
//	}
//	
	
}
