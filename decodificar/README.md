# Problema D: Decodificar
## Base Name: decodificar.java (decodificar.cpp)

Iker W. ve cosas desconocidas en cualquier lado. Una mancha de humedad en la pared se le antoja la cara de la anterior propietaria de una casa; el sonido del viento le aprece un susurro venido del más allá; una nube con forma peculiar le convence de la existencia de vida extraterrestre.

Ahora le ha dado por ver mensajes ocultos en cualquier sitio. Por poner un ejemplo, si lee el siguiente titular: "El presidente del Gobierno se somete esta noche al escritinio de varios periodistas en Televisión Española.", se las ingenia para leer un "te odio" oculto que le mantiene en vela toda la noche:
__
*El presiden**T**e d**E**l Gobierno se s**O**mete esta noche al escritinio **D**e var**I**os peri**O**distas en Televisión Española.*
__

Ahora quiere automatizar la tarea de la búsqueda de estos mensajes.

## Entrada:
La entrada comenzará con un entero que le indica el número de casos de prueba. Cada uno de ellos está formado por dos líneas; la primera indicará el *titular* donde buscar un mensaje oculto y la segunda indica el mensaje a buscar. La longitud de cada una de las cadenas no excederá los 2000 caracteres. Ten en cuenta que no hace falta distinguir entre mayúsculas y minúsculas y que los expacios del mensaje oculto no son relevantes, es decir, no hace falta que existan en el mensaje original, pero si deben aparecer el resto de caracteres (signos de puntuación, comillas, etc.). Se garantiza que el mensaje oculto a buscar no empieza ni termina por espacios.

La entrada contendrá únicamente letras del alfabeto inglés, por lo que no aparecerán vocales con tilde. Además, podrían aparecer múltiples espacios consecutivos.

## Salida:
Para cada caso de prueba el programa escribirá **SI** si el mensaje buscado aparece en el titular y **NO** en caso contrario.

## Ejemplo:
Entrada:
```
4
...dente ...somete ... de varios periodistas ...
te odio.
Teo dijo "si".
te odio.
Y adios, que ya viene el alba.
te odio.
Teo   subio al   podio.
te odio.
```

Salida:
```
SI
SI
NO
SI
```