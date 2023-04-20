package papir_kamen_makaze_vezba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Igra papirKamenMakaze = new Igra();

        System.out.print("Unesite ime prvog igraca: ");
        papirKamenMakaze.setImePrvogIgraca(s.next());
        System.out.print("Unesite ime drugog igraca: ");
        papirKamenMakaze.setImeDrugogIgraca(s.next());

        System.out.println("Igra pocinje. Igra se na 3 razlike.");
        papirKamenMakaze.igrajPapirKamenMakaze();
    }
}
