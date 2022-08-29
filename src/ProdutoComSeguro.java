
public class ProdutoComSeguro extends Produto {

	protected double freteComSeguro;
	
	@Override
	public double calculaFrete() {
		frete = 0.8 * (Peso / 1000) + 1 * (Volume / 1000);
		freteComSeguro = frete + (frete * 0.3);
		return freteComSeguro;
	}
	
	@Override
	public double precoTotal() {
		double total = Preco + freteComSeguro;
		return total;
	}
	
	
}
