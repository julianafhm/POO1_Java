import java.util.Scanner;
/*
 Faça um algoritmo programa que leia 2 inteiros e imprima o ^2 quadrado da diferença do 1° valor pelo 2°, e a diferença dos quadrados dos números.
 */

/**
 *
 * @author Jmelo
 */
public class Leitura_Inteiros {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Integer a, b, diferenca;
        
        System.out.println("Digite um inteiro: ");
        a = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite outro inteiro ");
         b = Integer.parseInt(sc.nextLine());
        
         diferenca = a - b;
        System.out.println("quadrado da diferença do 1° valor pelo 2°: " + Math.pow(diferenca, 2));
        
        System.out.println("diferença dos quadrados dos números: " + (Math.pow(a, 2) - Math.pow(b, 2)));
    }
}
