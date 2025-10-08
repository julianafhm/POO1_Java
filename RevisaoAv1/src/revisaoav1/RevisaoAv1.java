
package revisaoav1;

public class RevisaoAv1 {
    
    public static void main(String[] args) {
        Chinelo c1 = new Chinelo("Havaianas", "azul", 25.00, 39, true, true );
        
        Chinelo c2 = new Chinelo("Ipanema", "Rosa", 19.99, 36, true, true );
 
        Chinelo c3 = new Chinelo("Farm", "Preto e Laranja", 79.00, 39, true, true );
    
        
        
        
        Sapato s1 = new Sapato ("Nike", "Branco", 800.00, 43, true, "AF1");

        Sapato s2 = new Sapato ("Adidas", "Branco e cinza", 700.00, 39, true, "Samba");
        
        Sapato s3 = new Sapato ("Puma", "Preto e Branco", 380.00, 39, true, "Carina BDP");

        
        
        
        Tenis t1 = new Tenis("Asics", "Roxo e Branco", 899.00, 38, true, true);
        
        Tenis t2 = new Tenis("Olympikus", "Preto", 599.00, 38, true, true);

        Tenis t3 = new Tenis("Nike", "Laranja e Branco", 299.00, 37, true, true);
        
        
        
        
        c1.imprimir();
        System.out.println("----------------------------------------------");
        c2.imprimir();
        System.out.println("----------------------------------------------");
        c3.imprimir();
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        
        s1.imprimir();
        System.out.println("----------------------------------------------");
        s2.imprimir();
        System.out.println("----------------------------------------------");
        s3.imprimir();
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        
        t1.imprimir();
        System.out.println("----------------------------------------------");
        t2.imprimir();
        System.out.println("----------------------------------------------");
        t3.imprimir();
        System.out.println("----------------------------------------------");
        
    }
}
    
