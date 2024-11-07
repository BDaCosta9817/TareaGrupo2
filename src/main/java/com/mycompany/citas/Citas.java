/*
 * Blanca Da Costa Gomez Carcamo
 *04/11/2024
 * Nuestro programa consiste en permitir que el   usuario agende una cita ingresando sus datos personales. El usuario podrá elegir entre dos tipos de cita con un doctor o 
 *como deportista. Si elige la cita con el doctor, podrá seleccionar la especialidad médica m y elegir el día de la cita  en el caso de la cita para deportista podrá seleccionar
 *el deporte que practica, la fecha de la cita  y especificar su nivel de habilidad en ese deporte. Al final, todas las citas programadas se mostrarán en pantalla.
 */

package com.mycompany.citas;

import java.util.ArrayList;
import java.util.Scanner;

public class Citas {

    private static final ArrayList<Persona> citasProgramadas = new ArrayList<>();
   // Permitimos que el usuario llene las casillas para programar su cita
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            while (continuar) {
                System.out.println("Ingrese su nombre:");
                String nombre = scanner.nextLine();
                
                System.out.println("Ingrese su edad:");
                int edad = scanner.nextInt();
                scanner.nextLine(); 
                
                System.out.println("Ingrese su genero:");
                String genero = scanner.nextLine();
                
                System.out.println("Ingrese su direccion:");
                String direccion = scanner.nextLine();
                
                System.out.println("Ingrese el numero de su cinta:");
                String cinta = scanner.nextLine();
                
                System.out.println("Seleccione el tipo de cita: 1. Doctor  2. Deportista");
                int tipoCita = scanner.nextInt();
                
                switch (tipoCita) {
                    case 1:
                        Doctor doctor = new Doctor(nombre, edad, genero, direccion, cinta);
                        doctor.elegirEspecialidad();
                        doctor.elegirFechaCita();
                        citasProgramadas.add(doctor);
                        break;
                    case 2:
                        scanner.nextLine(); // 
                        System.out.println("Ingrese el deporte que practica:");
                        String deporte = scanner.nextLine();
                        System.out.println("Ingrese su nivel de habilidad (1-5):");
                        int habilidad = scanner.nextInt();
                        Deportista deportista = new Deportista(nombre, edad, genero, direccion, cinta, deporte, habilidad);
                        citasProgramadas.add(deportista);
                        break;
                    default:
                        System.out.println("Tipo de cita no válido.");
                        break;
                }
                
              

