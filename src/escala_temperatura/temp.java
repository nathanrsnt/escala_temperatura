package escala_temperatura;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		
		Scanner menu = new Scanner (System.in);
		
		double f, c, k;
		
		System.out.println("-----IMPLEMENTAÇÃO ESCALA DE TEMPERATURA-----");
		System.out.println("1 - K");
		System.out.println("2 - C");
		System.out.println("3 - F");
		System.out.println("Selecione uma opção: ");
		int opcao = menu.nextInt();
		
		switch(opcao) {
		case 1:
			//K
			System.out.println("Digite a temperatura");
			k = menu.nextDouble();
			c =(double) k-273;
			f =(double)32 + 9/5 * (k-273);
			System.out.println("C: " + c);
			System.out.println("F: " + f);
			break;
		case 2:
			//C
			System.out.println("Digite a temperatura");
			c = menu.nextDouble();
			k = (double)c + 273;
			f = (double)(c * 9/5 ) + 32 ;	
			System.out.println("K: " + k);
			System.out.println("F: " + f);
			break;
		case 3:
			//F
			System.out.println("Digite a temperatura");
			f = menu.nextDouble();
			c = (double)5/9 * (f-32);
			k = (double)273 + 5/9 * (f-32);
			System.out.println("C: " + c);
			System.out.println("K: " + k);
			break;
		}	
	}

}
