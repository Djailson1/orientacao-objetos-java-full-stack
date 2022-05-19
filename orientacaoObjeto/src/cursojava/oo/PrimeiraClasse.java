package cursojava.oo;

import cursojava.classes.Aluno;

public class PrimeiraClasse {
	public static void main(String[] args) {
		/*qu ando instânciado passa a existir na memória java
		 */
		
		/*new Aluno() é uma instância(criação de Objeto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		/*é obrigatório instânciar*/
		
		Aluno aluno1 = new Aluno();/*aqui pode ser João*/
		/*por padrão os atributos de java são privados(private) tem que colocar public lá*/
	/*classe /variável /ch const. / do tipo de class*/
		aluno1.setNome("João");
		/*set passa os dados*/
		aluno1.setIdade(50);
		aluno1.setDataNascimento("10/02/1997");
		aluno1.setRg("635.673.874-76");
		aluno1.setCpf("72637.73256.7632");
		aluno1.setNomeMae("MAria do Carmo");
		aluno1.setNomePai("jose albertino");
		aluno1.setDataMatricula("10/02/2022");
		aluno1.setSerieMatriculado("6");
		aluno1.setNomeEscola("Escola Bento Américo");
		
		

		System.out.println("Nome é = " + aluno1.getNome());
		/*get retorna os dados*/
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		
		System.out.println("=============================================================");
		
       
		Aluno aluno2 = new Aluno(); /*aqui Maria*/
		aluno2.setNome("Maria");
		aluno2.setIdade(48);
		aluno2.setDataNascimento("18/05/1987");
		aluno2.setRg("635656566");
		aluno2.setCpf("727.756.763-62");
		aluno2.setNomeMae("Josefina Fonseca");
		aluno2.setNomePai("Curtis Jackson");
		aluno2.setDataMatricula("12/02/2022");
		aluno2.setSerieMatriculado("7");
		aluno2.setNomeEscola("Escola JDev Java");
		
		System.out.println("Nome é = " + aluno2.getNome());
		/*get retorna os dados*/
		System.out.println("Idade = " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		
		  /*=========================================================================*/
		
		Aluno aluno3 = new Aluno();/*aqui Djailson*/
		
		Aluno aluno4 = new Aluno("Bruno");/*parâmetro string foi passado no construtor*/
		
		Aluno aluno5 = new Aluno("Jennifer",24);/*2 parâmetros foram passados no contrutor na classe principal main*/

		/*Passou a ser objeto depois que foi instânciado 
		 (instância é como se fosse o tipo das variáveis no caso o tipo da classe)*/
	}

}
