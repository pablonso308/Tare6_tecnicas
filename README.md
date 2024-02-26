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

este ejercicio lo he resuelto haciendo las clases que me dicen en el pseudocodigo del enunciado, 
he creado una clase llamada ejercicio2 en la que he implementado los procedimientos y funciones que me piden en el enunciado,
luego he creado otra clase llamada main en la que he implementado el algoritmo principal que me piden en el enunciado.
Tambien he definido la forma en la que quiero que se imprima en pantalla las soluciones de las funciones de la clase ejercicio2 y 
he definido la obtencion de datos para las funciones de la clase ejercicio2 todo tambien basandome en el pseudocodigo del enunciado


3. Manipulación de Tablas y Búsqueda de Máximos
   Descripción
   Crear una función que genere una tabla de diez enteros con valores aleatorios entre límites dados. Desarrollar otra función que encuentre el mayor valor en una tabla. Luego, escribir un algoritmo principal que use estas funciones.

Pseudocódigo

función crearTablaAleatoria(tamaño, mínimo, máximo):
tabla = []
para i de 1 a tamaño:
tabla.agregar(aleatorioEntre(mínimo, máximo))
return tabla

función encontrarMayor(tabla):
mayor = tabla[0]
para cada valor en tabla:
si valor > mayor:
mayor = valor
return mayor

tabla = crearTablaAleatoria(10, 1, 100)
mayor = encontrarMayor(tabla)
imprimir("Tabla: ", tabla, " - Mayor valor: ", mayor)

RESOLUCION

este ejercicio lo he resuelto haciendo las clases que me dicen en el pseudocodigo del enunciado.

4. Juego del Rebaño de Ovejas

   Descripción
   Desarrollar un juego en el que se deba cambiar la configuración de un rebaño de ovejas siguiendo ciertas reglas. Implementar subalgoritmos para los movimientos permitidos y escribir el algoritmo principal del juego.

Pseudocódigo

procedimiento realizarMovimiento(tablero, posición):
# Lógica para mover una oveja

función esMovimientoVálido(tablero, posición):
# Lógica para validar un movimiento

algoritmo principal:
tablero = crearTableroInicial()
mientras no esConfiguraciónFinal(tablero):
mostrarTablero(tablero)
movimiento = obtenerMovimiento()
si esMovimientoVálido(tablero, movimiento):
realizarMovimiento(tablero, movimiento)
imprimir("¡Objetivo alcanzado!")

RESOLUCION


5. Taller de Arte ASCII

    Descripción
   Implementar un algoritmo para crear arte ASCII. Iniciar con un lienzo vacío y ofrecer un menú para dibujar caracteres, rectángulos y cambiar colores. Utilizar procedimientos para cada acción.

Pseudocódigo

procedimiento dibujarCarácter(lienzo, posición, carácter):
# Lógica para dibujar un carácter

procedimiento dibujarRectángulo(lienzo, esquina1, esquina2, carácter):
# Lógica para dibujar un rectángulo

procedimiento cambiarColor(lienzo, posición, nuevoCarácter):
# Lógica para cambiar el carácter

algoritmo principal:
lienzo = crearLienzo(10, 40)
opción = mostrarMenú()
mientras opción ≠ salir:
ejecutarAcción(lienzo, opción)
mostrarLienzo(lienzo)
opción = mostrarMenú()

RESOLUCION

para hacer este ejercicio he convertido el pseudocodigo q me dan en el enunciado al codigo de java y tambien he aplicado cosas de otro codigo de una practica anterior que tambien tratataba del arte ascii
