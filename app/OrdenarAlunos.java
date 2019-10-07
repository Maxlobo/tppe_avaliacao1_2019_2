package app;

public class OrdenarAlunos {
 
	private final CadastroAlunos source;
	
	private String matricula1;
	private String matricula2;
	private Aluno resposta[];
	private int i;
	private int j;
 	private Aluno t;
 
	 public OrdenarAlunos(CadastroAlunos source) {
	  this.source = source;
	 }
	 
	 public Aluno[] computar() {
	  resposta = new Aluno[source.alunos.length];
	  for (int i=0; i < source.alunos.length; i++) {
	   resposta[i] = source.alunos[i]; 
	  }
	  
	  for (i = 0; i < resposta.length - 1; i++) {
	   for (j = i; j < resposta.length; j++) {
	    matricula1 = this.estilizaMatricula(resposta, i);
	    matricula2 = this.estilizaMatricula(resposta, j);
	    if (matricula1.compareTo(matricula2) > 0) {
	     t = resposta[i]; 
	     resposta[i] = resposta[j];
	     resposta[j] = t;
	    }
	   }
	  }
	  
	  return resposta;
	 }
	 
	 private String estilizaMatricula(Aluno[] resposta, int i) {
	  return resposta[i].getPrefixoMatricula() + "/" + resposta[i].getSufixoMatricula();
	 }
	}
