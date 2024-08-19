package rikkei.academy;

public class Main2 {
    public static void main(String[] args) {
        Playable audioPlayer = new AudioPlayer();
        Playable videoPlayer = new VideoPlayer();

        audioPlayer.play();
        videoPlayer.play();
    }
}
