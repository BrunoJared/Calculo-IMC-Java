package entities;

public class Individuo {
	
	
	public String Nome;
	public double Altura;
	public double Peso;
	
	
	public Individuo() {
		
	}
	
	


	public Individuo(String nome, double altura, double peso) {
		
		this.Nome = nome;
		this.Altura = altura;
		this.Peso = peso;
	}




	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public double getAltura() {
		return Altura;
	}


	public void setAltura(double altura) {
		Altura = altura;
	}


	public double getPeso() {
		return Peso;
	}


	public void setPeso(double peso) {
		Peso = peso;
	}
	
	public double IMC() {
		return Peso / (Altura * Altura);
	}




	@Override
	public String toString() {
		
		return  "Individuo [Nome=" + Nome + ", Altura=" + Altura + ", Peso=" + Peso + "] " ;
	}




	
	

}
