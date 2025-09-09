import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jmelo
 */
public class Conversao_Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double valor_real, taxa_dolar, conversao; 
        
        System.out.println("Digite o valor do real para a conversão: ");
        valor_real = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite o valor do dólar hoje: ");
        taxa_dolar = Double.parseDouble(sc.nextLine());
        
        
        conversao = valor_real * taxa_dolar;
        System.out.println("valor comvertido em dólar: " + conversao + "$");
        
      
    }
}
