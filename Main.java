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