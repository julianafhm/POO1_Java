
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jmelo
 */
public class Area_Forma {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Double largura, altura, profundidade,area, volume;

        System.out.println("diga o valor da largura:");
        largura=Double.parseDouble(sc.nextLine());
        
        System.out.println("diga o valor da altura: ");
        altura=Double.parseDouble(sc.nextLine());
        
        area = largura * altura;
        
        System.out.println("O valor da área é:" + area);
        
        System.out.println("diga o valor da profundidade:");
        profundidade=Double.parseDouble(sc.nextLine());
        
        System.out.println("diga o valor da area citada anteriormente:");
        area=Double.parseDouble(sc.nextLine());
        
        volume = area * profundidade;
        System.out.println("O volume da figura é de:" + volume +"m3");
    }
}
