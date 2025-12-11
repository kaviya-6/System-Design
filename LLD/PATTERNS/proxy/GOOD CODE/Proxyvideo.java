public class Proxyvideo{
    Youtubevideo instance;
    private String url;

    public proxyvideo(String url){
        this.url=url;
    }
    public void play(){
        if(instance==null){
            instance=new Yutubevideo(this.url);
        }
        instance.play();
    }
}