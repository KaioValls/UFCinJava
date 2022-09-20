import java.util.Scanner;

public class ExecutandoClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		int lutador1,lutador2;
		
		
		Lutador l[] = new Lutador[4];
		
		for(int i = 0; i<l.length; i++) {
			System.out.println((i+1)+"° Lutador");
			l[i] = new Lutador();
		}
		
		
		
		for(int i = 0; i<l.length; i++) {
			System.out.println("Lutador "+(i+1)+"°:  "+l[i].getNome());
		}
		
		String resposta;
		int repetir=0;
		while( repetir == 0) {
			
			System.out.println();	
			System.out.println("Digite o numero do lutador que irá desafiar o outro para uma luta:");
			lutador1 = tec.nextInt()-1; // subtraindo um pois vetor começa com 0
			System.out.println("Digite o numero do segundo lutador que irá lutar:");
			lutador2 = tec.nextInt()-1;
			
			Luta luta1 = new Luta();
			luta1.marcarLuta(l[lutador1], l[lutador2]);
			luta1.lutar();
			
			System.out.println("Lutar novamente? S || N");
			resposta = tec.next();
			if(resposta.equalsIgnoreCase("S")) {
				repetir=0;
			}else repetir=1;
			
		
		}
		
		System.out.println("Resultado final:");
		for(int i = 0; i<l.length; i++) {
			l[i].status();
		}
	}

}
