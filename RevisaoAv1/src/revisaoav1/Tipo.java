
package revisaoav1;
import java.util.Scanner;
 
public class Tipo extends Calcado{
    boolean cadarco;
    public Tipo(){}
    public Tipo(String m, String c, double p, int t, boolean cd){
        super(m, c, p, t);
        setCadarco(cd);
    }
    public boolean getCadarco(){
        return cadarco;
    }
    public void setCadarco(boolean cadarco){
        this.cadarco = cadarco;
    }

    public void imprimir(){
        super.imprimir();
        if (cadarco){
            System.out.println("Possui cadarço");
        }  else{
        System.out.println("Não possui cadarço");
        }
     }

    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entrada();
    System.out.println("Possui cadarço? (1-sim, 2-não)");
        int i = Integer.parseInt(ent.nextLine());
        if (i==1){
            setCadarco(true);
        }
        else{
            setCadarco(false);
        }   
    }
    
    
    public void cadastrar(String m, String c, double p, int t, boolean cd){
         super.cadastrar(m, c, p, t);
         setCadarco(cd);
    }
}