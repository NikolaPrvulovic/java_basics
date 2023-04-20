package papir_kamen_makaze_vezba;

import java.util.Scanner;

public class Igra {
        // Na sajtu ChatGPT sam postavio zahtev da se napise zadatak papir,kamen, makaze u Java programskom jeziku i dobio sledece

        //Napravite klasu, koja će sadržati glavnu metodu "main".
        //
        //Napravite tri konstante u klasi "Igra", jednu za svaku moguću opciju (papir, kamen, makaze).
        //
        //Napravite metodu "pobednik" koja će primati dva argumenta, odabir igrača 1 i odabir igrača 2,
        // i vraćati rezultat pobede (igrač 1, igrač 2 ili nerešeno).
        //
        //Napravite metodu "igrajPapirKamenMakaze" koja će se ponavljati sve dok korisnik ne unese opciju za prekid igre.
        // Ova metoda treba da prosledi odabire igrača 1 i igrača 2 metodi "pobednik" i ispisuje rezultat pobede.
        //
        //Napravite metodu "ucitajOdabirIgraca" koja će primati broj igrača (1 ili 2) i vraćati odabir igrača (papir, kamen ili makaze).
        // Ova metoda treba da pročita unos sa standardnog ulaza i vrati odgovarajuću vrednost.
        //
        //U glavnoj metodi "main" pozovite metodu "igrajPapirKamenMakaze".
        //
        //To bi bio osnovni okvir zadatka za igru "papir, kamen, makaze" u programskom jeziku Java.
        // Nastavite sa implementacijom ovih metoda i dodajte bilo kakve druge funkcionalnosti koje želite da imate u igri.

        Scanner s = new Scanner(System.in);
        private String papir = "papir";
        private String kamen = "kamen";
        private String makaze = "makaze";
        private String imePrvogIgraca;
        private String imeDrugogIgraca;
        private int pobedjeneRundePrvog;
        private int pobedjeneRundeDrugog;
        private String odigraoPrvi;
        private String odigraoDrugi;
        private String odabirIgraca;


        public void setImePrvogIgraca(String imePrvogIgraca){
            this.imePrvogIgraca = imePrvogIgraca;
        }
        public void setImeDrugogIgraca(String imeDrugogIgraca){
            this.imeDrugogIgraca = imeDrugogIgraca;
        }

        private String pobednik(String odabirIgraca1, String odabirIgraca2){
            if(odabirIgraca1.equals(odabirIgraca2)){
                return "Oba igraca su odigrala isto. Niko ne dobija poene.";
            } else if(odabirIgraca1.equals(this.papir) && odabirIgraca2.equals(this.kamen)){
                this.pobedjeneRundePrvog++;
                return this.imePrvogIgraca + " dobija rundu jer je odigrao " + odabirIgraca1 + ", dok je " + this.imeDrugogIgraca + " odigrao " + odabirIgraca2;
            } else if (odabirIgraca1.equals(this.kamen) && odabirIgraca2.equals(this.makaze)){
                this.pobedjeneRundePrvog++;
                return this.imePrvogIgraca + " dobija rundu jer je odigrao " + odabirIgraca1 + ", dok je " + this.imeDrugogIgraca + " odigrao " + odabirIgraca2;
            } else if (odabirIgraca1.equals(this.makaze) && odabirIgraca2.equals(this.papir)){
                this.pobedjeneRundePrvog++;
                return this.imePrvogIgraca + " dobija rundu jer je odigrao " + odabirIgraca1 + ", dok je " + this.imeDrugogIgraca + " odigrao " + odabirIgraca2;
            } else {
                this.pobedjeneRundeDrugog++;
                return this.imeDrugogIgraca + " dobija rundu jer je odigrao " + odabirIgraca2 + ", dok je " + this.imePrvogIgraca + " odigrao " + odabirIgraca1;
            }
        }

        public void igrajPapirKamenMakaze (){

            // uslov za While petlju ispod mozemo da koristimo ako se igra na 3 runde
            //(pobedjeneRundePrvog != 3 && pobedjeneRundeDrugog != 3) &&
            //                    ((pobedjeneRundePrvog != 2 || pobedjeneRundeDrugog != 1) && (pobedjeneRundePrvog != 1 || pobedjeneRundeDrugog != 2))
            while ((this.pobedjeneRundePrvog - this.pobedjeneRundeDrugog) < 3 && (this.pobedjeneRundeDrugog - this.pobedjeneRundePrvog) < 3) {
                System.out.println();
                System.out.println("Na redu je igrac " + this.imePrvogIgraca);
                System.out.print("Unesite broj 1 (PAPIR) / 2 (KAMEN) / 3 (MAKAZE): ");
                this.odigraoPrvi = odabirIgraca(s.nextInt());
                if(this.odabirIgraca.equals("brojVanOpsega")){
                    this.odigraoPrvi = ponovniUnos();
                }

                System.out.println("Na redu je igrac " + this.imeDrugogIgraca);
                System.out.print("Unesite broj  1 (PAPIR) / 2 (KAMEN) / 3 (MAKAZE): ");
                this.odigraoDrugi = odabirIgraca(s.nextInt());
                if(this.odabirIgraca.equals("brojVanOpsega")){
                    this.odigraoDrugi = ponovniUnos();
                }


                System.out.println();
                System.out.println(pobednik(this.odigraoPrvi, this.odigraoDrugi));
                System.out.println("Trenutni rezultat je: ");
                System.out.println(this.imePrvogIgraca + ": " + this.pobedjeneRundePrvog);
                System.out.println(this.imeDrugogIgraca + ": " + this.pobedjeneRundeDrugog);

            }
            if ((this.pobedjeneRundeDrugog - this.pobedjeneRundePrvog) < 3){
                System.out.println("Pobednik je " + this.imePrvogIgraca);
            } else {
                System.out.println("Pobednik je " + this.imeDrugogIgraca);
            }
        }

        private String odabirIgraca (int broj){
            if(broj == 1){
                return this.odabirIgraca = this.papir;
            } else if (broj == 2) {
                return this.odabirIgraca = this.kamen;
            } else if (broj == 3){
                return this.odabirIgraca = this.makaze;
            } else {
                return this.odabirIgraca = "brojVanOpsega";
            }
        }

        private String ponovniUnos (){
            int ponovniUnos = 0;
            while(this.odabirIgraca.equals("brojVanOpsega")){
                System.out.print("Uneli ste pogresnu vrednost, molim Vas unesite ponovo: ");
                ponovniUnos = s.nextInt();
                if (ponovniUnos > 0 && ponovniUnos < 4){
                    odabirIgraca(ponovniUnos);
                }
            }
            return odabirIgraca(ponovniUnos);

        }






}
