
import java.util.Scanner;

/*
 Calcular e a apresentar o valor do volume 
de uma lata de óleo c/ a formula: VOLUME = 3.14159 * R^2(ao quadrado) * Altura
 */

/**
 *
 * @author Jmelo
 */
public class Volume_Lata {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Double volume, pi = 3.14159, altura, raio;
        System.out.println("Digite a altura da lata: ");
        altura = Double.parseDouble(sc.nextLine());
       
        System.out.println("Digite o raio da lata: ");
         raio = Double.parseDouble(sc.nextLine());
        
         /*Math.pow(base, expoente)*/
        
         
         volume = pi * Math.pow(raio, 2) * altura;
                 
         
        System.out.println("Volume da lata: " + volume);
        
       
    }
}
