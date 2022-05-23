package cursojava.oo;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasse {
	public static void main(String[] args) {
		/*quando inst�nciado passa a existir na mem�ria java
		 */
		
		/*new Aluno() � uma inst�ncia(cria��o de Objeto)*/
		/*aluno1 � uma refer�ncia para o objeto aluno*/
		/*� obrigat�rio inst�nciar*/
		
		/*aula sobre entrada de dados*/
		String nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		String idade = JOptionPane.showInputDialog("Qual � sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual � o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual � o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data de matr�cula?");
		String serie = JOptionPane.showInputDialog("Qual � a s�rie?");
		String escola = JOptionPane.showInputDialog("Qual � a escola?");
	
		
		Aluno aluno1 = new Aluno();/*aqui pode ser Jo�o*/
		/*por padr�o os atributos de java s�o privados(private) tem que colocar public l�*/
	/*classe /vari�vel /ch const. / do tipo de class*/
		aluno1.setNome(nome);
		/*set passa os dados*/
		aluno1.setIdade(Integer.valueOf(idade));/*convertendo string em int*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRg(rg);
		aluno1.setCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		/**/
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matem�tica");
		disciplina2.setNota(80);
		
		
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina1);
		
		
		
		
		
		
	
		
		

		/*get retorna os dados - imprime*/
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Registro Geral = " + aluno1.getRg());
		System.out.println("Cpf = " + aluno1.getCpf());
		System.out.println("Nome do pai =  " + aluno1.getNomePai());
		System.out.println("Nome da m�e =  " + aluno1.getNomeMae());
		System.out.println("N�mero da matricula =  " + aluno1.getDataMatricula());
		System.out.println("S�rie matriculado =  " + aluno1.getSerieMatriculado());
		System.out.println("Nome da escola =  " + aluno1.getNomeEscola());
		
		/*chamando m�todos e imprimindo na tela*/
		/*System.out.println("M�dia = " + aluno1.getMediaNota());/*chamando o metodo m�dia para retornar os valores*/
		/*System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));/*atribuind o resultado true a aprovado com op.tern�rio*/
		/*System.out.println("Resultado = " + aluno1.getAlunoAprovado2());   /*imprimndo a aprova��o em texto tipo string direto*/
		
		
		System.out.println(aluno1.toString());/*descri��o do objeto na mem�ria - tostring*/
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
	
		
		System.out.println("=============================================================");
		
       
		/*Aluno aluno2 = new Aluno(); /*aqui Maria*/
		/*aluno2.setNome("Maria");
		aluno2.setIdade(48);
		aluno2.setDataNascimento("18/05/1987");
		aluno2.setRg("635656566");
		aluno2.setCpf("727.756.763-62");
		aluno2.setNomeMae("Josefina Fonseca");
		aluno2.setNomePai("Curtis Jackson");
		aluno2.setDataMatricula("12/02/2022");
		aluno2.setSerieMatriculado("7");
		aluno2.setNomeEscola("Escola JDev Java");*/
		
		/*System.out.println("Nome � = " + aluno2.getNome());
		/*get retorna os dados*/
		/*System.out.println("Idade = " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		
		  /*=========================================================================*/
		
		/*Aluno aluno3 = new Aluno();/*aqui Djailson*/
		
		/*Aluno aluno4 = new Aluno("Bruno");/*par�metro string foi passado no construtor*/
		
		/*Aluno aluno5 = new Aluno("Jennifer",24);/*2 par�metros foram passados no contrutor na classe principal main*/

		/*Passou a ser objeto depois que foi inst�nciado 
		 (inst�ncia � como se fosse o tipo das vari�veis no caso o tipo da classe)*/
	}

}
