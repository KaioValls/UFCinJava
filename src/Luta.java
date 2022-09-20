import java.util.Random;

public class Luta {

	Random aleatorio = new Random();
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	//Metodos
	public void marcarLuta(Lutador l1,Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria()&& l1!=l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	
	public void lutar() {
		if(this.getAprovada()==true) {
			int vencedor;
			this.getDesafiado().apresentar();
			this.getDesafiante().apresentar();
			vencedor = aleatorio.nextInt(0,3);
			
			System.out.println("_______________________");
			if(vencedor == 0) {
				System.out.println("EMPATOU!!");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
			}else if(vencedor == 1) {
				
				System.out.println(this.getDesafiado().getNome()+ " Ganhou! (Desafiado)");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
			}else {
				System.out.println(this.getDesafiante().getNome()+" Ganhou! (Desafiante)");
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
			}
			System.out.println("_______________________");
			
		}else {		
			System.out.println("Luta não pode acontecer");
		}
	}
	
	
	

	//Metodos Especiais
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return this.rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return this.aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
