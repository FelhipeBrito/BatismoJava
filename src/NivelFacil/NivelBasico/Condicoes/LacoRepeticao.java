package NivelFacil.NivelBasico.Condicoes;

public class LacoRepeticao {
    public static void main(String[] args) {
        /*int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;*/

/*        while (numeroDeClones <= numeroMaximoDeClones){
            System.out.println("Naruto fez um clone das sombras numero: " + numeroDeClones);
            numeroDeClones++;
        }*/
     /*   for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("Hello " + i);
        }
*/

        java.util.ArrayList<String> futureMonths =
                new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:
                futureMonths.add("January");
            case 2:
                futureMonths.add("February");
            case 3:
                futureMonths.add("March");
            case 4:
                futureMonths.add("April");
            case 5:
                futureMonths.add("May");
            case 6:
                futureMonths.add("June");
            case 7:
                futureMonths.add("July");
            case 8:
                futureMonths.add("August");
            case 9:
                futureMonths.add("September");
            case 10:
                futureMonths.add("October");
            case 11:
                futureMonths.add("November");
            case 12:
                futureMonths.add("December");
                break;
            default:
                break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }

        }
    }
}
