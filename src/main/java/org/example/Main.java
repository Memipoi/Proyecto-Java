package org.example;

import java.util.Scanner;




//public class Main {
//    public static void main(String[] args) {
//        //Declaracion de variable "TipoDeDatoDeLaVariable nombreDeLaVariable"
//        // Tipos de datos int - double - String - boolean
//        int miVariableInt1;
//        int miVariableInt2;
//        String miVariableCadena1;
//        double miVariableDouble = 100.54;
//        // Asignar un valor a una variable
//        miVariableInt1 = 10;
//        miVariableInt2 = 20;
//        miVariableCadena1 = "Damian";
//        String miVariableCadena2 = "Ojeda";
//
//        //System.out.println("Hola Mundo");
//        System.out.println(miVariableInt1+miVariableInt2);
//        System.out.println(miVariableCadena1+" "+miVariableCadena2);
//        System.out.println(miVariableCadena1+miVariableInt1);
//
//        //Operador + está sobrecargado, por que sirve para sumar dos numeros y para concatenar cadenas (dependiendo que variables quiera usar)
//        // Suma y concatenacion = +
//        // Resta -
//        // Multiplicacion *
//        // Division /
//        int suma = 100 + miVariableInt2;
//        System.out.println("El resultado de sumar 100 mas el valor de la variable miVariableInt2 es igual a: "+suma);
//
//        //Comparadores
//        // a==b  a>b  a<b  a<=b  a!=b a>=b
//        int edad = 15;
//        /*
//        if (condicion) {
//            codigo por verdadero
//        } else {
//            codigo porr falso
//        }
//
//        switch (variable){
//            case valor1: codigo; break;
//            case valor2: codigo; break;
//            case valor3: codigo; break;
//            case valor4: codigo; break;
//            default: codigo; break;
//        }
//        */
//
//        if (edad>=18){
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
//
//        String mes = "pepepe";
//        switch (mes){
//            case "Noviembre": case "Diciembre": case "Enero": case "Febrero":
//                System.out.println("Verano");
//                break;
//            case "Marzo": case "Abril": case "Mayo":
//                System.out.println("Otoño");
//                break;
//            case "Junio": case "Julio": case "Agosto":
//                System.out.println("Invierno");
//                break;
//            case "Septiembre": case "Octubre":
//                System.out.println("Primavera");
//                break;
//            default:
//                System.out.println("El mes ingresado no existe, o no está contemplado");
//                break;
//        }
//
//        if (mes == "Enero"){
//            System.out.println("Verano");
//        } else if (mes == "Febrero"){
//            System.out.println("Verano");
//        } else if (mes == "Marzo"){
//            System.out.println("Otoño");
//        } else if (mes == "Abril"){
//            System.out.println("Otoño");
//        } else if (mes == "Mayo") {
//            System.out.println("Otoño");
//        } else if (mes == "Junio"){
//            System.out.println("Otoño");
//        } else if (mes == "Julio"){
//            System.out.println("Invierno");
//        } else if (mes == "Agosto"){
//            System.out.println("Invierno");
//        } else if (mes == "Septiembre"){
//            System.out.println("Invierno");
//        } else if (mes == "Octubre") {
//            System.out.println("Invierno");
//        } else if (mes == "Noviembre"){
//            System.out.println("Primavera");
//        } else if (mes == "Diciembre"){
//            System.out.println("Primavera");
//        }
//
//        //Operadores logicos
//        // OR (||) - AND (&&) - NOT (!)
//        int val1 = 10;
//
//        if (val1>=0 && val1<=100){
//            System.out.println("EL numero pertenece al rango 0-100");
//        }
//
//        //Me dice si un numero no esta en el rango 100-200
//        if (val1<100 || val1>200){
//            System.out.println("val1 NO esta en el rango 100-200");
//        }
//
//        //Para subirse a la montaña rusa, hay que tener mas de 16 años y medir mas 1.30
//        //si conozco al operador del juego, me deja pasar sin inportar mi edad ni mi altura
//        int edad2 = 14;
//        double altura = 1.20;
//        boolean conozcoAlOperador = false;
//        if ( (edad2>16 && altura>1.30) || !conozcoAlOperador){
//            System.out.println("Si puede subirse");
//        } else {
//            System.out.println("No se puede subir");
//        }
//
//        //Estructuras Iterativas
//        /*
//        while (condicionDeCOntinuacion){
//            codigoARepetir;
//        }
//
//
//        */
//        //Forma de escribir los nombres de las variables camelCase (primera con minuscula y cada palabra nueva empieza con mayuscula)
//
//
//        //for (declaracion de variable; condicion de continuacion; paso)
//        // i++ == i = i+1
//        /*
//        for (int i = 1; i<=cantidaDeVueltasADar; i++){
//            System.out.println("Ya dí "+i+" vueltas");
//        }
//        */
//
//        //Como pedir un valor por consola???
//        //Vamos a usar una de clase de Java que se llama Scanner
///*
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Ingrese su numero");
//        int numero = myScanner.nextInt();
//
//        System.out.println("El cuadrado de "+numero+" es igual a "+funcionCuadratica(numero));
//        */
//
//        saludarPersona("Guille");
//        darVueltas(600000);
//
///*
//        System.out.println("Ingrese su nombre");
//        String miNombre = myScanner.next();
//
//        System.out.println("Ingrese su año de nacimiento");
//        int anioNacimiento = myScanner.nextInt();
//
//        System.out.println("Ingrese su mes de nacimiento con un numero (1-12)");
//        int mesNacimiento = myScanner.nextInt();
//
//        if (mesNacimiento<8){
//            System.out.println("Usted se llama "+miNombre+" y tiene "+(2023-anioNacimiento)+" años");
//        } else {
//            System.out.println("Usted se llama "+miNombre+" y tiene "+(2023-anioNacimiento-1)+" años");
//        }
//        */
//
//    }
//
//    //funcion cuadratica  f(x) = x*x
//    // f(4) = 16
//    //Estoy definiendo un metodo
//    //Debo definir si el metodo toma un parametro de entrada y si retorna un valor (y de que tipo es)
//    public static int funcionCuadratica(int miParam){
//        return miParam*miParam;
//    }
//
//    public static void saludarAlMundo(){
//        System.out.println("Voy a saludar...");
//        System.out.println("Hola mundo");
//    }
//
//    public static void saludarPersona(String nombrePersona){
//        System.out.println("Hola "+nombrePersona+". Como estas?");
//    }
//
//    public static void darVueltas(int cantidadDeVueltasADar){
//        //vueltasDadas = vueltasDadas+1 es equivalente a hacer vueltasDadas++
//        int vueltasDadas = 0;
//        while (vueltasDadas < cantidadDeVueltasADar){
//            vueltasDadas++;
//            System.out.println("Ya dí "+vueltasDadas+" vueltas");
//        }
//        System.out.println("Terminé");
//    }
//
//}

