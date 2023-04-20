package console_youtube_player;

import java.util.Scanner;

public class YoutubePlayer {
    private Video videoStats;
    private int kvalitetVidea; // 144, 240, 360, 480, 720, 1080
    private String videoRezim; // mini player, bioskopski rezim, preko celog ekrana
    private int jacinaZvuka;
    private int trenutnoVremeUReprodukciji;

    // getteri
    public Video getVideoStats() {
        return videoStats;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public String getVideoRezim() {
        return videoRezim;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public int getTrenutnoVremeUReprodukciji() {
        return trenutnoVremeUReprodukciji;
    }

    // konstruktor
    public YoutubePlayer(){
        this.jacinaZvuka = 75;
        this.kvalitetVidea = 144;
        this.videoRezim = "Mini Player";
    }

    // metode
    public void ucitajVideo(Video video){
        this.videoStats = video;
        this.trenutnoVremeUReprodukciji = 0;
        this.videoStats.pogledaj();
        this.aktivirajMiniPlayerMod();

    }
    public void pojacaj(){
        this.jacinaZvuka += 10;
        if(this.jacinaZvuka > 100){
            this.jacinaZvuka = 100;
        }
    }
    public void smanji(){
        this.jacinaZvuka -= 10;
        if(this.jacinaZvuka < 0){
            this.jacinaZvuka = 0;
        }
    }
    public void postaviKvalitet(int brzinaInterneta){
        if(brzinaInterneta < 2){
            this.kvalitetVidea = 144;
        } else if (brzinaInterneta < 4) {
            this.kvalitetVidea = 240;
        } else if (brzinaInterneta < 6){
            this.kvalitetVidea = 360;
        } else if (brzinaInterneta < 8){
            this.kvalitetVidea = 720;
        } else {
            this.kvalitetVidea = 1080;
        }
    }
    public void aktivirajMiniPlayerMod(){
        this.videoRezim = "Mini Player Mode";
    }
    public void aktivirajCinemaMod(){
        this.videoRezim = "Cinema Mode";
    }
    public void aktivirajFullScreen(){
        this.videoRezim = "FullScreen Mode";
    }
    public void premotajUnapred(){
        this.trenutnoVremeUReprodukciji += 10;
        if (this.trenutnoVremeUReprodukciji > this.videoStats.getDuzina()){
            this.trenutnoVremeUReprodukciji = this.videoStats.getDuzina();
        }
    }
    public void premotajUnazad(){
        this.trenutnoVremeUReprodukciji -= 10;
        if (this.trenutnoVremeUReprodukciji < 0){
            this.trenutnoVremeUReprodukciji = 0;
        }
    }
    public void iscrtajZvuk(){
        System.out.print("Zvuk: <");
        for (int i = 0; i < this.jacinaZvuka/10; i++) {
            System.out.print("|");
        }
        if (this.jacinaZvuka == 0){
            System.out.print("/");
        }
        System.out.println();
    }
    public void iscrtajRezim(){
        if(this.videoRezim.equals("Mini Player Mode")){
            System.out.println("[]");
        } else if(this.videoRezim.equals("Cinema Mode")){
            System.out.println("[. . . .]");
        } else if(this.videoRezim.equals("FullScreen Mode")){
            System.out.println("[| | | |]");
        }
    }
    public void iscrtajTrenutnoVreme(){
        int minut = this.trenutnoVremeUReprodukciji / 60;
        int sekund = this.trenutnoVremeUReprodukciji % 60;
        int minutUkupno = this.videoStats.getDuzina() / 60;
        int sekundUkupno = this.videoStats.getDuzina() % 60;
        System.out.print(minut + ":" + sekund + " / " + minutUkupno + ":" + sekundUkupno + " ");
    }
    public void iscrtajTimeline(){
        int brojZvezdica = this.trenutnoVremeUReprodukciji * 100 / this.videoStats.getDuzina();
        int brojTackica = 100 - brojZvezdica;
        System.out.print("Timeline: ");
        for (int i = 0; i < brojZvezdica; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < brojTackica; i++) {
            System.out.print(".");
        }
        System.out.println();
    }
    public void iscrtaj() {
        Scanner s = new Scanner(System.in);
        System.out.print("Koliko MB/s je brzina vaseg interneta: ");
        postaviKvalitet(s.nextInt());

        String komanda = "";

        while(!(this.trenutnoVremeUReprodukciji >= this.videoStats.getDuzina()) && !komanda.equals("stop")) {

            iscrtajTrenutnoVreme();
            System.out.print("     ");
            iscrtajZvuk();
            iscrtajTimeline();
            System.out.println("Kvalitet: " + this.kvalitetVidea + "p");
            iscrtajRezim();
            System.out.println(this.videoStats.getNaziv());
            System.out.println("Likes: " + this.videoStats.getBrojLajkova() + " | Dislikes: " + this.videoStats.getBrojDislajkova());
            System.out.println(this.videoStats.getBrojPregleda() + " Pregleda");
            System.out.println();

            long startTime = System.currentTimeMillis();

            System.out.println("1 (Pojacaj) / 2 (Smanji)" + "\n" +
                    "3 (MiniPlayer) / 4 (CinemaPlayer) / 5 (FullScreen)" + "\n" +
                    "6 (Premotaj unazad) / 7 (Premotaj unapred)" + "\n" +
                    "l (Lajk) / d (Dislajk) / s (Share)" + "\n" +
                    "stop (Prekinite video)");
            System.out.print("Unesite komandu koju zelite: ");

            komanda = s.next();

            while(!komanda.equals("1") && !komanda.equals("2") && !komanda.equals("3") && !komanda.equals("4") && !komanda.equals("5") &&
                    !komanda.equals("6") && !komanda.equals("7") && !komanda.equals("l") && !komanda.equals("d") && !komanda.equals("s") && !komanda.equals("stop")){
                System.out.print("Uneli ste pogresnu komandu, unesite ponovo: ");
                komanda = s.next();
            }
            if(komanda.equals("1")){
                pojacaj();
            } else if (komanda.equals("2")) {
                smanji();
            } else if (komanda.equals("3")) {
                aktivirajMiniPlayerMod();
            } else if (komanda.equals("4")) {
                aktivirajCinemaMod();
            } else if (komanda.equals("5")) {
                aktivirajFullScreen();
            } else if (komanda.equals("6")) {
                premotajUnazad();
            } else if (komanda.equals("7")){
                premotajUnapred();
            } else if (komanda.equals("l")){
                this.videoStats.lajkuj();
            } else if (komanda.equals("d")){
                this.videoStats.dislajkuj();
            } else {
                System.out.println("YouTube link: " + shareVideo());  // ova stampa se obavlja i kada se unese stop, ali to sam ostavio tako
            }


            long endTime = System.currentTimeMillis();

            this.trenutnoVremeUReprodukciji += (endTime - startTime) / 1000;
            if (this.trenutnoVremeUReprodukciji > this.videoStats.getDuzina()){
                this.trenutnoVremeUReprodukciji = this.videoStats.getDuzina();
            }
            System.out.println("_____________________________________________________________________");
            System.out.println();
        }

        iscrtajTrenutnoVreme();
        System.out.print("     ");
        iscrtajZvuk();
        iscrtajTimeline();
        System.out.println("Kvalitet: " + this.kvalitetVidea + "p");
        iscrtajRezim();
        System.out.println(this.videoStats.getNaziv());
        System.out.println("Likes: " + this.videoStats.getBrojLajkova() + " | Dislikes: " + this.videoStats.getBrojDislajkova());
        System.out.println(this.videoStats.getBrojPregleda() + " Pregleda");
        System.out.println();
    }
    public String shareVideo(){
        return "https://youtu.be/" + this.videoStats.getId();
    }
}
