import java.util.Scanner;

//Almacena el número del nodo y referencia a los hijos
class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}
//Contiene la raíz del árbol y las operaciones
class ArbolBinario {
    Nodo raiz;

    //Actualiza raíz, la recusion devuelve el nuevo nodo a raíz
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }
    private Nodo insertarRec(Nodo nodo, int valor){
        if (nodo == null){
            return new Nodo(valor);
        }
        //Si el valor es menor se inserta en el subárbol izquierdo,si es mayor se inserta al lado derecho
        if (valor< nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }
    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inordenRec(nodo.derecho);
        }
    }
    //Indica si el valor existe o no existe
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }
    private boolean buscarRec(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }
        if (valor == nodo.valor){
            return true;
        }
        return valor < nodo.valor
                ? buscarRec(nodo.izquierdo, valor)
                : buscarRec(nodo.izquierdo, valor);
    }
}
//Menú en consola
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion, numero;

        do {
            System.out.println("\n--- MENÚ ÁRBOL BINARIO ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el número: ");
                    numero = sc.nextInt();
                    arbol.insertar(numero);
                    System.out.println("Número inseratado.");
                    break;
                case 2:
                    System.out.println("Recorrido inorden: ");
                    arbol.inorden();
                    break;
                case 3:
                    System.out.println("Ingrese el número que desea buscar: ");
                    numero = sc.nextInt();
                    if (arbol.buscar(numero)) {
                        System.out.println("El número " + numero + " SÍ existe en el árbol.");
                    } else {
                        System.out.println("El número " + numero + " NO existe en el árbol. ");
                    }
                    break;
                case 4:
                    System.out.println("--- Saliendo ---");
                    break;
                default:
                    System.out.println("Opción no válida. ");
            }
        } while ( opcion != 4) ;
        sc.close();

    }
}