public class Main {
    public static void main(String[] args) {
        //1. Crear las variables correspondientes para leer tu nombre, apellido y edad e imprimirlos por consola en una oración.
/*        String nombre = "Melina Antonella";
        String apellido = "Mansilla";
        int edad = 24;
        System.out.println("Mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " anos");*/
/*----------------------------------------------------------------------*/
        //2. Realizar un pequeño programa que permita ingresar 3 número e imprimir por consola cuál es el mayor.

 /*       Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese su numero");
        int numero = myScanner.nextInt();

        System.out.println("Ingrese su segundo numero");
        int numero2 = myScanner.nextInt();

        System.out.println("Ingrese su tercer numero");
        int numero3 = myScanner.nextInt();

        if (numero <= numero2 && numero2 >= numero3) {
            System.out.println(numero2);
        } else if (numero >= numero2 && numero >= numero3) {
            System.out.println(numero);
        }
        else {
            System.out.println(numero3);
        }*/
/*-----------------------------------------------------------------------*/
        // 3. Realizar un pequeño programa que permita el ingreso de un número e imprimir por consola su paridad.

/*        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese su numero");
        int numero = myScanner.nextInt();
        if(numero % 2 == 0){
            System.out.println("El numero ingresado es par.");
        }else {
            System.out.println("El numero ingresado es Impar");
        }*/
/*----------------------------------------------------------------------*/
        //4. Crear el código correspondiente que permita ingresar 2 cadenas  de caracteres e imprima por consola si son iguales o no.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
        melichan
    }
}