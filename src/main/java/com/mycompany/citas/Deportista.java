/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citas;

/**
 *
 * @author UserCP
 */
package com.mycompany.deportista;

/**
 *
 * @author DELL VOSTRO
 */
public class Deportista extends Persona {
    private final String deporte;
    private final int habilidad;

    public Deportista(String nombre, int edad, String genero, String direccion, String cinta, String deporte, int habilidad) {
        super(nombre, edad, genero, direccion, cinta);
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
