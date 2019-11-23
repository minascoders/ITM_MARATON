# Problema F: Candado de ITM
## Base Name: candado.java (candado.cpp)

El ITM ha decidido poner lockers con candado para que los estudiantes guarden sus maletas de forma segura. Dichos candados son candados de clave de tres dígitos, donde cada dígito se selecciona de la manera tradicional de los candados de clave, es decir, girando la rueda. Para aumentar la seguridad de los estudiantes, el ITM ha decidido que cada rueda del candado debería tener 16 dígitos hexadecimales i.e: <0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, F>. El ITM quiere que sus estudiantes sean capaces de poner la clave en la menor cantidad de pasos posibles y para eso han decidido crear una aplicación móvil y lo han contratado a usted para que desarrolle la parte más importante de esta. Su trabajo es crear un programa que dado 3 dígitos hexadecimales como posición inicial y 3 dígitos hexadecimales como clave, describa el camino más corto de cada rueda desde esa posición inicial hasta la posición de la clave.

NOTA: las letras en la representación hexadecimal siempre deben estar en mayúsculas, tanto en la lectura como en la escritura.

## Entrada:
La entrada inicia con un número 0 < T < 50 que indica la cantidad de escenarios de prueba. Por cada escenario de prueba habrán 2 líneas. Cada una de estas líneas tendrá tres dígitos hexadecimales a, b, c separados por espacio. La primera línea describe la posición inicial del candado siendo el primer dígito correspondiente a la primera rueda del candado y el último dígito correspondiente con la última rueda del candado.

## Salida:
Por cada escenario de prueba usted deberá imprimir 3 líneas, compuestas únicamente de dígitos hexadecimales sin espacios, que describen el camino más corto desde la posición inicial hasta la clave. Recuerde que cada línea representa una rueda del candado. Todas las líneas deben iniciar con el dígito de la posición inicial y terminar con el dígito de la clave. Si existen varios caminos con la misma longitud, dé prioridad a aquel que vaya de derecha a izquierda.

## Ejemplo:
Entrada:
```
2
1 2 3
4 5 6
F E 0
A C E
```

Salida:
```
1234
2345
3456
FEDCBA
EDC
0FE
```