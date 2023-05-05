public class EstructuraWhileYDoWhile {
    public static void main(String[] args) {

       int i = 0;
/*
       while (i != 0){
           System.out.println("He entrado en el bucle while");


       }

       do {
           System.out.println("He entrado en el bucle do while");
       }while (i != 0);

*/
        //Listar por consola del 0 al 100
        while (i <= 100){
            System.out.println(i);
            //Dentro de un while es importante modificar el valor de la condición porque de lo contrario
            //entrearíamos en un bucle infinito
            i++;
        }

        int c = 0;
        do {
            System.out.println(c);
            c++;
        }while (c < 20);

    }
}
