Este proyecto consta de cuatro actividades que tienen como objetivo practicar la gestión de ficheros y la persistencia de datos en Java, usando diferentes técnicas como manipulación de texto, lectura y escritura, fusión de archivos y serialización de objetos.

Cada actividad está organizada en un paquete independiente, con su clase principal y las clases necesarias.
Actividad 1: Guardado de texto en un fichero
Objetivo

Solicitar al usuario un texto con al menos 30 caracteres, formatearlo y guardarlo en un fichero.
Funcionamiento

    Se pide al usuario que introduzca un texto.

    Si el texto es menor a 30 caracteres, se informa cuántos caracteres faltan y se vuelve a pedir.

    El texto introducido se transforma: todas las letras pasan a mayúsculas y los espacios se sustituyen por barras bajas (_).

    El texto formateado se guarda en un fichero específico para esta actividad.

Técnicas usadas

    Entrada por consola.

    Validación de longitud.

    Manipulación de cadenas.

    Escritura en fichero de texto.

Actividad 2: Recuperación de texto en un fichero
Objetivo

Leer un fichero con texto y mostrar cada carácter junto con su valor decimal Unicode.
Funcionamiento

    Se crea un fichero con un texto de cierta longitud.

    Se lee el fichero carácter a carácter.

    Por cada carácter, se muestra el carácter seguido de un guion bajo y su código decimal Unicode, separado por comas.

    Ejemplo: "Hola, pibe." se muestra como:
    H_72, o_111, l_108, a_97, _32, p_112, i_105, b_98, e_101, ._46

Técnicas usadas

    Escritura y lectura de ficheros.

    Conversión de caracteres a valores numéricos.

    Formateo de salida.

Actividad 3: Fusionar contenido de varios ficheros
Objetivo

Fusionar el contenido de los ficheros de las actividades 1 y 2 en un nuevo fichero, añadiendo una firma al final.
Funcionamiento

    Se crea un nuevo fichero para esta actividad.

    Se copia el contenido del fichero de la Actividad 1 precedido por el título - Contenido del Fichero Uno:.

    Se copia el contenido del fichero de la Actividad 2 precedido por el título - Contenido del Fichero Dos:.

    Al final del fichero, se añade un mensaje de firma personalizado.

Técnicas usadas

    Lectura y escritura de múltiples ficheros.

    Concatenación y formateo de texto.

    Gestión de flujos para escritura secuencial.

Actividad 4: Persistencia y recuperación de objetos
Objetivo

Gestionar la persistencia de objetos de tipo Mesa mediante serialización y recuperar todas las mesas almacenadas.
Funcionamiento

    Se crea la clase Mesa con atributos color y número de patas, sobrescribiendo el método toString() para mostrar la información formateada.

    Se desarrolla la clase MesaDAO que implementa dos métodos:

        guardarMesa(Mesa mesa): guarda la mesa en un fichero serializado.

        obtenerMesas(): recupera todas las mesas guardadas en el fichero.

    La clase ejecutable presenta un menú que permite:

        Crear una nueva mesa pidiendo al usuario el color y número de patas y guardarla.

        Mostrar todas las mesas almacenadas.

Técnicas usadas

    Serialización y deserialización de objetos.

    Manejo de ficheros binarios.

    Entrada por consola con validación.

    Programación orientada a objetos.
