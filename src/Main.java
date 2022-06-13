public class Main {
    public static void main(String[] args) {
        //Usar if, crear una condición que compare si la variable numero
        //es positivo, negativo, o 0.

        int numeroIf = -20;

        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if (numeroIf < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }

        //Bucle While,condición que la var numeroWhile sea inferior a 3,
        //el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        // Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Para el bucle Do While,misma estructura que en el While,
        // pero solo se debe ejecutar una vez.
        int numeroDo = 2;

        do {
            numeroDo ++;
            System.out.println(numeroDo);
        }while (numeroDo < 3);

        //Bucle For, crea una var numeroFor,tendrá como valor 0 y
        // su condición será que la variable sea igual o menor que 3,
        //se irá incrementando en 1 su valor cada vez que se ejecute,
        // mostrar por pantalla.

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch,crear la var estacion, y distintos case para las
        // cuatro estaciones del año. Dependiendo del valor de
        // la var estacion se deberá mandar un mensaje por consola
        // informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor
        // de la var no sea una estación.

        var estacion = "invierno";

        switch (estacion){
            case "verano" :
                System.out.println("Estamos en Verano");
                break;

            case "otonio" :
                System.out.println("Estamos en Otoño");
                break;

            case "invierno" :
                System.out.println("Estamos en Invierno");
                break;

            case "primavera" :
                System.out.println("Estamos en Primavera");
                break;

            default:
                System.out.println("El valor ingresado no corresponde a una estacion");

        }
    }
}