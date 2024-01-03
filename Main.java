import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Main 
{
    // Variables para Bubble sort
    static int numPasadasBur = 0;
    static int interaccionesBur = 0;
    static long elapsedTimeBur = 0;

    // Variables para Selection sort
    static int numPasadasSel = 0;
    static int interaccionesSel = 0;
    static long elapsedTimeSel = 0;

    // Variables para Insertion sort
    static int numPasadasInsD = 0;
    static int interaccionesInsD = 0;
    static long elapsedTimeInsD = 0;

    // Variables para Binary insertion sort
    static int numPasadasInsB = 0;
    static int interaccionesInsB = 0;
    static long elapsedTimeInsB = 0;

    // Variables para Shell sort
    static int numPasadasShell = 0;
    static int interaccionesShell = 0;
    static long elapsedTimeShell = 0;

    // Variables para Quick sort
    static int numPasadasQuick = 0;
    static int interaccionesQuick = 0;
    static long elapsedTimeQuick = 0;

    // Variables para Heap sort
    static int numPasadasHeap = 0;
    static int interaccionesHeap = 0;
    static long elapsedTimeHeap = 0;

    // Variables para Direct exchange sort
    static int numPasadasIntD = 0;
    static int numInteraccionesIntD = 0;
    static long durationIntD = 0;

    // Variables para comparar los metodos de ordenamiento
    static int mejorPasadas = 0;
    static String mejorPasadasNombre = "";
    static int mejorInteracciones = 0;
    static String mejorInteraccionesNombre = "";
    static long mejorTiempo = 0;
    static String mejorTiempoNombre = "";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        // Solicitar al usuario la cantidad de elementos en el arreglo
        System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
        int tamano = scanner.nextInt();

        // Crear el arreglo con el tamaño proporcionado por el usuario
        int[] arreglo = new int[tamano];

        // Solicitar al usuario elegir entre llenar manualmente o automáticamente
        System.out.println("¿Cómo desea llenar el arreglo?");
        System.out.println("1. Llenar manualmente");
        System.out.println("2. Llenar automáticamente con valores aleatorios");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            // Llenar manualmente
            for (int i = 0; i < tamano; i++) {
                System.out.print("Ingrese el valor para la posición " + i + ": ");
                arreglo[i] = scanner.nextInt();
            }
        } else if (opcion == 2) {
            // Llenar automáticamente con valores aleatorios
            for (int i = 0; i < tamano; i++) {
                arreglo[i] = (int) (Math.random()*100); 
            }
        } else {
            System.out.println("Opción no válida");
        }

        // Imprimir el arreglo
        System.out.println("Actualmente los datos no estan ordenados, su resultado es: [");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("]");

        System.out.println("Que desea hacer?");
        System.out.println("1. Ordenar el arreglo por un metodo a elegir: ");
        System.out.println("2. comparar los metodos de ordenamiento:"); 
        System.out.println("3. Salir del programa: ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                // Ordenar el arreglo
                System.out.println("seleccione el método de ordenamiento que desea utilizar:");
                System.out.println("1. Burbuja");
                System.out.println("2. Selección");
                System.out.println("3. Inserción directa");
                System.out.println("4. Inserción binaria");
                System.out.println("5. Shell");
                System.out.println("6. QuickSort");
                System.out.println("7. HeapSort");
                System.out.println("8. Intercambio directo");

                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        // Burbuja
                        burbuja(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasBur);
                        System.out.println("Número de interacciones: " + interaccionesBur);
                        System.out.println("Tiempo transcurrido: " + elapsedTimeBur + " milisegundos");
                        break;
                    case 2:
                        // Selección
                        seleccion(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasSel);
                        System.out.println("Número de interacciones: " + interaccionesSel);
                        System.out.println("Tiempo transcurrido: " + elapsedTimeSel + " milisegundos");
                        break;
                    case 3:
                        // Inserción directa
                        insercionDirecta(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasInsD);
                        System.out.println("Número de interacciones: " + interaccionesInsD);
                        System.out.println("Tiempo transcurrido: " + elapsedTimeInsD + " milisegundos");
                        break;
                    case 4:
                        // Inserción binaria
                        insercionBinaria(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasInsB);
                        System.out.println("Número de interacciones: " + interaccionesInsB);
                        System.out.println("Tiempo transcurrido: " + elapsedTimeInsB + " milisegundos");
                        break;
                    case 5: 
                        // Shell
                        shell(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasShell);
                        System.out.println("Número de interacciones: " + interaccionesShell);
                        System.out.println("Tiempo transcurrido: " + elapsedTimeShell + " milisegundos");
                        break;
                    case 6:
                        // QuickSort
                        quickSort(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasQuick);
                        System.out.println("Número de interacciones: " + interaccionesQuick);
                        System.out.println("Tiempo transcurrido: " + elapsedTimeQuick + " milisegundos");
                        break;
                    case 7:
                        // HeapSort
                        heapSort(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasHeap);
                        System.out.println("Número de interacciones: " + interaccionesHeap);
                        System.out.println("Tiempo transcurrido: " + elapsedTimeHeap + " milisegundos");
                        break;
                    case 8:
                        // Intercambio directo
                        intercambioDirecto(arreglo);
                        System.out.println("Número de pasadas: " + numPasadasIntD);
                        System.out.println("Número de interacciones: " + numInteraccionesIntD);
                        System.out.println("Tiempo transcurrido: " + durationIntD + " milisegundos");
                        break;
                
                    default:
                        break;
                }
                // Imprimir el arreglo
                System.out.println("Actualmente los datos estan ordenados, su resultado es:");
                for (int i = 0; i < tamano; i++) {
                    System.out.print(arreglo[i] + ", ");
                }
                break;
            case 2:
                burbuja(arreglo);
                seleccion(arreglo);
                insercionDirecta(arreglo);
                insercionBinaria(arreglo);
                shell(arreglo);
                quickSort(arreglo);
                heapSort(arreglo);
                intercambioDirecto(arreglo);

                // comparar los metodos de ordenamiento
                String[] columnas = {"Método", "Pasadas", "Interacciones", "Tiempo (m/s)"};
                String[][] datos = {
                    {"Método", "Pasadas", "Interacciones", "Tiempo"},
                    {"Burbuja", String.valueOf(numPasadasBur), String.valueOf(interaccionesBur), String.valueOf(elapsedTimeBur)},
                    {"Selección", String.valueOf(numPasadasSel), String.valueOf(interaccionesSel), String.valueOf(elapsedTimeSel)},
                    {"Inserción directa", String.valueOf(numPasadasInsD), String.valueOf(interaccionesInsD), String.valueOf(elapsedTimeInsD)},
                    {"Inserción binaria", String.valueOf(numPasadasInsB), String.valueOf(interaccionesInsB), String.valueOf(elapsedTimeInsB)},
                    {"Shell", String.valueOf(numPasadasShell), String.valueOf(interaccionesShell), String.valueOf(elapsedTimeShell)},
                    {"QuickSort", String.valueOf(numPasadasQuick), String.valueOf(interaccionesQuick), String.valueOf(elapsedTimeQuick)},
                    {"HeapSort", String.valueOf(numPasadasHeap), String.valueOf(interaccionesHeap), String.valueOf(elapsedTimeHeap)},
                    {"Intercambio directo", String.valueOf(numPasadasIntD), String.valueOf(numInteraccionesIntD), String.valueOf(durationIntD)}
                };
                System.out.println("Comparación de los métodos de ordenamiento");

                //Comparara pasadas
                if (numPasadasBur<numPasadasSel && numPasadasBur<numPasadasInsD && numPasadasBur<numPasadasInsB && numPasadasBur<numPasadasShell && numPasadasBur<numPasadasQuick && numPasadasBur<numPasadasHeap && numPasadasBur<numPasadasIntD) {
                    mejorPasadas = numPasadasBur;
                    mejorPasadasNombre = "Burbuja";
                } else if (numPasadasSel<numPasadasBur && numPasadasSel<numPasadasInsD && numPasadasSel<numPasadasInsB && numPasadasSel<numPasadasShell && numPasadasSel<numPasadasQuick && numPasadasSel<numPasadasHeap && numPasadasSel<numPasadasIntD) {
                    mejorPasadas = numPasadasSel;
                    mejorPasadasNombre = "Selección";
                } else if (numPasadasInsD<numPasadasBur && numPasadasInsD<numPasadasSel && numPasadasInsD<numPasadasInsB && numPasadasInsD<numPasadasShell && numPasadasInsD<numPasadasQuick && numPasadasInsD<numPasadasHeap && numPasadasInsD<numPasadasIntD) {
                    mejorPasadas = numPasadasInsD;
                    mejorPasadasNombre = "Inserción directa";
                } else if (numPasadasInsB<numPasadasBur && numPasadasInsB<numPasadasSel && numPasadasInsB<numPasadasInsD && numPasadasInsB<numPasadasShell && numPasadasInsB<numPasadasQuick && numPasadasInsB<numPasadasHeap && numPasadasInsB<numPasadasIntD) {
                    mejorPasadas = numPasadasInsB;
                    mejorPasadasNombre = "Inserción binaria";
                } else if (numPasadasShell<numPasadasBur && numPasadasShell<numPasadasSel && numPasadasShell<numPasadasInsD && numPasadasShell<numPasadasInsB && numPasadasShell<numPasadasQuick && numPasadasShell<numPasadasHeap && numPasadasShell<numPasadasIntD) {
                    mejorPasadas = numPasadasShell;
                    mejorPasadasNombre = "Shell";
                } else if (numPasadasQuick<numPasadasBur && numPasadasQuick<numPasadasSel && numPasadasQuick<numPasadasInsD && numPasadasQuick<numPasadasInsB && numPasadasQuick<numPasadasShell && numPasadasQuick<numPasadasHeap && numPasadasQuick<numPasadasIntD) {
                    mejorPasadas = numPasadasQuick;
                    mejorPasadasNombre = "QuickSort";
                } else if (numPasadasHeap<numPasadasBur && numPasadasHeap<numPasadasSel && numPasadasHeap<numPasadasInsD && numPasadasHeap<numPasadasInsB && numPasadasHeap<numPasadasShell && numPasadasHeap<numPasadasQuick && numPasadasHeap<numPasadasIntD) {
                    mejorPasadas = numPasadasHeap;
                    mejorPasadasNombre = "HeapSort";
                } else if (numPasadasIntD<numPasadasBur && numPasadasIntD<numPasadasSel && numPasadasIntD<numPasadasInsD && numPasadasIntD<numPasadasInsB && numPasadasIntD<numPasadasShell && numPasadasIntD<numPasadasQuick && numPasadasIntD<numPasadasHeap) {
                    mejorPasadas = numPasadasIntD;
                    mejorPasadasNombre = "Intercambio directo";
                }

                //Comparar interacciones
                if (interaccionesBur<interaccionesSel && interaccionesBur<interaccionesInsD && interaccionesBur<interaccionesInsB && interaccionesBur<interaccionesShell && interaccionesBur<interaccionesQuick && interaccionesBur<interaccionesHeap && interaccionesBur<numInteraccionesIntD) {
                    mejorInteracciones = interaccionesBur;
                    mejorInteraccionesNombre = "Burbuja";
                } else if (interaccionesSel<interaccionesBur && interaccionesSel<interaccionesInsD && interaccionesSel<interaccionesInsB && interaccionesSel<interaccionesShell && interaccionesSel<interaccionesQuick && interaccionesSel<interaccionesHeap && interaccionesSel<numInteraccionesIntD) {
                    mejorInteracciones = interaccionesSel;
                    mejorInteraccionesNombre = "Selección";
                } else if (interaccionesInsD<interaccionesBur && interaccionesInsD<interaccionesSel && interaccionesInsD<interaccionesInsB && interaccionesInsD<interaccionesShell && interaccionesInsD<interaccionesQuick && interaccionesInsD<interaccionesHeap && interaccionesInsD<numInteraccionesIntD) {
                    mejorInteracciones = interaccionesInsD;
                    mejorInteraccionesNombre = "Inserción directa";
                } else if (interaccionesInsB<interaccionesBur && interaccionesInsB<interaccionesSel && interaccionesInsB<interaccionesInsD && interaccionesInsB<interaccionesShell && interaccionesInsB<interaccionesQuick && interaccionesInsB<interaccionesHeap && interaccionesInsB<numInteraccionesIntD) {
                    mejorInteracciones = interaccionesInsB;
                    mejorInteraccionesNombre = "Inserción binaria";
                } else if (interaccionesShell<interaccionesBur && interaccionesShell<interaccionesSel && interaccionesShell<interaccionesInsD && interaccionesShell<interaccionesInsB && interaccionesShell<interaccionesQuick && interaccionesShell<interaccionesHeap && interaccionesShell<numInteraccionesIntD) {
                    mejorInteracciones = interaccionesShell;
                    mejorInteraccionesNombre = "Shell";
                } else if (interaccionesQuick<interaccionesBur && interaccionesQuick<interaccionesSel && interaccionesQuick<interaccionesInsD && interaccionesQuick<interaccionesInsB && interaccionesQuick<interaccionesShell && interaccionesQuick<interaccionesHeap && interaccionesQuick<numInteraccionesIntD) {
                    mejorInteracciones = interaccionesQuick;
                    mejorInteraccionesNombre = "QuickSort";
                } else if (interaccionesHeap<interaccionesBur && interaccionesHeap<interaccionesSel && interaccionesHeap<interaccionesInsD && interaccionesHeap<interaccionesInsB && interaccionesHeap<interaccionesShell && interaccionesHeap<interaccionesQuick && interaccionesHeap<numInteraccionesIntD) {
                    mejorInteracciones = interaccionesHeap;
                    mejorInteraccionesNombre = "HeapSort";
                } else if (numInteraccionesIntD<interaccionesBur && numInteraccionesIntD<interaccionesSel && numInteraccionesIntD<interaccionesInsD &&numInteraccionesIntD<interaccionesInsB && numInteraccionesIntD<interaccionesShell && numInteraccionesIntD<interaccionesQuick && numInteraccionesIntD<interaccionesHeap) {
                    mejorInteracciones = numInteraccionesIntD;
                    mejorInteraccionesNombre = "Intercambio directo";
                }

                //Comparar tiempo
                if (elapsedTimeBur<=elapsedTimeSel && elapsedTimeBur<=elapsedTimeInsD && elapsedTimeBur<=elapsedTimeInsB && elapsedTimeBur<=elapsedTimeShell && elapsedTimeBur<=elapsedTimeQuick && elapsedTimeBur<=elapsedTimeHeap && elapsedTimeBur<=durationIntD) {
                    mejorTiempo = elapsedTimeBur;
                    mejorTiempoNombre = "Burbuja";
                } else if (elapsedTimeSel<=elapsedTimeBur && elapsedTimeSel<=elapsedTimeInsD && elapsedTimeSel<=elapsedTimeInsB && elapsedTimeSel<=elapsedTimeShell && elapsedTimeSel<=elapsedTimeQuick && elapsedTimeSel<=elapsedTimeHeap && elapsedTimeSel<=durationIntD) {
                    mejorTiempo = elapsedTimeSel;
                    mejorTiempoNombre = "Selección";
                } else if (elapsedTimeInsD<=elapsedTimeBur && elapsedTimeInsD<=elapsedTimeSel && elapsedTimeInsD<=elapsedTimeInsB && elapsedTimeInsD<=elapsedTimeShell && elapsedTimeInsD<=elapsedTimeQuick && elapsedTimeInsD<=elapsedTimeHeap && elapsedTimeInsD<=durationIntD) {
                    mejorTiempo = elapsedTimeInsD;
                    mejorTiempoNombre = "Inserción directa";
                } else if (elapsedTimeInsB<=elapsedTimeBur && elapsedTimeInsB<=elapsedTimeSel && elapsedTimeInsB<=elapsedTimeInsD && elapsedTimeInsB<=elapsedTimeShell && elapsedTimeInsB<=elapsedTimeQuick && elapsedTimeInsB<=elapsedTimeHeap && elapsedTimeInsB<=durationIntD) {
                    mejorTiempo = elapsedTimeInsB;
                    mejorTiempoNombre = "Inserción binaria";
                } else if (elapsedTimeShell<=elapsedTimeBur && elapsedTimeShell<=elapsedTimeSel && elapsedTimeShell<=elapsedTimeInsD && elapsedTimeShell<=elapsedTimeInsB && elapsedTimeShell<=elapsedTimeQuick && elapsedTimeShell<=elapsedTimeHeap && elapsedTimeShell<=durationIntD) {
                    mejorTiempo = elapsedTimeShell;
                    mejorTiempoNombre = "Shell";
                } else if (elapsedTimeQuick<=elapsedTimeBur && elapsedTimeQuick<=elapsedTimeSel && elapsedTimeQuick<=elapsedTimeInsD && elapsedTimeQuick<=elapsedTimeInsB && elapsedTimeQuick<=elapsedTimeShell && elapsedTimeQuick<=elapsedTimeHeap && elapsedTimeQuick<=durationIntD) {
                    mejorTiempo = elapsedTimeQuick;
                    mejorTiempoNombre = "QuickSort";
                } else if (elapsedTimeHeap<=elapsedTimeBur && elapsedTimeHeap<=elapsedTimeSel && elapsedTimeHeap<=elapsedTimeInsD && elapsedTimeHeap<=elapsedTimeInsB && elapsedTimeHeap<=elapsedTimeShell && elapsedTimeHeap<=elapsedTimeQuick && elapsedTimeHeap<=durationIntD) {
                    mejorTiempo = elapsedTimeHeap;
                    mejorTiempoNombre = "HeapSort";
                } else if (durationIntD<=elapsedTimeBur && durationIntD<=elapsedTimeSel && durationIntD<=elapsedTimeInsD && durationIntD<=elapsedTimeInsB && durationIntD<=elapsedTimeShell && durationIntD<=elapsedTimeQuick && durationIntD<=elapsedTimeHeap) {
                    mejorTiempo = durationIntD;
                    mejorTiempoNombre = "Intercambio directo";
                }


                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JTable table = new JTable(datos, columnas);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                JLabel lbPas = new JLabel("El mejor método de ordenamiento por pasadas es: " + mejorPasadasNombre + " con " + mejorPasadas + " pasadas");
                JLabel lbInt = new JLabel("El mejor método de ordenamiento por interacciones es: " + mejorInteraccionesNombre + " con " + mejorInteracciones + " interacciones");
                JLabel lbTim = new JLabel("El mejor método de ordenamiento por tiempo es: " + mejorTiempoNombre + " con " + mejorTiempo + " milisegundos");
                panel.add(table);
                panel.add(lbPas);
                panel.add(lbInt);
                panel.add(lbTim);
                frame.add(panel);
                frame.setSize(500, 500);
                frame.setVisible(true);

                break;
            case 3:
                System.out.println("Gracias por utilizar el programa");
                break;
            default:
                break;
            }
    }

    public static void burbuja(int[] arreglo) {
        int auxiliar;
        boolean cambios = false;
    
        long startTime = System.currentTimeMillis(); // Inicio del tiempo
    
        while (true) {
            cambios = false;
            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] < arreglo[i - 1]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i - 1];
                    arreglo[i - 1] = auxiliar;
                    cambios = true;
                    numPasadasBur++;
                }
                interaccionesBur++; // Contador de interacciones
            }
            if (!cambios) {
                break;
            }
        }
    
        long endTime = System.currentTimeMillis(); // Fin del tiempo
        elapsedTimeBur = endTime - startTime;
    }
    

    public static void seleccion(int[] arreglo) {
        int indiceMenor;
        int auxiliar;
    
        long startTime = System.currentTimeMillis(); // Inicio del tiempo
    
        for (int i = 0; i < arreglo.length - 1; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
                interaccionesSel++; // Contador de interacciones
            }
            if (i != indiceMenor) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[indiceMenor];
                arreglo[indiceMenor] = auxiliar;
            }
            numPasadasSel++;
        }
    
        long endTime = System.currentTimeMillis(); // Fin del tiempo
        elapsedTimeSel = endTime - startTime;
    
    }
    

    public static void insercionDirecta(int[] arreglo) {
        int auxiliar;
        int p;
        long startTime = System.currentTimeMillis(); // Inicio del tiempo
    
        for (int i = 1; i < arreglo.length; i++) {
            auxiliar = arreglo[i];
            p = i - 1;
            while (p >= 0 && arreglo[p] > auxiliar) {
                arreglo[p + 1] = arreglo[p];
                p--;
                interaccionesInsD++; // Contador de interacciones
            }
            arreglo[p + 1] = auxiliar;
            numPasadasInsD++;
        }
    
        long endTime = System.currentTimeMillis(); // Fin del tiempo
        elapsedTimeInsD = endTime - startTime;
    }
    

    public static void insercionBinaria(int[] arreglo) {
        int auxiliar, izquierda, derecha, centro;

    
        long startTime = System.currentTimeMillis(); // Inicio del tiempo
    
        for (int i = 1; i < arreglo.length; i++) {
            auxiliar = arreglo[i];
            izquierda = 0;
            derecha = i - 1;
    
            while (izquierda <= derecha) {
                centro = (izquierda + derecha) / 2;
                if (auxiliar < arreglo[centro]) {
                    derecha = centro - 1;
                } else {
                    izquierda = centro + 1;
                }
                interaccionesInsB++; // Contador de interacciones
            }
    
            for (int j = i - 1; j >= izquierda; j--) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[izquierda] = auxiliar;
            numPasadasInsB++;
        }
    
        long endTime = System.currentTimeMillis(); // Fin del tiempo
        elapsedTimeInsB = endTime - startTime;
    }
    

    public static void shell(int[] arreglo) {
        int salto, auxiliar;
        boolean cambios;
    
        long startTime = System.currentTimeMillis(); // Inicio del tiempo
    
        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (int i = salto; i < arreglo.length; i++) {
                    if (arreglo[i - salto] > arreglo[i]) {
                        auxiliar = arreglo[i];
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = auxiliar;
                        cambios = true;
                    }
                    interaccionesShell++; // Contador de interacciones
                }
            }
            numPasadasShell++;
        }
    
        long endTime = System.currentTimeMillis(); // Fin del tiempo
        elapsedTimeShell = endTime - startTime;

    }
    

    public static void quickSort(int[] arreglo) {
        quickSort(arreglo, 0, arreglo.length - 1);
    }
    
    private static void quickSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda >= derecha) {
            return;
        }
    
        int pivote = arreglo[izquierda];
        int i = izquierda + 1;
        int j = derecha;
        int auxiliar;

    
        long startTime = System.currentTimeMillis(); // Inicio del tiempo
    
        while (i <= j) {
            while (i <= j && arreglo[i] <= pivote) {
                i++;
                interaccionesQuick++; // Contador de interacciones
            }
            while (i <= j && arreglo[j] > pivote) {
                j--;
                interaccionesQuick++; // Contador de interacciones
            }
            if (i < j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
            }
            numPasadasQuick++;
        }
    
        auxiliar = arreglo[izquierda];
        arreglo[izquierda] = arreglo[j];
        arreglo[j] = auxiliar;
    
        quickSort(arreglo, izquierda, j - 1);
        quickSort(arreglo, j + 1, derecha);
    
        long endTime = System.currentTimeMillis(); // Fin del tiempo
        elapsedTimeQuick = endTime - startTime;
    
    }
    

    public static void heapSort(int[] arreglo) {
        int i;
        int auxiliar;


        long startTime = System.currentTimeMillis(); // Inicio del tiempo
        for (i = arreglo.length / 2 - 1; i >= 0; i--) {
            hacerMonticulo(arreglo, i, arreglo.length - 1);
            numPasadasHeap++;
        }
        for (i = arreglo.length - 1; i >= 0; i--) {
            auxiliar = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = auxiliar;
            hacerMonticulo(arreglo, 0, i - 1);
            interaccionesHeap++;
        }
        long endTime = System.currentTimeMillis(); // Fin del tiempo
         elapsedTimeHeap = endTime - startTime;


    }

    private static void hacerMonticulo(int[] arreglo, int primero, int ultimo) {
        int padre = arreglo[primero];
        int rama = primero * 2 + 1;

        while (rama <= ultimo) {
            if (rama < ultimo) {
                if (arreglo[rama] < arreglo[rama + 1]) {
                    rama++;
                }
            }
            if (padre < arreglo[rama]) {
                arreglo[primero] = arreglo[rama];
                primero = rama;
                rama = primero * 2 + 1;
            } else {
                rama = ultimo + 1;
            }
        }
        arreglo[primero] = padre;
    }


    public static void intercambioDirecto(int[] arreglo) {
        int auxiliar;
        
        long startTimeIntD = System.nanoTime();

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
                numInteraccionesIntD++;
            }
            numPasadasIntD++;
        }

        long endTimeIntD = System.nanoTime();
        durationIntD = (endTimeIntD - startTimeIntD) / 1000000; // Convertir a milisegundos
    }
}
