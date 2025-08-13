# Ejercicios Java - Nivel Básico

## 📋 Índice
1. [Calculadora Simple](#1-calculadora-simple)
2. [Verificador de Números Pares/Impares](#2-verificador-de-números-paresimpares)
3. [Conversor de Temperatura](#3-conversor-de-temperatura)
4. [Contador de Vocales](#4-contador-de-vocales)
5. [Tabla de Multiplicar](#5-tabla-de-multiplicar)
# Ejercicios Java - Nivel Intermedio

## 📋 Índice
6. [Gestión de Array](#1-gestión-de-array)
7. [Validador de Palíndromos](#2-validador-de-palíndromos)
8. [Calculadora de Factorial](#3-calculadora-de-factorial)
9. [Generador de Números Primos](#4-generador-de-números-primos)
10. [Sistema de Calificaciones](#5-sistema-de-calificaciones)


---

## 1. Calculadora Simple

### 🎯 Objetivo
Crear un programa que realice operaciones básicas (suma, resta, multiplicación, división) entre dos números.

### 📝 Pasos
1. **Importar Scanner** para leer entrada del usuario
2. **Solicitar primer número** al usuario
3. **Solicitar operación** (+, -, *, /)
4. **Solicitar segundo número** al usuario
5. **Realizar cálculo** según la operación
6. **Mostrar resultado** al usuario

### 💻 Código
```java
import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA SIMPLE ===");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        boolean operacionValida = true;
        
        switch(operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no válida");
                operacionValida = false;
        }
        
        if(operacionValida) {
            System.out.printf("%.2f %c %.2f = %.2f%n", num1, operacion, num2, resultado);
        }
        
        scanner.close();
    }
}
```

---

## 2. Verificador de Números Pares/Impares

### 🎯 Objetivo
Determinar si un número ingresado es par o impar.

### 📝 Pasos
1. **Solicitar número** al usuario
2. **Aplicar operador módulo** (%) con 2
3. **Evaluar resultado**: si es 0 es par, si es 1 es impar
4. **Mostrar resultado** al usuario

### 💻 Código
```java
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VERIFICADOR PAR/IMPAR ===");
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        if(numero % 2 == 0) {
            System.out.println(numero + " es un número PAR");
        } else {
            System.out.println(numero + " es un número IMPAR");
        }
        
        // Método alternativo usando operador ternario
        String resultado = (numero % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("Resultado alternativo: " + numero + " es " + resultado);
        
        scanner.close();
    }
}
```

---

## 3. Conversor de Temperatura

### 🎯 Objetivo
Convertir temperaturas entre Celsius, Fahrenheit y Kelvin.

### 📝 Pasos
1. **Mostrar menú** de opciones de conversión
2. **Solicitar tipo de conversión** al usuario
3. **Solicitar temperatura** a convertir
4. **Aplicar fórmula** correspondiente
5. **Mostrar resultado** de la conversión

### 💻 Código
```java
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Celsius a Kelvin");
        System.out.println("4. Kelvin a Celsius");
        System.out.print("Seleccione una opción (1-4): ");
        
        int opcion = scanner.nextInt();
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();
        
        double resultado = 0;
        String unidadOrigen = "";
        String unidadDestino = "";
        
        switch(opcion) {
            case 1:
                resultado = celsiusAFahrenheit(temperatura);
                unidadOrigen = "°C";
                unidadDestino = "°F";
                break;
            case 2:
                resultado = fahrenheitACelsius(temperatura);
                unidadOrigen = "°F";
                unidadDestino = "°C";
                break;
            case 3:
                resultado = celsiusAKelvin(temperatura);
                unidadOrigen = "°C";
                unidadDestino = "K";
                break;
            case 4:
                resultado = kelvinACelsius(temperatura);
                unidadOrigen = "K";
                unidadDestino = "°C";
                break;
            default:
                System.out.println("Opción no válida");
                scanner.close();
                return;
        }
        
        System.out.printf("%.2f %s = %.2f %s%n", temperatura, unidadOrigen, resultado, unidadDestino);
        scanner.close();
    }
    
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
```

---

## 4. Contador de Vocales

### 🎯 Objetivo
Contar las vocales en una cadena de texto ingresada por el usuario.

### 📝 Pasos
1. **Solicitar texto** al usuario
2. **Convertir a minúsculas** para facilitar comparación
3. **Recorrer cada carácter** del texto
4. **Verificar si es vocal** (a, e, i, o, u)
5. **Contar vocales** encontradas
6. **Mostrar resultado** total

### 💻 Código
```java
import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CONTADOR DE VOCALES ===");
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        
        int contadorVocales = contarVocales(texto);
        
        System.out.println("Texto ingresado: \"" + texto + "\"");
        System.out.println("Número total de vocales: " + contadorVocales);
        
        // Mostrar detalle por vocal
        mostrarDetalleVocales(texto);
        
        scanner.close();
    }
    
    public static int contarVocales(String texto) {
        texto = texto.toLowerCase();
        int contador = 0;
        
        for(int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if(esVocal(caracter)) {
                contador++;
            }
        }
        
        return contador;
    }
    
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || 
               caracter == 'o' || caracter == 'u';
    }
    
    public static void mostrarDetalleVocales(String texto) {
        texto = texto.toLowerCase();
        int[] vocales = new int[5]; // a, e, i, o, u
        String[] nombres = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            switch(caracter) {
                case 'a': vocales[0]++; break;
                case 'e': vocales[1]++; break;
                case 'i': vocales[2]++; break;
                case 'o': vocales[3]++; break;
                case 'u': vocales[4]++; break;
            }
        }
        
        System.out.println("\nDetalle por vocal:");
        for(int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + ": " + vocales[i]);
        }
    }
}
```

---

## 5. Tabla de Multiplicar

### 🎯 Objetivo
Generar y mostrar la tabla de multiplicar de un número dado.

### 📝 Pasos
1. **Solicitar número** al usuario
2. **Usar bucle for** del 1 al 10 (o rango deseado)
3. **Calcular multiplicación** para cada iteración
4. **Formatear salida** de manera legible
5. **Mostrar tabla completa**

### 💻 Código
```java
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== GENERADOR DE TABLA DE MULTIPLICAR ===");
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        System.out.print("¿Hasta qué número desea la tabla? (por defecto 10): ");
        int limite = scanner.nextInt();
        
        if(limite <= 0) {
            limite = 10;
        }
        
        mostrarTabla(numero, limite);
        
        // Opción para mostrar múltiples tablas
        System.out.print("\n¿Desea ver tablas desde el 1 hasta " + numero + "? (s/n): ");
        char respuesta = scanner.next().toLowerCase().charAt(0);
        
        if(respuesta == 's') {
            mostrarMultiplesTablas(numero, limite);
        }
        
        scanner.close();
    }
    
    public static void mostrarTabla(int numero, int limite) {
        System.out.println("\n" + "=".repeat(25));
        System.out.println("   TABLA DEL " + numero);
        System.out.println("=".repeat(25));
        
        for(int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.printf("%2d x %2d = %3d%n", numero, i, resultado);
        }
    }
    
    public static void mostrarMultiplesTablas(int hasta, int limite) {
        for(int tabla = 1; tabla <= hasta; tabla++) {
            mostrarTabla(tabla, limite);
            System.out.println();
        }
    }
}
```

---

## 🚀 Consejos para Principiantes

### Buenas Prácticas
- **Usa nombres descriptivos** para variables y métodos
- **Comenta tu código** para explicar la lógica
- **Valida entradas** del usuario
- **Maneja casos especiales** (división por cero, números negativos)

### Métodos Útiles Aprendidos
- `Scanner.nextInt()`, `Scanner.nextDouble()`, `Scanner.nextLine()`
- `String.toLowerCase()`, `String.charAt()`, `String.length()`
- `System.out.printf()` para formateo
- Operadores: `+`, `-`, `*`, `/`, `%`
- Estructuras de control: `if-else`, `switch`, `for`

### Próximos Pasos
Una vez domines estos ejercicios básicos, puedes avanzar a:
- Trabajar con arrays y colecciones
- Programación orientada a objetos
- Manejo de excepciones
- Lectura/escritura de archivos

---

## 1. Gestión de Array

### 🎯 Objetivo
Crear un programa que maneje arrays de enteros y realice operaciones como encontrar el mayor, menor, promedio y ordenamiento.

### 📝 Pasos
1. **Solicitar tamaño del array** al usuario
2. **Llenar array con números** ingresados por el usuario
3. **Encontrar número mayor** y menor
4. **Calcular promedio** de todos los números
5. **Ordenar array** de menor a mayor
6. **Mostrar estadísticas** y array ordenado

### 💻 Código
```java
import java.util.Arrays;
import java.util.Scanner;

public class GestionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== GESTIÓN DE ARRAYS ===");
        System.out.print("¿Cuántos números desea ingresar? ");
        int tamaño = scanner.nextInt();
        
        int[] numeros = new int[tamaño];
        
        // Llenar el array
        System.out.println("Ingrese los números:");
        for(int i = 0; i < tamaño; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar array original
        System.out.println("\nArray original: " + Arrays.toString(numeros));
        
        // Calcular estadísticas
        EstadisticasArray stats = calcularEstadisticas(numeros);
        mostrarEstadisticas(stats);
        
        // Ordenar y mostrar
        int[] numerosOrdenados = numeros.clone();
        Arrays.sort(numerosOrdenados);
        System.out.println("Array ordenado: " + Arrays.toString(numerosOrdenados));
        
        // Buscar un número específico
        System.out.print("\n¿Qué número desea buscar? ");
        int numeroBuscado = scanner.nextInt();
        buscarNumero(numeros, numeroBuscado);
        
        scanner.close();
    }
    
    public static EstadisticasArray calcularEstadisticas(int[] array) {
        int mayor = array[0];
        int menor = array[0];
        long suma = 0;
        
        for(int numero : array) {
            if(numero > mayor) mayor = numero;
            if(numero < menor) menor = numero;
            suma += numero;
        }
        
        double promedio = (double) suma / array.length;
        
        return new EstadisticasArray(mayor, menor, promedio, suma);
    }
    
    public static void mostrarEstadisticas(EstadisticasArray stats) {
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Número mayor: " + stats.mayor);
        System.out.println("Número menor: " + stats.menor);
        System.out.printf("Promedio: %.2f%n", stats.promedio);
        System.out.println("Suma total: " + stats.suma);
    }
    
    public static void buscarNumero(int[] array, int numeroBuscado) {
        boolean encontrado = false;
        System.out.print("El número " + numeroBuscado + " se encuentra en las posiciones: ");
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == numeroBuscado) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }
        
        if(!encontrado) {
            System.out.print("No encontrado");
        }
        System.out.println();
    }
    
    // Clase para encapsular estadísticas
    static class EstadisticasArray {
        int mayor, menor;
        double promedio;
        long suma;
        
        public EstadisticasArray(int mayor, int menor, double promedio, long suma) {
            this.mayor = mayor;
            this.menor = menor;
            this.promedio = promedio;
            this.suma = suma;
        }
    }
}
```

---

## 2. Validador de Palíndromos

### 🎯 Objetivo
Crear un programa que determine si una palabra o frase es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).

### 📝 Pasos
1. **Solicitar texto** al usuario
2. **Normalizar texto** (minúsculas, sin espacios ni caracteres especiales)
3. **Comparar con su reverso** usando diferentes métodos
4. **Validar si es palíndromo**
5. **Mostrar resultado** detallado

### 💻 Código
```java
import java.util.Scanner;

public class ValidadorPalindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VALIDADOR DE PALÍNDROMOS ===");
        
        while(true) {
            System.out.print("Ingrese una palabra o frase (o 'salir' para terminar): ");
            String texto = scanner.nextLine();
            
            if(texto.equalsIgnoreCase("salir")) {
                break;
            }
            
            // Mostrar diferentes métodos de validación
            validarPalindromo(texto);
            System.out.println("-".repeat(50));
        }
        
        scanner.close();
    }
    
    public static void validarPalindromo(String texto) {
        System.out.println("\nTexto original: \"" + texto + "\"");
        
        // Normalizar texto
        String textoNormalizado = normalizarTexto(texto);
        System.out.println("Texto normalizado: \"" + textoNormalizado + "\"");
        
        // Método 1: Usando StringBuilder
        boolean esPalindromo1 = esPalindromoStringBuilder(textoNormalizado);
        
        // Método 2: Usando comparación de caracteres
        boolean esPalindromo2 = esPalindromoCaracteres(textoNormalizado);
        
        // Método 3: Usando recursión
        boolean esPalindromo3 = esPalindromoRecursivo(textoNormalizado, 0, textoNormalizado.length() - 1);
        
        System.out.println("\nResultados:");
        System.out.println("Método StringBuilder: " + (esPalindromo1 ? "SÍ es palíndromo" : "NO es palíndromo"));
        System.out.println("Método Caracteres: " + (esPalindromo2 ? "SÍ es palíndromo" : "NO es palíndromo"));
        System.out.println("Método Recursivo: " + (esPalindromo3 ? "SÍ es palíndromo" : "NO es palíndromo"));
        
        if(esPalindromo1) {
            mostrarEjemplosRelacionados();
        }
    }
    
    public static String normalizarTexto(String texto) {
        // Convertir a minúsculas y remover caracteres no alfabéticos
        return texto.toLowerCase()
                   .replaceAll("[^a-záéíóúñ]", "");
    }
    
    // Método 1: Usando StringBuilder para invertir
    public static boolean esPalindromoStringBuilder(String texto) {
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(textoInvertido);
    }
    
    // Método 2: Comparando caracteres desde los extremos
    public static boolean esPalindromoCaracteres(String texto) {
        int longitud = texto.length();
        
        for(int i = 0; i < longitud / 2; i++) {
            if(texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    // Método 3: Usando recursión
    public static boolean esPalindromoRecursivo(String texto, int inicio, int fin) {
        // Caso base
        if(inicio >= fin) {
            return true;
        }
        
        // Si los caracteres no coinciden
        if(texto.charAt(inicio) != texto.charAt(fin)) {
            return false;
        }
        
        // Llamada recursiva
        return esPalindromoRecursivo(texto, inicio + 1, fin - 1);
    }
    
    public static void mostrarEjemplosRelacionados() {
        System.out.println("\n📚 Ejemplos de palíndromos famosos:");
        String[] ejemplos = {
            "anita lava la tina",
            "a mamá roma le aviva el amor a papá",
            "dabale arroz a la zorra el abad",
            "reconocer",
            "somos"
        };
        
        for(String ejemplo : ejemplos) {
            System.out.println("• " + ejemplo);
        }
    }
}
```

---

## 3. Calculadora de Factorial

### 🎯 Objetivo
Implementar tanto la versión recursiva como iterativa para calcular el factorial de un número.

### 📝 Pasos
1. **Solicitar número** al usuario
2. **Validar entrada** (números negativos no tienen factorial)
3. **Calcular factorial** usando método iterativo
4. **Calcular factorial** usando método recursivo
5. **Comparar rendimiento** de ambos métodos
6. **Mostrar resultados** y estadísticas

### 💻 Código
```java
import java.math.BigInteger;
import java.util.Scanner;

public class CalculadoraFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE FACTORIAL ===");
        
        while(true) {
            System.out.print("Ingrese un número (o -1 para salir): ");
            int numero = scanner.nextInt();
            
            if(numero == -1) {
                break;
            }
            
            if(numero < 0) {
                System.out.println("❌ El factorial no está definido para números negativos");
                continue;
            }
            
            calcularYCompararFactoriales(numero);
            System.out.println("-".repeat(60));
        }
        
        scanner.close();
    }
    
    public static void calcularYCompararFactoriales(int numero) {
        System.out.println("\nCalculando factorial de " + numero + ":");
        
        // Método iterativo con medición de tiempo
        long inicioIterativo = System.nanoTime();
        long factorialIterativo = factorialIterativo(numero);
        long finIterativo = System.nanoTime();
        long tiempoIterativo = finIterativo - inicioIterativo;
        
        // Método recursivo con medición de tiempo
        long inicioRecursivo = System.nanoTime();
        long factorialRecursivo = factorialRecursivo(numero);
        long finRecursivo = System.nanoTime();
        long tiempoRecursivo = finRecursivo - inicioRecursivo;
        
        // Para números grandes, usar BigInteger
        BigInteger factorialGrande = factorialBigInteger(numero);
        
        // Mostrar resultados
        System.out.println("\n📊 Resultados:");
        System.out.println("Método Iterativo: " + factorialIterativo);
        System.out.println("Método Recursivo: " + factorialRecursivo);
        System.out.println("Usando BigInteger: " + factorialGrande);
        
        System.out.println("\n⏱️ Tiempos de ejecución:");
        System.out.printf("Iterativo: %,d nanosegundos%n", tiempoIterativo);
        System.out.printf("Recursivo: %,d nanosegundos%n", tiempoRecursivo);
        
        // Mostrar análisis de rendimiento
        if(tiempoIterativo < tiempoRecursivo) {
            System.out.println("🏆 El método iterativo fue más rápido");
        } else if(tiempoRecursivo < tiempoIterativo) {
            System.out.println("🏆 El método recursivo fue más rápido");
        } else {
            System.out.println("🤝 Ambos métodos tuvieron el mismo rendimiento");
        }
        
        // Mostrar secuencia de factoriales
        mostrarSecuenciaFactoriales(numero);
    }
    
    public static long factorialIterativo(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        
        long resultado = 1;
        for(int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static long factorialRecursivo(int n) {
        // Caso base
        if(n == 0 || n == 1) {
            return 1;
        }
        
        // Llamada recursiva
        return n * factorialRecursivo(n - 1);
    }
    
    public static BigInteger factorialBigInteger(int n) {
        BigInteger resultado = BigInteger.ONE;
        
        for(int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        
        return resultado;
    }
    
    public static void mostrarSecuenciaFactoriales(int hasta) {
        System.out.println("\n📈 Secuencia de factoriales hasta " + hasta + ":");
        
        for(int i = 0; i <= Math.min(hasta, 10); i++) {
            long factorial = factorialIterativo(i);
            System.out.printf("%2d! = %,d%n", i, factorial);
        }
        
        if(hasta > 10) {
            System.out.println("... (mostrando solo hasta 10! para mejor visualización)");
        }
    }
}
```

---

## 4. Generador de Números Primos

### 🎯 Objetivo
Crear un programa que genere todos los números primos hasta un límite dado usando diferentes algoritmos.

### 📝 Pasos
1. **Solicitar límite** al usuario
2. **Implementar verificación** de números primos
3. **Generar lista de primos** usando diferentes métodos
4. **Optimizar algoritmo** con Criba de Eratóstenes
5. **Mostrar estadísticas** y análisis de rendimiento

### 💻 Código
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GeneradorPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== GENERADOR DE NÚMEROS PRIMOS ===");
        System.out.print("Ingrese el límite superior: ");
        int limite = scanner.nextInt();
        
        if(limite < 2) {
            System.out.println("❌ El límite debe ser mayor o igual a 2");
            return;
        }
        
        // Método 1: Verificación simple
        System.out.println("\n🔍 Método 1: Verificación Simple");
        long inicio1 = System.currentTimeMillis();
        List<Integer> primosSimple = generarPrimosSimple(limite);
        long fin1 = System.currentTimeMillis();
        
        // Método 2: Criba de Eratóstenes
        System.out.println("\n🔍 Método 2: Criba de Eratóstenes");
        long inicio2 = System.currentTimeMillis();
        List<Integer> primosCriba = cribaEratostenes(limite);
        long fin2 = System.currentTimeMillis();
        
        // Mostrar resultados
        mostrarResultados(primosSimple, primosCriba, fin1 - inicio1, fin2 - inicio2, limite);
        
        // Análisis adicional
        analizarPrimos(primosSimple, limite);
        
        scanner.close();
    }
    
    public static List<Integer> generarPrimosSimple(int limite) {
        List<Integer> primos = new ArrayList<>();
        
        for(
