package prvi_java_projekat_XO_v1_2;

public class XOTabla {

    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXIgraca;
    private String imeOIgraca;
    private String unosXO;
    private String igraSledeci;


    // geteri
    public String getImeXIgraca(){
        return this.imeXIgraca;
    }
    public String getImeOIgraca(){
        return this.imeOIgraca;
    }
    public String getIgraSledeci(){
        return this.igraSledeci;
    }

    // seteri
    public void setImeXIgraca(String imeXIgraca){
        this.imeXIgraca = imeXIgraca;
    }
    public void setImeOIgraca(String imeOIgraca){
        this.imeOIgraca = imeOIgraca;
    }
    public void setUnosXO (String unosIgraca){
        this.unosXO = unosIgraca;
    }

    // metode
    public void pokreniIgru(){
        this.polje1  = " ";
        this.polje2  = " ";
        this.polje3  = " ";
        this.polje4  = " ";
        this.polje5  = " ";
        this.polje6  = " ";
        this.polje7  = " ";
        this.polje8  = " ";
        this.polje9  = " ";
        this.igraSledeci = "X";
    }

    public void stampaj(){
        System.out.println(" " + this.polje1 + " | " + this.polje2 + " | " + this.polje3 + " ");
        System.out.println(" " + this.polje4 + " | " + this.polje5 + " | " + this.polje6 + " ");
        System.out.println(" " + this.polje7 + " | " + this.polje8 + " | " + this.polje9 + " ");

        if (!popunjenaTabla() && !pobednikX() && !pobednikO()) {
            System.out.println("Igrac X: " + this.imeXIgraca);
            System.out.println("Igrac O: " + this.imeOIgraca);
            System.out.println("Na redu je igrac: " + this.igraSledeci);
        }


    }

    public boolean poljePrazno (int izabranoPolje) {
        if(izabranoPolje == 1 && this.polje1.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 2 && this.polje2.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 3 && this.polje3.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 4 && this.polje4.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 5 && this.polje5.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 6 && this.polje6.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 7 && this.polje7.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 8 && this.polje8.equals(" ")){
            return true;
        }
        else if(izabranoPolje == 9 && this.polje9.equals(" ")){
            return true;
        }
        else {
            return false;
        }
    }
    public void zameniIgraca (){
        if (this.igraSledeci.equals("X")) {
            this.igraSledeci = "O";
        } else if (this.igraSledeci.equals("O")) {
            this.igraSledeci = "X";
        }
    }
    public void odigrajPotez (int izabranoPolje) {              // kada se poziva u glavnom programu pre toga pozvati skener za unosXO
        if (izabranoPolje == 1) {
            this.polje1 = this.unosXO;

        } else if (izabranoPolje == 2) {
            this.polje2 = this.unosXO;

        } else if (izabranoPolje == 3) {
            this.polje3 = this.unosXO;

        } else if (izabranoPolje == 4) {
            this.polje4 = this.unosXO;

        } else if (izabranoPolje == 5) {
            this.polje5 = this.unosXO;

        } else if (izabranoPolje == 6) {
            this.polje6 = this.unosXO;

        } else if (izabranoPolje == 7) {
            this.polje7 = this.unosXO;

        } else if (izabranoPolje == 8) {
            this.polje8 = this.unosXO;

        } else if (izabranoPolje == 9) {
            this.polje9 = this.unosXO;

        }


    }
    public boolean popunjenaTabla (){
        if (!this.polje1.equals(" ") && !this.polje2.equals(" ") && !this.polje3.equals(" ") && !this.polje4.equals(" ") &&
                !this.polje5.equals(" ") && !this.polje6.equals(" ") && !this.polje7.equals(" ") && !this.polje8.equals(" ") && !this.polje9.equals(" ")){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean pobednikX (){
        if ((this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")) ||
                (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")) ||
                (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")) ||
                (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")) ||
                (this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X")) ||
                (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")) ||
                (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")) ||
                (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X"))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean pobednikO (){
        if ((this.polje1.equals("O") && this.polje2.equals("O") && this.polje3.equals("O")) ||
                (this.polje1.equals("O") && this.polje4.equals("O") && this.polje7.equals("O")) ||
                (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O")) ||
                (this.polje2.equals("O") && this.polje5.equals("O") && this.polje8.equals("O")) ||
                (this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O")) ||
                (this.polje3.equals("O") && this.polje6.equals("O") && this.polje9.equals("O")) ||
                (this.polje4.equals("O") && this.polje5.equals("O") && this.polje6.equals("O")) ||
                (this.polje7.equals("O") && this.polje8.equals("O") && this.polje9.equals("O"))) {
            return true;
        } else {
            return false;
        }
    }




}
