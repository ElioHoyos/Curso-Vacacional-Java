/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivos;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ELIOT
 */
public class Positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> nums3 = Arrays.asList(5, -7, 9);
        boolean todosPositivos = nums3.stream()
                                     .allMatch(n -> n > 0);
        System.out.println("4. ¿Todos positivos?: " + todosPositivos);
    }
    
}
