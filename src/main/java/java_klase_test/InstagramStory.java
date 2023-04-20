package java_klase_test;

import java.util.ArrayList;

public class InstagramStory {
    private InstagramUser autorStorija;
    private String linkZaSwipeUp;
    private String linkDoSlike;  // https://www.instagram.com/p/CecrcPyrPMj
    private ArrayList<InstagramAddOn> nizDodataka;
    private ArrayList<InstagramUser> nizKorisnika;

    //konstruktori
    public InstagramStory(String linkDoSlike, InstagramUser autorStorija) {
        this.linkDoSlike = linkDoSlike;
        this.nizDodataka = new ArrayList<InstagramAddOn>();
        this.nizKorisnika = new ArrayList<InstagramUser>();
        this.autorStorija = autorStorija;

    }
    //getteri i setteri
    public String getAutorStorija() {
        return autorStorija.getImeprezime();
    }
    public String getLinkZaSwipeUp() {
        return linkZaSwipeUp;
    }
    public String getLinkDoSlike() {
        return linkDoSlike;
    }
    public ArrayList<InstagramAddOn> getNizDodataka() {
        return nizDodataka;
    }
    public ArrayList<InstagramUser> getNizKorisnika() {
        return nizKorisnika;
    }
    public void setLinkZaSwipeUp(String linkZaSwipeUp) {
        this.linkZaSwipeUp = linkZaSwipeUp;
    }
    //metode
    public void dodajDodatak(InstagramAddOn dodatak){
        this.nizDodataka.add(dodatak);
    }
    public void obrisiDodatak(String dodatakID){
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            if(this.nizDodataka.get(i).getId().equals(dodatakID)){
                this.nizDodataka.remove(i);
            }

        }
    }
    private boolean jePogledao (String username){
        for (int i = 0; i < this.nizKorisnika.size(); i++) {
            if (this.nizKorisnika.get(i).getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    public void pogedajStory(InstagramUser user){
        if(!jePogledao(user.getUsername())){
                this.nizKorisnika.add(user);
            }
    }
    public void postaviStory(){
        System.out.println("@" + this.autorStorija.getUsername() + "     " + this.autorStorija.getImeprezime());
        System.out.println("Story: ");
        System.out.println("Image: " + this.linkDoSlike);
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            this.nizDodataka.get(i).stampaj();
        }
        if(this.linkZaSwipeUp != null){
            System.out.println("SwipeUp:" + this.linkZaSwipeUp);
            System.out.println("http://google.com");
        }
    }

    public int brojPregleda(){
        int counter = 0;
        for (int i = 0; i < this.nizKorisnika.size(); i++) {
                counter++;
        }
        return counter;
    }
    public void stampajPreglede(){
        System.out.println("Viewers: " + this.brojPregleda());
        for (int i = 0; i < this.nizKorisnika.size(); i++) {
            System.out.println("@" + this.nizKorisnika.get(i).getUsername() + "   " + this.nizKorisnika.get(i).getImeprezime());
        }


    }

}
