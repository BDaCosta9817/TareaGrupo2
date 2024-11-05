/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.citas;

public class Persona {
    private final String nombre;
    private final int edad;
    private final String genero;
    private final String direccion;
    private final String cinta;

    public Persona(String nombre, int edad, String genero, String direccion, String cinta) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.cinta = cinta;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Direccion: " + direccion);
        System.out.println("Cinta: " + cinta);
    }
}

