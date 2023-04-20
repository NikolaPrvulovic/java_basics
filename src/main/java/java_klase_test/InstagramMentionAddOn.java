package java_klase_test;

public class InstagramMentionAddOn extends InstagramAddOn{

    private InstagramUser user;

    //konstruktori
    public InstagramMentionAddOn(String id, int x, int y, int sirinaDodatka, int visinaDodatka, InstagramUser user) {
        super(id, x, y, sirinaDodatka, visinaDodatka);
        this.user = user;

    }

    //getteri i setteri
    public String getTagovanKorisnik() {
        return this.user.getImeprezime();
    }
    public void setTagovanKorisnik(String tagovanKorisnik) {
        this.user.setImeprezime(tagovanKorisnik);
    }

    //metode
    @Override
    public int minimalnaSirinaDodatka() {
        return 80;
    }
    @Override
    public int minimalnaVisinaDodatka() {
        return 50;
    }
    @Override
    public void stampaj() {

        System.out.println("[" + this.getX() + ", " + this.getY() + "]" + " (" + this.visinaDodatka + ", " + this.sirinaDodatka + ") @" + this.user.getUsername() + " / " + this.user.linkDoProfila());

    }
}
