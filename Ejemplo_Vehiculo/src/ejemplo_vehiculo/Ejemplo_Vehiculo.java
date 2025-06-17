package ejemplo_vehiculo;

public class Ejemplo_Vehiculo {

    public static void main(String[] args) {
        Vehiculo c = new Coche();
        c.arrancar();
        System.out.println("----------------------");
        Vehiculo m = new Motocicleta();
        m.arrancar();
    }
    
}
