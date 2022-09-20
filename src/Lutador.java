import java.util.Scanner;



public class Lutador {
	
	public Scanner tec = new Scanner(System.in);
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador() {
		System.out.print("Nome: ");
		this.setNome(tec.nextLine());
		System.out.print("Nacionalidade: ");
		this.setNacionalidade(tec.next());
		System.out.print("Idade: ");
		this.setIdade(tec.nextInt());
		System.out.print("Altura: ");
		this.setAltura(tec.nextDouble());
		System.out.print("Peso: ");
		this.setPeso(tec.nextDouble());
		
		System.out.print("Vitorias: ");
		this.setVitorias(tec.nextInt());
		System.out.print("Derrotas: ");
		this.setDerrotas(tec.nextInt());
		System.out.print("Empates: ");
		this.setEmpates(tec.nextInt());
		System.out.println();
		
	
	}
	
	//************ METODOS ************
	
		public void apresentar() {
			System.out.println("****************************");
			System.out.println("CHEGOU A HORA! Entrada de "+this.getNome());
			System.out.println("Nacionalidade: "+this.getNacionalidade());
			System.out.println("Idade: "+this.getIdade());
			System.out.println("Altura: "+this.getAltura()+"m");
			System.out.println("Peso: "+this.getPeso()+"Kg");
			System.out.println("Categoria: "+this.getCategoria());
			System.out.println("Vitórias: "+this.getVitorias());
			System.out.println("Derrotas: "+this.getDerrotas());
			System.out.println("Empates: "+this.getEmpates());
		}
		
		public void status() {
			System.out.println("*******Status************");
			System.out.println(this.getNome()+" é um peso "+ this.getCategoria());
			System.out.println(this.getVitorias()+" vitórias.");
			System.out.println(this.getDerrotas()+" derrotas.");
			System.out.println(this.getEmpates()+" empates.");
		}
		
		public void ganharLuta() {
			this.setVitorias(this.getVitorias()+1);
		}
		public void perderLuta() {
			this.setDerrotas(this.getDerrotas()+1);
		}
		public void empatarLuta() {
			this.setEmpates(this.getEmpates()+1);
		}
	
	
	
	
	
	//******** GETTERS E SETTERS********
	
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return this.categoria;
	}

	private void setCategoria() {
		if(this.getPeso()<52.2) {
			this.categoria = "Inválido";
			
		}else if(this.getPeso()<=70.3) {
			this.categoria = "Leve";
			
		}else if(this.getPeso()<=83.9) {
			this.categoria = "Medio";
		}else if(this.getPeso()<=120.2) {
			this.categoria = "Pesado";
		}else this.categoria = "Invalido";
	
	}

	public int getVitorias() {
		return this.vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return this.derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return this.empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	//*************** FIM GETTERS E SETTERS ***********
	
	
	
	

}
