
package revisaoav1;
import java.util.Scanner;
 
public class Sapato extends Tipo{
    String modelo;
    public Sapato(){}

    public Sapato(String m, String c, double p, int t, boolean cd, String mod){
        super(m, c, p, t, cd);
        setModelo(mod);
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Modelo: " + getModelo());
    }
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Modelo: ");
        setModelo(ent.nextLine());
    }
    public void cadastrar(String m, String c, double p, int t, boolean cd, String mod){
        cadastrar(m, c, p, t, cd);
        setModelo(mod);
    }
}