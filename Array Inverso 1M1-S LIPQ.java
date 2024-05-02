import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

        // Invertir el array
        int[] arrayInvertido = invertirArray(array);

        System.out.println("Mostrar array invertido:");
        Mostrar(arrayInvertido);
    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

        //Hay que hacer que mire bonito

    }

    // Método para invertir el array
    public static int[] invertirArray(int[] array) {
        int n = array.length;
        int[] arrayInvertido = new int[n];

        for (int i = 0; i < n; i++) {
            arrayInvertido[i] = array[n - i - 1];
        }

        return arrayInvertido;

    }
}  
//Luis Israel Perez Quintero
// GRUPO:1M1-S
    

        