package uno;

/**
 *
 * @author ELIOT
 */
public class ClaseA {
    
    private int n1;
    int n2;
    protected int n3;
    public int n4;
    
    //inicializar
    public ClaseA(){
        n1 = 20;
        n2 = 30;
        n3 = 40;
        n4 = 50;
    }
    
    public void metodoA(){
        System.out.println("n1 " + n1);
        System.out.println("n2 " + n2);
        System.out.println("n3 " + n3);
        System.out.println("n4 " + n4);
    }
    
}
