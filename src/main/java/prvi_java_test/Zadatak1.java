package prvi_java_test;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Zadatak (Grananja)
        //Napisati program koji za dve unete osobe ispisuje koja je starija.
        // Za svaku osobu se od  podataka unosi ime, godina, mesec i dan rodjenja.
        // Na kraju programa ispisati koja je osoba starija.
        //
        //Primer izvrsenja 1:
        //Unesite ime prve osobe: Pera
        //Unesite godinu rodjenja prve osobe: 1998
        //Unesite mesec rodjenja prve osobe: 10
        //Unesite dan rodjenja prve osobe: 21
        //Unesite ime druge osobe: Mika
        //Unesite godinu rodjenja druge osobe: 1999
        //Unesite mesec rodjenja druge osobe: 12
        //Unesite dan rodjenja druge osobe: 15
        //Pera je stariji.
        //
        //Primer izvrsenja 2:
        //Unesite ime prve osobe: Pera
        //Unesite godinu rodjenja prve osobe: 1998
        //Unesite mesec rodjenja prve osobe: 10
        //Unesite dan rodjenja prve osobe: 21
        //Unesite ime druge osobe: Mika
        //Unesite godinu rodjenja druge osobe: 1998
        //Unesite mesec rodjenja druge osobe: 12
        //Unesite dan rodjenja druge osobe: 15
        //Pera je stariji.
        //
        //Primer izvrsenja 3:
        //Unesite ime prve osobe: Pera
        //Unesite godinu rodjenja prve osobe: 1998
        //Unesite mesec rodjenja prve osobe: 10
        //Unesite dan rodjenja prve osobe: 21
        //Unesite ime druge osobe: Mika
        //Unesite godinu rodjenja druge osobe: 1998
        //Unesite mesec rodjenja druge osobe: 10
        //Unesite dan rodjenja druge osobe: 15
        //Mika je stariji.
        //

        //Primer izvrsenja 4:
        //Unesite ime prve osobe: Pera
        //Unesite godinu rodjenja prve osobe: 1998
        //Unesite mesec rodjenja prve osobe: 10
        //Unesite dan rodjenja prve osobe: 21
        //Unesite ime druge osobe: Mika
        //Unesite godinu rodjenja druge osobe: 1998
        //Unesite mesec rodjenja druge osobe: 10
        //Unesite dan rodjenja druge osobe: 21
        //Iste su starosti.

        Scanner s = new Scanner(System.in);



            System.out.print("Unesite ime prve osobe: ");
            String imePrve = s.next();
            System.out.print("Unesite godinu rodjenja prve osobe: ");
            int godinaPrve = s.nextInt();
            System.out.print("Unesite mesec rodjenja prve osobe: ");
            int mesecPrve = s.nextInt();
            System.out.print("Unesite dan rodjenja prve osobe: ");
            int danPrve = s.nextInt();

            System.out.println();

            System.out.print("Unesite ime druge osobe: ");
            String imeDruge = s.next();
            System.out.print("Unesite godinu rodjenja druge osobe: ");
            int godinaDruge = s.nextInt();
            System.out.print("Unesite mesec rodjenja druge osobe: ");
            int mesecDruge = s.nextInt();
            System.out.print("Unesite dan rodjenja druge osobe: ");
            int danDruge = s.nextInt();


            if ((godinaPrve < godinaDruge) || (godinaPrve == godinaDruge && mesecPrve < mesecDruge) ||
                    (godinaPrve == godinaDruge && mesecPrve == mesecDruge && danPrve < danDruge)) {
                System.out.println(imePrve + " je stariji/a.");
            } else if (godinaPrve == godinaDruge && mesecPrve == mesecDruge && danPrve == danDruge) {
                System.out.println("Iste su starosti.");
            }
            else {
                System.out.println(imeDruge + " je stariji/a.");
            }

            }
}


