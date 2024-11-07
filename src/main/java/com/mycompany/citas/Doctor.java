
package com.mycompany.citas;

import java.util.Scanner;

public class Doctor extends Persona {
    private String especialidad;
    private String fechaCita;

    public Doctor(String nombre, int edad, String genero, String direccion, String cinta) {
        super(nombre, edad, genero, direccion, cinta);  
        this.especialidad = "";
        this.fechaCita = "";
    }

    public void elegirEspecialidad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la especialidad del doctor:");
        System.out.println("1. Odontologia");
        System.out.println("2. Neurologia");
        System.out.println("3. Pediatria");
        System.out.println("4.Doctor General");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                especialidad = "Odontologia";
                break;
            case 2:
                especialidad = "Neurologia";
                break;
            case 3:
                especialidad = "Pediatria";
                break;
            case 4:
                especialidad = "Doctor General";
                break;
            default:
                System.out.println("Opcion no valida.");
        }

        if (!especialidad.isEmpty()) {
            System.out.println("Especialidad seleccionada: " + especialidad);
        }
    }

    public void elegirFechaCita() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el dia para la cita:");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");

        int dia = sc.nextInt();
        String diaSeleccionado = "";

        switch (dia) {
            case 1:
                diaSeleccionado = "Lunes";
                break;
            case 2:
                diaSeleccionado = "Martes";
                break;
            case 3:
                diaSeleccionado = "Miercoles";
                break;
            case 4:
                diaSeleccionado = "Jueves";
                break;
            case 5:
                diaSeleccionado = "Viernes";
                break;
            default:
                System.out.println("Opción no valida:(");
        }

        if (!diaSeleccionado.isEmpty()) {
            System.out.print("Ingrese la fecha para la cita (formato YYYY-MM-DD): ");
            sc.nextLine(); 
            fechaCita = diaSeleccionado + ", " + sc.nextLine();
            System.out.println("Cita programada para: " + fechaCita);
            
        }
    }

    public void mostrarDetalles() {
        mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Fecha de la cita: " + fechaCita);
    }

    public String getEspecialidad() {
        return especialidad;
    }
}



