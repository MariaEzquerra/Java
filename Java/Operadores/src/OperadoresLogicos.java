public class OperadoresLogicos {
    public static void main(String[] args) {

        //Los operadores lógicos evaluan la expresión en la que pueden estar implicados varios operandos y retornan
        //como resultado un valor booleano.

        int i = 3;
        int j = 5;

        //operador &&
        boolean resultado = (i > 0) && (j == 1); // true && false ==> false

        //operador ||
        boolean resultado2 = (i == 3) || (j == 8); // true || false ==> true

        //operador ternario
        //imaginemos que nos llega una BBDD en stock de pantalones de un determinado modelo
        int stock = 2;
        String resultado3 = (stock > 0) ? "Hay pantalones" : "No quedan pantalones en stock";
        System.out.println("resultado3 = " + resultado3);
    }
}
