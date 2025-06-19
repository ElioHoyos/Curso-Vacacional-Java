/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filtrarpalabrasa;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ELIOT
 */
public class FiltrarPalabrasA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> palabras = Arrays.asList("Java", "amigo", "funcional", "Ala");
        List<String> resultado = palabras.stream()
                                        .filter(p -> p.substring(0, 1).equalsIgnoreCase("A"))
                                        .map(String::toUpperCase)
                                        .toList();
        System.out.println("2. Palabras con A: " + resultado);
    }
    
}
