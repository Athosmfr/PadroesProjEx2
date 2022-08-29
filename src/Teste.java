
public class Teste {

	public static void main(String[] args) {
		
		Produto MiniPC = new Produto();
		
		MiniPC.setPeso(500);
		MiniPC.setVolume(200);
		MiniPC.setPreco(1800);
		
		MiniPC.calculaFrete();
		System.out.println("Frete = R$ " + MiniPC.calculaFrete());
		System.out.println("R$ " + MiniPC.precoTotal());
		
		Produto SoundBar = new Produto();
		
		SoundBar.setPeso(670);
		SoundBar.setVolume(8000);
		SoundBar.setPreco(1800);
		
		SoundBar.calculaFrete();
		System.out.println("Frete = R$ " + SoundBar.calculaFrete());
		System.out.println("R$ " + SoundBar.precoTotal());
		
		ProdutoComSeguro SuperServidor = new ProdutoComSeguro();
		
		SuperServidor.setPeso(3800);
		SuperServidor.setVolume(120000);
		SuperServidor.setPreco(30000);
		
		System.out.println("Frete = R$ " + SuperServidor.calculaFrete());
		System.out.println("R$ " + SuperServidor.precoTotal());
		
	}
	
}
