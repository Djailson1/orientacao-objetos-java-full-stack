package cursojava.oo;

import cursojava.classes.Aluno;

public class PrimeiraClasse {
	public static void main(String[] args) {
		/*qu ando inst�nciado passa a existir na mem�ria java
		 */
		
		/*new Aluno() � uma inst�ncia(cria��o de Objeto)*/
		/*aluno1 � uma refer�ncia para o objeto aluno*/
		/*� obrigat�rio inst�nciar*/
		
		Aluno aluno1 = new Aluno();/*aqui pode ser Jo�o*/
		/*por padr�o os atributos de java s�o privados(private) tem que colocar public l�*/
	/*classe /vari�vel /ch const. / do tipo de class*/
		aluno1.setNome("Jo�o");
		/*set passa os dados*/
		aluno1.setIdade(50);
		aluno1.setDataNascimento("10/02/1997");
		aluno1.setRg("635.673.874-76");
		aluno1.setCpf("72637.73256.7632");
		aluno1.setNomeMae("MAria do Carmo");
		aluno1.setNomePai("jose albertino");
		aluno1.setDataMatricula("10/02/2022");
		aluno1.setSerieMatriculado("6");
		aluno1.setNomeEscola("Escola Bento Am�rico");
		
		

		System.out.println("Nome � = " + aluno1.getNome());
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
		
		System.out.println("Nome � = " + aluno2.getNome());
		/*get retorna os dados*/
		System.out.println("Idade = " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		
		  /*=========================================================================*/
		
		Aluno aluno3 = new Aluno();/*aqui Djailson*/
		
		Aluno aluno4 = new Aluno("Bruno");/*par�metro string foi passado no construtor*/
		
		Aluno aluno5 = new Aluno("Jennifer",24);/*2 par�metros foram passados no contrutor na classe principal main*/

		/*Passou a ser objeto depois que foi inst�nciado 
		 (inst�ncia � como se fosse o tipo das vari�veis no caso o tipo da classe)*/
	}

}
