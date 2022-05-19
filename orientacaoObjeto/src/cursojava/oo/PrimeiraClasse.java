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
		aluno1.nome = "João"; /*referÊncia + atributo passou o nome que foi armazenado*/
		aluno1.idade = 48;
		System.out.println("O nome do aluno 1 é = " + aluno1.nome);/*para imprimir*/
		System.out.println("A idade é = " + aluno1.idade);

		Aluno aluno2 = new Aluno(); /*aqui Maria*/
		
		Aluno aluno3 = new Aluno();/*aqui Djailson*/
		
		Aluno aluno4 = new Aluno("Bruno");/*parâmetro string foi passado no construtor*/
		
		Aluno aluno5 = new Aluno("Jennifer",24);/*2 parâmetros foram passados no contrutor na classe principal main*/

		/*Passou a ser objeto depois que foi instânciado 
		 (instância é como se fosse o tipo das variáveis no caso o tipo da classe)*/
	}

}
