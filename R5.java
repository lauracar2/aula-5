import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Scanner nome = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome1 = nome.nextLine();
		
	    System.out.println("Digite a sua idade: ");
	    double nom2 = entrada.nextDouble();		
	    
	   System.out.println(" Nacionalidade: ");
	   String nome3 = nome.nextLine();
	   
	   if(nom2 >= 18) {
		   
		   System.out.println("Aprovado!!!!!!");
	   }
	   else if(nom2 <= 18) {
		  
		   System.out.println(" Parabéns você foi Reprovado!! ");
		   
	   }
	}

}
