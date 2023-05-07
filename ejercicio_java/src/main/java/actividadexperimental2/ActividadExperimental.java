package actividadexperimental2;

import java.util.Scanner;

public class ActividadExperimental {

    public static void main(String[] args) {
        int menu;
        int numProfesores;
        int numCarreras;
        int numSemestres;
        int materias;
        int numUniversidades = 0;
        String nombre;
        String nombreC;
        String modalidad;
        String siglas;
        String dirección;

        Universidad[] arregloU = new Universidad[5];

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("===Registro de Universidades del Ecuador===");
            System.out.println("1. Nueva Universidad");
            System.out.println("2. Ver Universidades");
            System.out.println("3. Salir");
            System.out.println("Elija una opción:");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                System.out.println("");
                System.out.println("===Datos de la Universidad===");
                System.out.println("Escriba el nombre:");
                nombre = sc.nextLine();

                System.out.println("Ingrese las siglas que identifican a la Universidad");
                siglas = sc.next();
                sc.nextLine();

                System.out.println("Escriba la dirección del campus matríz de la Universidad");
                dirección = sc.nextLine();

                System.out.println("Ingrese la cantidad de profesores de la Universidad:");
                numProfesores = sc.nextInt();

                Universidad universidad = new Universidad(nombre, siglas, dirección, numProfesores);

                System.out.println("Especifique la cantidad de carreras que desea ingresar:");
                numCarreras = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < numCarreras; i++) {
                    System.out.println("Escriba el nombre de la carrera:");
                    nombreC = sc.nextLine();
                    System.out.println("¿Qué modalidad es la carrera?");
                    modalidad = sc.next();
                    System.out.println("Ingrese la cantidad de semestres que dura la carrera:");
                    numSemestres = sc.nextInt();
                    System.out.println("Ingrese la cantidad de materias que ofrece la carrera:");
                    materias = sc.nextInt();
                    sc.nextLine();
                    Carrera carrera = new Carrera(nombreC, modalidad, numSemestres, materias);

                    universidad.getArreglo_C()[i] = carrera;

                }

                arregloU[numUniversidades] = universidad;
                numUniversidades++;

            }
            if (menu == 2) {
                System.out.println("");
                System.out.println("======Universidades======");
                
                for (int i = 0; i < numUniversidades; i++) {
                    
                    System.out.println(arregloU[i].getSiglas()+" "+arregloU[i].getNombre());
                    System.out.println("Número de profesores: "+ arregloU[i].getNumProfesores());
                }
            }

        } while (menu != 3);
    }
}
