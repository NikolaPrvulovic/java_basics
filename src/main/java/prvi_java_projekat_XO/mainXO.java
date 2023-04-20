package prvi_java_projekat_XO;

import java.util.Scanner;

public class mainXO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        XOTabla igra1 = new XOTabla();

        System.out.print("Unesite ime X igraca: ");         // Unos imena za X i O igraca
        igra1.setImeXIgraca(s.next());
        System.out.print("Unesite ime O igraca: ");
        igra1.setImeOIgraca(s.next());

        igra1.pokreniIgru();                                // Pokretanje igre sa praznim poljima

        while (!igra1.popunjenaTabla() && !igra1.pobednikX() && !igra1.pobednikO()){                    // Ulazak u petlju dok se ne popune sva polja ili jedan od igraca ne pobedi
            igra1.stampaj();                                                             // Stampanje polja za igru
            System.out.print("Unesite polje koje zelite da odigrate(1-9): ");
            int polje = s.nextInt();

            while(!igra1.poljePrazno(polje)){                           // Pravimo ogranicenje da mogu da se koriste samo ponudjena polja, odnosno prazna
                if(polje > 9 || polje < 1){
                    System.out.print("Takvo polje ne postoji, izaberite drugo: ");
                } else {
                    System.out.print("Izabrano polje je popunjeno, izaberite drugo: ");
                }
                polje = s.nextInt();
            }

            System.out.print("Unesite X ili O: ");
            String xO = s.next().toUpperCase();                   // Unosenje vrednosti X ili O i prebacivanje u velika slova u slucaju da korisnik unese mala
            while(!xO.equals("X") && !xO.equals("O")){          // Pravimo ogranicenje da mogu da se unesu samo X i O
                System.out.print("Uneli ste pogresan znak, molim Vas unesite ponovo: ");
                xO = s.next().toUpperCase();
            }
            while(!igra1.getIgraSledeci().equals(xO)){            // Pravimo ogranicenje da ne moze da igra igrac koji nije na redu
                System.out.print("Na redu je igrac: " + igra1.getIgraSledeci() + ", molim Vas unesite njegov znak: ");
                xO = s.next().toUpperCase();
            }
            igra1.setUnosXO(xO);                    // Nakon uspesnog unosenja vrednost prenosimo u promenljivu iz klase XOTabla

            igra1.odigrajPotez(polje);              // Ovom metodom vrednost unosimo u izabrano polje

            if (igra1.pobednikX()){                 // Ako je pobednik igrac X ispisujemo tekst i izlazimo iz WHILE petlje
                System.out.println();
                System.out.println("Pobednik je igrac " + igra1.getIgraSledeci() + ": " + igra1.getImeXIgraca());
                igra1.stampaj();

            } else if (igra1.pobednikO()) {          // Ako je pobednik igrac O ispisujemo tekst i izlazimo iz WHILE petlje
                System.out.println();
                System.out.println("Pobednik je igrac " + igra1.getIgraSledeci() + ": " + igra1.getImeOIgraca());
                igra1.stampaj();

            } else if (igra1.popunjenaTabla()){     // Ako je tabla popunjena, a nemamo pobednika ispisujemo tekst i izlazimo iz WHILE petlje
                System.out.println();
                System.out.println("Igra je neresena.");
                igra1.stampaj();

            }

            igra1.zameniIgraca();               // Ako tabla nije popunjena i nemamo pobednika, menjamo igraca i igra sledeci
        }



    }
}
