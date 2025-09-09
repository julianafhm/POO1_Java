/*Programam que calcula a qtd. de litros de combustivel gasto em uma viagem. Entradas: tempo gasto de viagem, velocidade media.
Calculos: distancia, litros usados*/

import java.util.Scanner;


public class Aula_04_09_2025 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Float tempo, distancia, velocidade, litros_usados;
        
        System.out.println("Digite o tempo total(h) de viagem: ");
        tempo = Float.parseFloat(sc.nextLine());
        
        System.out.println("Digite a velocidade média da viagem: ");
        velocidade = Float.parseFloat(sc.nextLine());
        
        /*fazer calculo separado -> definindo litros_usados e distancia*/
       
        distancia = tempo * velocidade;
        /*System.out.println(distancia);*/
        
        litros_usados = distancia/12;
        /*System.out.println(litros_usados);*/
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("A velocidade média da viagem: " + velocidade + "km/h");
        System.out.println("Tempo de viagem: "+ tempo + "h");
        System.out.println("A distância percorrida na viagem: "+ distancia +"km");
        System.out.println("A quantidade de combustivel utilizada: " + litros_usados +"L" );
      

        
   
        
        
    }
}
