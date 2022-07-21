package contador;
import java.util.Scanner;

public class ContaVogais {
	
	public static int contador(String str) {
		
		char v;
		
		int vowels=0;
		
		for(int i=0;i<str.length();i++) {
			v=str.charAt(i);
			 
			switch(v) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowels++;
				break;
				
			}
			}
		return vowels;
	}
	
		
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("digite uma string");
		String str= scan.nextLine();
		
		System.out.println("String: ("+str+") = " + contador(str));
	}
		

	
}
