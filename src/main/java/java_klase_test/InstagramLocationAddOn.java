package java_klase_test;

public class InstagramLocationAddOn extends InstagramAddOn{

    private String nazivLokacije;


    //konstruktori
    public InstagramLocationAddOn(String id, int x, int y, int sirinaDodatka, int visinaDodatka, String nazivLokacije) {
        super(id, x, y, sirinaDodatka, visinaDodatka);
        this.nazivLokacije = nazivLokacije;
    }
    //getteri i setteri
    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    //metode
    @Override
    public int minimalnaSirinaDodatka() {
        return 100;
    }

    @Override
    public int minimalnaVisinaDodatka() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + this.getX() + ", " + this.getY() + "]" + " (" + this.visinaDodatka + ", " + this.sirinaDodatka + ") L " + this.nazivLokacije);
    }
}
