public class OperadoresAsignacion {
    public static void main(String[] args) {
        //Asignación pura
        int a = 7;

        //Asignaciones abreviadas
        a += 4; //es lo mismo que a = a + 4
        a -= 4; //es lo mismo que a = a - 4
        a *= 4; //es lo mismo que a = a * 4
        a /= 4; //es lo mismo que a = a / 4
        a %= 4; //es lo mismo que a = a % 4

        System.out.println("a = " + a);
    }
}
