# Problema J: Emperador
## Base Name: emperador.java (emperador.cpp)

El emperador es un juego de cartas muy conocido entre españoles también es muy jugado en algunos países de Hispanoamérica e incluso en algunas regiones del sur de Francia.

Cuando los estudiantes españoles consiguen una beca para estudiar durante unos meses en otro país de Europa, es fácil entender, pues, que no falte una baraja de cartas entre su equipaje, por lo que pueda ocurrir. En su afán de evangelización muchos de estos estudiantes intentan que el juego se extienda, y se empeñan en explicar las reglas a sus compañeros de otros países.

## Entrada
La entrada estará compuesta por varios casos de prubea terminados con una línea con un 0.

Cada caso de prueba tendrá dos lineas. En la primera aparecerá un único entero que indica el número de países totales representados (un número entre 1 y 100.000). La segunda línea contendrá un número por cada país, representando la cantidad de estudiantes de ese país que quieren jugar el emperador. El número de estudiantes de cada país no excederá nunca $10^9$.

## Salida
Por cada caso de prueba, el programa escribirá el número de parejas distintas que pueden formarse sin que una pareja tenga a sus dos integrantes de la misma nacionalidad. Se garantiza que la respuesta no será nunca superior a $10^{18}$.

## Ejemplo
Entrada:
```
2
1 1
2
2 2
3
2 2 1
0
```

Salida:
```
1
4
8
```