public class EstructuraSwitch {
    public static void main(String[] args) {
        //Dependiendo de un número del 1 al 7 imprimir el día de la semana
        int diaDeLaSemana = 2;

        /*
        switch (diaDeLaSemana){
            case1:
                System.out.println("lunes" );
            break;
            case2:
                System.out.println("martes" );
            break;
            case3:
                System.out.println("miércoles" );
            break;
            case4:
                System.out.println("jueves" );
            break;
            case5:
                System.out.println("viernes" );
            break;
            case6:
                System.out.println("sábado" );
            break;
            case7:
                System.out.println("domingo" );
            break;
            default:
                System.out.println("El dato es erróneo");
        }
        */

        switch (diaDeLaSemana){
            case1->System.out.println("lunes" );
            case2->System.out.println("martes" );
            case3->System.out.println("miércoles" );
            case4->System.out.println("jueves" );
            case5->System.out.println("viernes" );
            case6->System.out.println("sábado" );
            case7->System.out.println("domingo" );
            default->System.out.println("El dato es erróneo");
        }
    }
}
