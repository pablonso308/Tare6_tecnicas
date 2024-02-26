# Tare6_tecnicas
link a mi repositorio: 

ENUNCIADO
Desarrollar dos funciones para comparar números reales. La primera función devuelve el mayor de dos números, y la segunda clasifica los números retornando 0 si son iguales, 1 si el primero es mayor, y -1 en caso contrario. Implementar un algoritmo principal que utilice estas funciones. 
función mayorDeDos(número1, número2):
    si número1 > número2:
        return número1
    return número2

función clasificarNúmeros(número1, número2):
    si número1 == número2:
        return 0
    si número1 > número2:
        return 1
    return -1

número1 = obtenerNúmero("Ingrese el primer número: ")
número2 = obtenerNúmero("Ingrese el segundo número: ")
mayor = mayorDeDos(número1, número2)
clasificación = clasificarNúmeros(número1, número2)
imprimir("El mayor es: ", mayor, " y la clasificación es: ", clasificación)
 
 RESOLUCION 

 para resolver este ejercicio he hecho dos clases una llamada ejercicio1 en la que he implementado las dos funciones que me piden en el enunciado de mayorDeDos y  clasificarNúmeros las cuales he desarrollado basandome en el pseudocodigo del enunciado y luego he implementado otra clase que es la main donde he desarrollado la forma en la que quiero que se imprima en pantalla las soluciones de las funciones y tambien he definido la obtencion de datos para las funciones de la clase ejercicio todo tambien basandome en el pseudocodigo del enunciado

 2. Simulador de Batalla Naval Mejorado
Descripción
Mejorar el algoritmo de la guerra de barcos dividiéndolo en varios procedimientos y funciones, incluyendo inicialización y visualización del tablero, entrada de datos y acción de disparo.

Pseudocódigo

procedimiento inicializarTablero(tablero):
    # Lógica de inicialización

procedimiento mostrarTablero(tablero):
    # Lógica para mostrar el tablero

función introducirEnteroEntreLimites(mínimo, máximo):
    # Lógica para obtener un entero dentro de los límites

función disparar(tablero, fila, columna):
    # Lógica para realizar un disparo

algoritmo principal:
    tablero = crearTablero()
    inicializarTablero(tablero)
    mostrarTablero(tablero)
    fila = introducirEnteroEntreLimites(1, 4)
    columna = introducirEnteroEntreLimites(1, 4)
    resultado = disparar(tablero, fila, columna)
    si resultado:
        imprimir("Tocado y hundido")


RESOLUCION


