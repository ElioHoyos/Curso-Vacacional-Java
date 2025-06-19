package EduTec.View;

import EduTec.Service.LibreriaPromedio;

/**
 *
 * @author ELIO HOYOS
 */
public class AppPrueba {
    public static void main(String[] args) {
        //calcular promedio para 2 números
        System.out.println("Promedio de 2 números (5,7) " + LibreriaPromedio.calcularPromedio(5, 7));
        //calcular promedio para 3 números
        System.out.println("Promedio de 3 números (10,20,30) " + LibreriaPromedio.calcularPromedio(10, 20,30));
        //calcular promedio para 4 números
        System.out.println("Promedio de 4 números (2,4,6,8) " + LibreriaPromedio.calcularPromedio(2, 4,6,8));
        //calcular promedio decimales
        System.out.println("Promedio de 3 números (2.5,3.5,4.5) " + LibreriaPromedio.calcularPromedio(2.5, 3.5,4.5));
        //calcular promedio decimales
        System.out.println("Promedio de 5 números (3,6,9,12,15) " + LibreriaPromedio.calcularPromedio(3, 6,9,12,15));
    }
}
