/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumacuadrado;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ELIOT
 */
public class SumaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int suma = numeros.stream()
                          .filter(n -> n % 2 == 0)
                          .mapToInt(n -> n * n)
                          .sum();
        
        System.out.println("Resultado: " + suma); // Output: 20
    }
    
}
