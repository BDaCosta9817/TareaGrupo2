
package com.mycompany.citas;

import java.util.Scanner;

public class Doctor extends Persona {
    private String especialidad;
    private String fechaCita;

   
    public Doctor(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);  
        this.especialidad = "";
        this.fechaCita = "";
    }

   
    public void elegirEspecialidad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la especialidad del doctor:");
        System.out.println("1. Odontología");
        System.out.println("2. Neurología");
        System.out.println("3. Pediatría");
        System.out.println("4. Ginecología");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                especialidad = "Odontología";
                break;
            case 2:
                especialidad = "Neurología";
                break;
            case 3:
                especialidad = "Pediatría";
                break;
            case 4:
                especialidad = "Ginecología";
                break;
            default:
                System.out.println("Opción no válida.");
        }

        
        if (!especialidad.isEmpty()) {
            System.out.println("Especialidad seleccionada: " + especialidad);
        }
    }

    
    public void elegirFechaCita() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el día para la cita:");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
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
                diaSeleccionado = "Miércoles";
                break;
            case 4:
                diaSeleccionado = "Jueves";
                break;
            case 5:
                diaSeleccionado = "Viernes";
                break;
            default:
                System.out.println("Opción no válida.");
        }

        
        if (!diaSeleccionado.isEmpty()) {
            System.out.print("Ingrese la fecha para la cita (formato YYYY-MM-DD): ");
            Scanner fechaScanner = new Scanner(System.in);
            fechaCita = diaSeleccionado + ", " + fechaScanner.nextLine();
            System.out.println("Cita programada para: " + fechaCita);
        }
    }

    
    public void mostrarDetalles() {
        mostrarDatos();  
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Fecha de la cita: " + fechaCita);
    }
}



