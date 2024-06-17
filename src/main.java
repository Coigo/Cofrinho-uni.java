import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	    Cofinho cofre = new Cofinho();

	    while (true) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Valor a adicionar");
	        Double valor = scanner.nextDouble(); 
	        scanner.close(); 

	        cofre.adicionarAoCofre("dolar", valor);
	    }
	}


}
