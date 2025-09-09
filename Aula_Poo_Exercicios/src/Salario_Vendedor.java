
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jmelo
 */
public class Salario_Vendedor {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer matricula; 
        Double salario_fixo, salario_total, total_vendas, percentual_vendas, percentual;
        
        System.out.println("Digite a matricula (4 números do crachá): ");
        matricula = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite o valor do seu salário fixo: ");
        salario_fixo = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite o valor total de vendas que você ja efetuou: ");
        total_vendas = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite o valor do percentual ganho em cada venda: ");
        percentual_vendas = Double.parseDouble(sc.nextLine());
         
        
        percentual = (total_vendas/ percentual_vendas)/100 ;
        
        salario_total = (salario_fixo * percentual) + salario_fixo;
        
        System.out.println("Número do vendedor: " + matricula);
        System.out.println("Salário do vendedor: " + salario_total);
        
      
    }
}
