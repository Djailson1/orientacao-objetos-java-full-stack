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
		aluno1.nome = "Jo�o"; /*refer�ncia + atributo passou o nome que foi armazenado*/
		aluno1.idade = 48;
		System.out.println("O nome do aluno 1 � = " + aluno1.nome);/*para imprimir*/
		System.out.println("A idade � = " + aluno1.idade);

		Aluno aluno2 = new Aluno(); /*aqui Maria*/
		
		Aluno aluno3 = new Aluno();/*aqui Djailson*/
		
		Aluno aluno4 = new Aluno("Bruno");/*par�metro string foi passado no construtor*/
		
		Aluno aluno5 = new Aluno("Jennifer",24);/*2 par�metros foram passados no contrutor na classe principal main*/

		/*Passou a ser objeto depois que foi inst�nciado 
		 (inst�ncia � como se fosse o tipo das vari�veis no caso o tipo da classe)*/
	}

}
