package javaaula;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		System.out.println("Digite a idade do seu cachorro: ");
		Scanner in = new Scanner(System.in);
		int idadeC = in.nextInt();
		idadeC = idadeC*7;
		System.out.println("O seu cachorro tem "+ idadeC + " anos");
	}

}

