/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programservice;

import java.util.Optional;

/**
 *
 * @author ELIOT
 */
public class usuario {
    private Optional<String> nombre;
    private boolean activo;
    
    public usuario(Optional<String> nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }
    
    public Optional<String> getNombre() { return nombre; }
    public boolean estaActivo() { return activo; }
}
