package programservice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ELIOT
 */
public class BotonLambda {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Botón Funcional");
        JButton btn = new JButton("¡Haz clic!");
        
        // Lambda para el evento
        btn.addActionListener(e -> 
            JOptionPane.showMessageDialog(frame, "¡Funciones lambda en Swing!")
        );
        
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(btn);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
