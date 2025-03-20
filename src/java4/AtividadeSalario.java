package java4;

import java.util.Scanner;

public class AtividadeSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        //
          float salariobruto;
          float adicionalnoturno;
          float horasextras;
          float descontos;
          float salarioliquido;
          
        System.out.print("digite seu salario bruto :");
        salariobruto = ler.nextFloat();
        
        System.out.print("digite seu adicional noturno :");
        adicionalnoturno = ler.nextFloat();
        
        System.out.print("digite suas horas extras :");
        horasextras = ler.nextFloat();
        
        System.out.print("digite os descontos : ");
        descontos = ler.nextFloat();
        
        salarioliquido = (salariobruto + adicionalnoturno + (horasextras * 5 )- descontos);
        
        System.out.printf("seu salario liquido è %.1f", salarioliquido); 
       
	}

}
