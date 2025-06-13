package Calculadora;

import java.util.Scanner; //PROFE ACA PONDRE LOS COMENTARIOS, SCANNER SE OCUPA PARA INTERACTUAR CON LA CONSOLA

class Calculator {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);// PROFE PUSE ACA PARA LA INTERACCION DE LA CONSOLA(in)

        System.out.print("Ingresar el primer número porfavor: "); //PROFE ESTA PARTE DE ACA ES LA SALIDA A LA CONSOLA, PODRIAMOS DECIR QUE ES LO QUE VE EL USUARIO(INTERACCION)
        double primerNumero = teclado.nextDouble();

        System.out.print("Ingresar el segundo número porfavor: "); //ACA ES LO MISMO QUE ARRIBA (PUSE DOUBLE PARA LOS DECIMALES)
        double segundoNumero = teclado.nextDouble();

        // PROFE ACA PUSO LO DE LAS OPERACIONES CON SUS NOMBRES SIGNIFICATIVOS Y ESTOY DECLARANDO LAS VARIABLES
        double suma = primerNumero + segundoNumero;
        double resta = primerNumero - segundoNumero;
        double multiplicacion = primerNumero * segundoNumero;
        double division;
        double modulo;

        // ACA HAY UNA CONDICIONANTE DE LA VARIABLE DIVISION Y MODULO, PORQUE SI EL SEGUNDO NUMERO ES 0 , SE OBTIENE UN ERROR
        if (segundoNumero != 0) {
            division = primerNumero / segundoNumero;
            modulo = primerNumero % segundoNumero;
        } else {
            System.out.println("No se puede dividir ni calcular el módulo porque el segundo número es cero.");
            division = 0;    //EN ESTA PARTE INVESTIGUE, SE LE DEBE DAR UN VALOR AL ERROR , YA QUE JAVA LO TOMA COMO ERROR? TENGO DUDAS CON ESO
            modulo = 0;
        }


        System.out.println("Resultados de las operaciones aritmeticas:");
        System.out.println("Suma: " + suma);    // BUENO ACA ESTA EL TEMA DE LA CONCANETACION, PARA QUE SE MUESTRE EN LA CONSOLA
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);


        if (segundoNumero != 0) {
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);
        } else {
            System.out.println("No se puede dividir ni calcular el módulo por cero.");
            System.out.println("fin de la actividad");
        }



    }
}