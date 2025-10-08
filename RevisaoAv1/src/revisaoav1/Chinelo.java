package revisaoav1;
import java.util.Scanner;

public class Chinelo extends Calcado {
    boolean acessorio, tiras;
    
    public Chinelo(){}
    public Chinelo(String m, String c, double p, int t, boolean a, boolean tr){
        super(m, c, p, t);
        setAcessorio(a);
        setTiras(tr);
    }
    
    public boolean getAcessorio(){
        return acessorio;
    }
    
    public void setAcessorio(boolean acessorio){
        this.acessorio = acessorio;
    }

    
    public boolean getTiras(){
        return tiras;
    }
    
    public void setTiras(boolean tiras){
        this.tiras = tiras;
    }

    
    @Override
    public void imprimir(){
        super.imprimir();
        if (acessorio){
            System.out.println("possui acessorio");
        }  else{
        System.out.println("n possui acessorio");
        }
        if (tiras){
            System.out.println("possui tiras");
        }  else{
        System.out.println("n possui tiras");
        }
    }   
    @Override
    public void entrada(){
        super.entrada();
        Scanner ent = new Scanner(System.in);
        System.out.println("Possui acessório? (1-sim, 2-não)");
        int i = Integer.parseInt(ent.nextLine());
        if (i==1){
            setAcessorio(true);
        }
        else{
            setAcessorio(false);
        }

        System.out.println("Possui tiras? (1-sim, 2-não)");
        i = Integer.parseInt(ent.nextLine());
        if (i==1){
            setTiras(true);
        }
        else{
            setTiras(false);
        }
    }
     public void cadastrar(String m, String c, double p, int t, boolean a, boolean tr){
         super.cadastrar(m, c, p, t);
         setAcessorio(a);
         setTiras(tr);
    }
}