
public class Youtubevideo{
    private String url;
    public Youtubevideo(String url){
        this.url=url;
        load();
    }    
    public void load(){
        System.out.println("Loading video from"+this.url);
    }
    public void play(){
        Sysytem.out.println("Playing video from"+this.url);
    }
}