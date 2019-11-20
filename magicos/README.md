# Problema I: Magicos
## Base Name: magicos.java (magicos.cpp)

El número 381.654.729 tiene una propiedad muy curiosa que no cumple ningún otro numero. Si lo miras con cuidado es probable que te des cuenta de que tiene los nueve dígitos entre el 1 y el 9 y que no repite ninguno de ellos. Sin embargo, eso no es lo único especial que tiene (hay muchos otros numeros así).

Lo que realmente hace singular es que, además de lo anterior, es divisible por 9; si se le quita el último dígito, queda un número divisible por 8; si se le vuelte a quitar el último dígito, queda un número divisible por 7; y así continuamente hasta llegar a un número de un único dígito que, naturalmente, es divisible por 1:

[dato pendiente]

Esta última peculiaridad es lo que en matemámticas se conoce como un numero polidivisible, que puede definirse de la siguiente forma: un número es polidivisible si es divisible por su longitud y, además, si se le quita el último dígito queda un número que es a su vez polidivisible.

Existen otros números polidivisibles como el 102 o el 9.876. Pero su cantidad es limitada: hay un total de 20.456 números polidivisibles distintos, el mayor de los cuales tiene 25 dígitos.

## Entrada ##
La entrada estará compuesta por distintos números positivos, cada uno de ellos en una línea. Los números serán siempre mayores que cero y nunca mayores que $10^{18}$

## Salida ##
Por cada número, se escribirá una línea en donde aparecerá "POLIDIVISIBLE" si el número es polidivisible según la definicion anterior o "NO POLIDIVISIBLE" si no lo es.

## Ejemplo ##
Entrada:
```bash
381654729
102
9876
67
```

Salida:
```bash
POLIDIVISIBLE
POLIDIVISIBLE
POLIDIVISIBLE
NO POLIDIVISIBLE
```