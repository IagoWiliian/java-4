package java4;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float n1f , n2f , n3f , n4f , media;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("digite a nota 1:");
         n1f = ler.nextFloat();
        
        System.out.print("digite a nota 2:");
         n2f = ler.nextFloat();
        
        System.out.print("digite a nota 3:");
         n3f = ler.nextFloat();
        
        System.out.print("digite a nota 4:");
         n4f = ler.nextFloat();
        
        media = (n1f + n2f + n3f + n4f )/4;
        
        System.out.printf("A sua media è  %.1f", media);
        
        
        
	}

}
