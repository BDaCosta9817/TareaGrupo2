/*
 * Blanca Da Costa Gomez Carcamo
 */


package com.mycompany.citas;

import java.util.ArrayList;
import java.util.Scanner;

public class Citas {

    private static final ArrayList<Persona> citasProgramadas = new ArrayList<>();

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
                
                // Preguntar si desea ingresar otra cita
                System.out.println("Desea ingresar otra cita :) (s/n)");
                String respuesta = scanner.next();
                continuar = respuesta.equalsIgnoreCase("s");
                scanner.nextLine(); 
            }   System.out.println("\nCitas programadas:");
            for (Persona persona : citasProgramadas) {
                if (persona instanceof Doctor) {
                    ((Doctor) persona).mostrarDetalles();
                } else if (persona instanceof Deportista) {
                    ((Deportista) persona).mostrarDetalles();
                }
                System.out.println("------------------");
            }   mostrarResumen();
            
        }
    }

    private static void mostrarResumen() {
        System.out.println("\nResumen de Citas Programadas:");
        for (Persona persona : citasProgramadas) {
            System.out.print("Nombre: " + persona.getNombre() + ", Tipo de cita: ");
            if (persona instanceof Doctor) {
                System.out.println("Doctor, Especialidad: " + ((Doctor) persona).getEspecialidad());
            } else if (persona instanceof Deportista) {
                System.out.println("Deportista, Deporte: " + ((Deportista) persona).getDeporte());
            }
        }
    }
}

