/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoav1;

import java.util.Scanner;
 
 
public class Calcado {
    String marca, cor;
    double preco;
    int tamanho;

    public Calcado(){}
    public Calcado(String m, String c, double p, int t){
       setMarca(m);
       setCor(c);
       setPreco(p);
       setTamanho(t);
   }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }   

    public int getTamanho(){
            return tamanho;
        }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
 
 
    public void imprimir(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: " + getPreco());
        System.out.println("Cor: " + getCor());
        System.out.println("Tamanho" + getTamanho());
    }
    public void entrada(){
        Scanner ent = new Scanner (System.in);
        System.out.println("Marca: ");
        setMarca(ent.nextLine());
        System.out.println("Preço: ");
        setPreco(Double.parseDouble(ent.nextLine()));
        System.out.println("Cor: ");
        setCor(ent.nextLine());
        System.out.println("Tamanho: ");
        setTamanho(Integer.parseInt(ent.nextLine()));
    }
 
    
    public void cadastrar(String m, String c, double p, int t ){
        setMarca(m);
        setCor(c);
        setPreco(p);
        setTamanho(t);
    }
}
