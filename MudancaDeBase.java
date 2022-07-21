package lista01;
import java.util.Scanner;
public class MudancaDeBase {

	
	public static int mudancaBase(int n) {
		if (n==0 || n==1) {
			return n;
		}
		else {
			return n%2 + mudancaBase(n/2)*10;
		}
		
	
	}

	public static void main(String [] args){ 
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite o numero a ser convertido");
		int n=scan.nextInt();
		
		System.out.println("mudanca de Base Decimal("+n+") = " + mudancaBase(n));
	}


}