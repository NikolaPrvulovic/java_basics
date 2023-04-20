package java_klase_test;

public abstract class InstagramAddOn {
    protected String id;
    protected int x;
    protected int y;
    protected int sirinaDodatka;
    protected int visinaDodatka;

    //konstruktor
    public InstagramAddOn(String id, int x, int y, int sirinaDodatka, int visinaDodatka) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.sirinaDodatka = sirinaDodatka;
        this.visinaDodatka = visinaDodatka;
    }
    //getteri
    public String getId() {
        return id;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getSirinaDodatka() {
        return sirinaDodatka;
    }
    public int getVisinaDodatka() {
        return visinaDodatka;
    }

    //metode
    public abstract int minimalnaSirinaDodatka();
    public abstract int minimalnaVisinaDodatka();
    public void povecanjeDimenzija(int povecanjeVisine, int povecanjeSirine){
        this.sirinaDodatka += povecanjeSirine;
        this.visinaDodatka += povecanjeVisine;
    }
    public void smanjenjeDimenzija(int smanjenjeVisine, int smanjenjeSirine){
        this.sirinaDodatka -= smanjenjeSirine;
        this.visinaDodatka -= smanjenjeVisine;
        if(this.sirinaDodatka < minimalnaSirinaDodatka()){
            this.sirinaDodatka = minimalnaSirinaDodatka();
        }
        if(this.visinaDodatka < minimalnaVisinaDodatka()){
            this.visinaDodatka = minimalnaVisinaDodatka();
        }
    }
    public abstract void stampaj();

}
