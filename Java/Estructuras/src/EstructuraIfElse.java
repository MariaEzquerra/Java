public class EstructuraIfElse {
    public static void main(String[] args) {
        //Si tenemos dinero y disponemos de tiempo nos vamos de vacaciones
        //Si tenemos más de 500€ nos vamos a Salou.
        // Si tenemos menos de 500€ nos vamos a Ereagaç

        int miDinero = 100;
        boolean dispongoTiempo = true;

        if (miDinero > 0 && dispongoTiempo){
            //System.out.println("Me voy de vacaciones");
            if(miDinero >= 500){
                System.out.println("Me voy de vacaciones a Salou");
            }else{
            System.out.println("Me voy a la playa de Ereaga");
            }
        }else{
            System.out.println("Me voy a la ría");
        }
    }
}
