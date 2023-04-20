package prvi_java_test;

public class Zadatak5 {
    public static void main(String[] args) {
        //Zadatak (Metode)
        //Napisati metodu koja radi pakovanje nekog teksta u HTML elemente.
        // Metoda kao parametar prima tekst i tip, a vraca HTML element (String) sa proslednjenim tekstom.
        //Metoda podrzava sledece tipove:
        //bold, metoda pakuje tekst u <b>prosledjen tekst</b>
        //italic, metoda pakuje tekst u <em>proslednjen tekst</em>
        //paragraph, metoda pakuje tekst u <p>prosledjen tekst</p>
        //Ukoliko se prosledi tip koji nije podrzan, vraca se neupakovan tekst tj. vraca se nakav kakav je dosao umetodu
        //
        //U glavnom programu koristeci kreiranu metodu napisati porogram koji prikazuje sledeci tekst.
        //<b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
        //<p>Naravno samo je falio paragraf</p>

        String tekst1 = "Ovaj deo je bold";
        String bold = "bold";
        System.out.print(formatiranje(tekst1, bold) + ", a ");

        String tekst2 = "ovo je italic";
        String italic = "italic";
        System.out.println(formatiranje(tekst2, italic));

        String tekst3 = "Naravno samo je falio paragraf";
        String paragraf = "paragraf";
        System.out.println(formatiranje(tekst3, paragraf));
    }

    public static String formatiranje (String tekst, String tip){
        if(tip.equals("bold")){
            tekst = "<b>" + tekst + "</b>";
        } else if (tip.equals("italic")) {
            tekst = "<em>" + tekst + "</em>";
        } else if (tip.equals("paragraf")) {
            tekst = "<p>" + tekst + "</p>";
        }
        return tekst;
    }
}
