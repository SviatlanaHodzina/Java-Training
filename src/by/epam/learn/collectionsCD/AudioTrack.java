package by.epam.learn.collectionsCD;

public class AudioTrack {
    String trackAuthor;
    String trackTitle;
    String trackGenre;
    int position;
    float duration;

    public AudioTrack(int position, String trackAuthor, String trackTitle, String trackGenre, float duration) {
        this.position = position;
        this.trackAuthor = trackAuthor;
        this.trackTitle = trackTitle;
        this.trackGenre = trackGenre;
        this.duration = duration;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getTrackAuthor() {
        return trackAuthor;
    }

    public void setTrackAuthor(String trackAuthor) {
        this.trackAuthor = trackAuthor;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    public String getTrackGenre() {
        return trackGenre;
    }

    public void setTrackGenre(String trackGenre) {
        this.trackGenre = trackGenre;
    }

    @Override
    public String toString() {
        return '\n' + "track#" + position + ": " + trackAuthor + "-" + trackTitle + '\t' + "(genre:  " + trackGenre + "):  " + duration + " min";
    }
}