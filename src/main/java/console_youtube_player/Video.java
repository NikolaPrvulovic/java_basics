package console_youtube_player;

public class Video {
    private String id;
    private String naziv;
    private int duzina;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;

    // getteri

    public String getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getDuzina() {
        return duzina;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDislajkova() {
        return brojDislajkova;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }

    // konstruktor


    public Video(String id, String naziv, int duzina, int brojLajkova, int brojDislajkova, int brojPregleda) {
        this.id = id;
        this.naziv = naziv;
        this.duzina = duzina;
        this.brojLajkova = brojLajkova;
        this.brojDislajkova = brojDislajkova;
        this.brojPregleda = brojPregleda;
    }

    // metode
    public void lajkuj(){
        this.brojLajkova++;
    }
    public void dislajkuj(){
        this.brojDislajkova++;
    }
    public void pogledaj(){
        this.brojPregleda++;
    }

}
