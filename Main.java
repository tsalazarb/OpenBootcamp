public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        int numeroIf = -3;

        if (numeroIf > 0) {
            System.out.println("POSITIVO");
        } else if (numeroIf < 0){
            System.out.println("NEGATIVO");
        } else{
            System.out.println("ES 0");
        }
        System.out.println("------------------------------------------------");
        //Ejercicio 2

        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile+=1;
            System.out.println(numeroWhile);

        }
        System.out.println("------------------------------------------------");

        //Ejercicio 3

        int numeroDoWhile=0;
        do{
            numeroDoWhile+=1;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile<3);

        System.out.println("------------------------------------------------");

        //Ejercicio 4

        int numeroFor=0;

        for (;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("------------------------------------------------");


        //Ejercicio 5

        var estacion = "Invierno";

        switch(estacion) {

            case "Verano":
                System.out.println("Es verano");
                break;

            case "Invierno":
                System.out.println("Es invierno");
                break;

            case "Primavera":
                System.out.println("Es primavera");
                break;

            case "Otoño":
                System.out.println("Es otoñpo");
                break;

            default:
                System.out.println("No hay estacion");

        }

    }


}