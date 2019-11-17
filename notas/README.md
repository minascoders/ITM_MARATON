# Problema C: Docente en Problemas
## Base Name: notas.java (notas.cpp)
La profesora lina Marcela estaba pasando las notas de sus estudiantes de algoritmos en su pnatilla de Excel. Al finalizar esta tarea, ella se dió cuenta que la barra espaciadora del teclado estaba dañada. Debido a esta situación, todas las notas de un estudiante quedaron en una línea sin ningún espacio entre ellas. Dado que Lina no tiene la habilidad de reparar la barra espaciadora de su teclado, ella va a necesitar calcular el promedio de las notas de cada estudiante en el formato que lo transcribió, es decir, una sola línea y sin espacios.

Cada nota es un número entero que esta entre 1 y 10. Ninguna de las notas tiene ceros a la izquierda. Por ejemplo, las notas de Daniela, una estudiante de Lina, son: 3, 10, 1 y 10 ellas estarían escritas como: "310110".

Dado que durante el semestre la profesora ha dejado varios trabajos y talleres opcionales, la cantidad de notas de los estudiantes no son iguales.

## Entrada
La entrada contiene varios casos de prueba. La primera línea contiene un entero t que especifica la cantidad de estudiantes del curso de Lina. por cada estudiante, se tendrá un String que contiene las notas en el formato anteriormente mencionado. Solo existe una única forma en la que se pueden separar las notas para que cumplan con las condiciones de que todas estan entre 1 y 10 y que ninguna tiene ceros a la izquierda.

## Salida
Por cada caso de prueba de la entrada, se debe imprimir un número racional que representa el promedio de las notas del estudiante. Este resultado debe ser un número racional con exactamente 2 dígitos después del punto decimal, el número debe ser redondeado en caso de ser necesario.

## Ejemplo
| Entrada | Salida |
| :-- | ---------- |
| 3 | 6 |
| 310110 | 9.67 |
| 10910 | 2.11 |
| 222222223 | |
