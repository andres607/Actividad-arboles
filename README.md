Actividad-arboles
Actividad en la que estaremos implementando en Java un Árbol Binario simple

Este trabajo fue realizado en conjunto por 
Juan Andres Valencia
Maria Valentina Chica
Andres Estiven Castañeda

¿Qué es un Árbol Binario?

Un Árbol Binario es una estructura de datos jerárquica compuesta por nodos, donde cada nodo tiene como máximo dos hijos:
uno a la izquierda y otro a la derecha.

En un Árbol Binario de Búsqueda (ABB):

- Los valores menores se almacenan en el subárbol izquierdo.
- Los valores mayores se almacenan en el subárbol derecho.

Esta estructura permite insertar, buscar y recorrer datos de manera eficiente.

¿Cómo se implementó?

El proyecto tiene tres componentes principales:

1. Nodo

Representa cada elemento del árbol. Contiene:

- Un valor numérico.
- Un nodo izquierdo (hijo menor).
- Un nodo derecho (hijo mayor).
  
2. ArbolBinario

Clase que contiene:

La raíz del árbol.

Métodos para insertar, buscar y recorrer inorden.

Métodos principales:

insertar(int valor): Agrega un número al árbol.

inorden(): Muestra los números ordenados de menor a mayor.

buscar(int valor): Verifica si un número está presente.

3. Main

Clase principal con un menú en consola que permite al usuario interactuar con el árbol:

--- MENÚ ÁRBOL BINARIO ---
1. Insertar número
2. Mostrar recorrido
3. Buscar número
4. Salir
