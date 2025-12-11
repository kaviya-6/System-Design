public class YoutubeVideo implements Video {
    private String url;

    public YoutubeVideo(String url) {
        this.url = url;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video from " + url);
    }
    
    @Override
    public void play() {
        System.out.println("Playing video from " + url);
    }
}
