/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoav1;

import java.util.Scanner;
 
public class Tenis extends Tipo{
    boolean esportivo;
    public Tenis(){}
    public Tenis(String m, String c, double p, int t, boolean cd, boolean es){
        super(m, c, p, t, cd);
        setEsportivo(es);
    }
    public boolean getEsportivo(){
        return esportivo;
    }
    public void setEsportivo(boolean esportivo){
        this.esportivo = esportivo;
    }
    public void imprimir(){
        super.imprimir();
        if (esportivo){
            System.out.println("É tenis esportivo");
        }  else{
        System.out.println("não é tenis esportivo");
        }
    }
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entrada();
    System.out.println("´É tênis esportivo? (1-sim, 2-não)");
        int i = Integer.parseInt(ent.nextLine());
        if (i==1){
            setEsportivo(true);
        }
        else{
            setEsportivo(false);
        } 
    }
    public void cadastrar(String m, String c, double p, int t, boolean cd, boolean es){
        cadastrar(m, c, p, t, cd);
        setEsportivo(es);
    }
}