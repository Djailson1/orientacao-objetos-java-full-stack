package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		
		bancaria.setDescricao("Conta banc�ria do Djailson");
		
		System.out.println(bancaria);
		
		bancaria.diminue100Reais();
		bancaria.diminue100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositidoDinheiro(1000);
		
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		
		System.out.println(bancaria);
		
		
		
		

	}

}
