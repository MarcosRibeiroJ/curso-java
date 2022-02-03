package classe;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;			
		} else {
			return false;
		}
	}
	
	//O hashcode ser� abordado nas pr�ximas aulas, mas deixarei um exemplo da estrutura de c�digo do hashcode
	
	public int hashCode() {
		return 0;
	}
}
