package java_klase_test;

public class InstagramUser {
    private String username;
    private String imeprezime;

    //konstruktori
    public InstagramUser(String username) {
        this.username = username;
    }
    public InstagramUser(String username, String imeprezime) {
        this.username = username;
        this.imeprezime = imeprezime;
    }
    //getteri i setteri
    public String getUsername() {
        return username;
    }
    public String getImeprezime() {
        return imeprezime;
    }
    public void setImeprezime(String imeprezime) {
        this.imeprezime = imeprezime;
    }

    //metode
    public void stampaj(){
        System.out.println(this.username + "\t" + this.imeprezime);
    }
    public String linkDoProfila(){
        return "https://www.instagram.com/" + this.username + "/";
    }
}
