package java4;

import java.util.Scanner;

public class ValoresDiferencas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         float n1f, n2f, n3f, n4f, diferenca;
         Scanner ler = new Scanner(System.in);
         
         
         System.out.print("digite a primeira nota:");
         n1f = ler.nextFloat();
         
         System.out.print("digite a segunda nota:");
         n2f = ler.nextFloat();
          
         System.out.print("digite a terceira nota:");
         n3f = ler.nextFloat();
          
         System.out.print("digite a quarta nota:");
         n4f = ler.nextFloat();
         
         diferenca = (n1f * n2f)-(n3f * n4f);
         
         System.out.printf("A diferença é %.1f", diferenca);
         ler.close();
	}

}
