/*La Subclase Deportista permite representar y gestionar información de deportista
 * manteniendo una relación de herencia con la clase Persona para aprovechar los atributos y métodos comúnes.
 * 
 */

package com.mycompany.citas;

public class Deportista extends Persona {
    private final String deporte;
    private final int habilidad;

    public Deportista(String nombre, int edad, String genero, String direccion, String cita, String deporte, int habilidad) {
        super(nombre, edad, genero, direccion, cita);
        this.deporte = deporte;
        this.habilidad = habilidad;
    }

    public String getDeporte() {
        return deporte;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void mostrarDetalles() {
        mostrarInformacion();
        System.out.println("Deporte: " + deporte);
        System.out.println("Nivel de habilidad: " + habilidad);
    }
}
