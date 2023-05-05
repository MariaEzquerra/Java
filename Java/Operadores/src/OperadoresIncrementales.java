public class OperadoresIncrementales {
    public static void main(String[] args) {
        int a = 7;
        int d = 7;

        //Pre incremento
        int b = ++a;
        System.out.println("b = " + b); //8
        System.out.println("a = " + a); //8

        //Post incremento
        int c = a++;
        System.out.println("c = " + c); //8
        System.out.println("a = " + a); //9
    }
}
