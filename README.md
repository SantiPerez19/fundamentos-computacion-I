# Proyecto Final - Fundamentos de Computación I

Proyecto final de la materia **Fundamentos de Computación I**.

Programa de consola en **Java** desarrollado por Santiago Pérez Cáñez. Presenta un menú interactivo con cinco ejercicios que ponen en práctica estructuras de control y arreglos.

## Descripción general

Al ejecutar el programa se muestra un menú principal desde el cual se puede elegir entre las siguientes opciones:

1. **if - Triángulos**: determina si tres longitudes pueden formar un triángulo y, de ser así, indica si es equilátero, isósceles o escaleno.
2. **for - Padovan**: genera la sucesión de Padovan hasta un límite dado.
3. **while - Sumatoria**: calcula la sumatoria `1/1 + 1/2 + ... + 1/n`.
4. **do - Conjetura de Collatz**: aplica la conjetura de Collatz a un número entero positivo.
5. **Arreglos - Rotar un arreglo a la derecha**: lee 10 números enteros y los rota `k` posiciones a la derecha.
6. **Salir del sistema**.

## Tecnologías y lenguajes

| Área | Tecnología |
|------|------------|
| Lenguaje | **Java** |
| Entrada/Salida | `System.console()` y `java.util.Scanner` |
| Tipo de aplicación | Programa de consola (sin dependencias externas) |

## Requerimientos

- JDK (Java Development Kit) instalado.

## Compilación y ejecución

```bash
javac proyectoFinal.java
java proyectoFinal
```

> Nota: el programa usa `System.console()`, por lo que debe ejecutarse desde una terminal real. En algunos IDE la consola integrada no lo soporta.

## Estructura del proyecto

```
.
├── proyectoFinal.java   # Código fuente del programa
└── README.md
```
