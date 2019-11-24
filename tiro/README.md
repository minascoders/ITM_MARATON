# Problema A: Tiro al Blanco
## Base Name: tiro.java (tiro.cpp)

Ya es tradición que cuando en el pueblo de Juan Martinez están en fiestas, él se pase por el puesto de tiro con escopeta. En vez de premios en los patos a los que hay que disparar colocan letras de tal forma que Juan pueda disparar de manera que se forme un palíndromo con las letras en los patos supervivientes (es decir, que, al leer tanto de izquierda a derecha como de derecha a izquierda, se lea siempre la misma palabra). Por ejemplo, si se enfrentara a la serie de platos de la figura, Juan dispararía a los patos en las posiciones 1, 2 y 6, formando el palíndromo RODADOR.

M E R O D E A D O R

Además, Juan no se conforma solamente con encontrar un palíndromo sino que lo intenta conseguir tirando el menor número de platos. ¿Sabrías tú hacer lo mismo?

## Entrada:
La entrada estará compuesta por multiples casos de prueba, cada uno en una línea. Cada caso consiste en una sucesión de un mínimo de 1 y un máximo de 1000 letras mayúsculas del alfábeto inglés, sin símbolos especiales ni espacios.

## Salida:
Por cada caso de prueba se escribirá una línea que contenga el palíndromo más largo que puede formarse eliminando (si es necesario) algunas de las letras de la entrada. En caso de empate, se debe imitar a Juan, eliminando las letras más a la izquierda.

## Ejemplo:
Entrada:
```
MERODEADOR
RECONOCER
ARADAROSOSOMI
OSORASODAR
```

Salida:
```
RODADOR
RECONOCER
OSOSO
RADAR
```