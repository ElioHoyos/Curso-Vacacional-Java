/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productolista;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ELIOT
 */
public class ProductoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> nums2 = Arrays.asList(2, 3, 4);
        int producto = nums2.stream()
                           .reduce(1, (a, b) -> a * b);
        System.out.println("3. Producto: " + producto);
    }
    
}
