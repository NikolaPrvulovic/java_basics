package prvi_java_test;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //Zadatak (Petlje)
        //Napisati program koji petljom iscrtava toplomer. Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru
        //Primer izvrsenja 1:
        //Unesite donju granicu toplomera: 35
        //Unesite gornju granicu toplomera: 42
        //|-42  |
        //|-41  |
        //|-40  |
        //|-39  |
        //|-38  |
        //|-37  |
        //|-36  |
        //|-35  |
        //\      /
        // |    |
        //
        //Primer izvrsenja 2:
        //Unesite donju granicu toplomera: 34
        //Unesite gornju granicu toplomera: 40
        //|-40  |
        //|-39  |
        //|-38  |
        //|-37  |
        //|-36  |
        //|-35  |
        //|-34  |
        //\      /
        // |    |

        //Napisati program koji petljom iscrtava toplomer. Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite donju granicu toplomera: ");
        int donjaGranica = s.nextInt();
        System.out.print("Unesite gornju granicu toplomera: ");
        int gornjaGranica = s.nextInt();

        int razlika = gornjaGranica - donjaGranica;
        gornjaGranica +=1;
        for (int i = 0; i <= razlika; i++) {
            gornjaGranica -=1;
            System.out.print("|-");
            System.out.println(gornjaGranica + " |");

        }

        System.out.println("\\    /");
        System.out.println(" |  |");
    }
}
