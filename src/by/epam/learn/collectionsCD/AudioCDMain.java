package by.epam.learn.collectionsCD;

import java.util.ArrayList;

public class AudioCDMain {
    public static void main(String[] args) {

        ArrayList<AudioTrack> trackList = new ArrayList<>();

        trackList.add(0, new AudioTrack(1, "·Morcheeba ", "'Otherwise'", "Electronic", (float) 3.42));
        trackList.add(1, new AudioTrack(2, "·Jimmy Somerville ", "'To Love Somebody'", "Reggae", (float) 4.17));
        trackList.add(2, new AudioTrack(3, "·AHA ", "'Lifelines'", "Rock", (float) 4.17));
        trackList.add(3, new AudioTrack(4, "·Perry Como ", "'Magic Moments'", "Swing", (float) 2.42));
        trackList.add(4, new AudioTrack(5, "·Mr. Big ", "To Be With You'", "Rock", (float) 3.27));
        trackList.add(5, new AudioTrack(6, "·Hurts ", "'Stay'", "Techno-pop", (float) 3.55));

        System.out.println("Track List: ");
        System.out.println(trackList + "\n");

        trackList.add(0, new AudioTrack(1, "·The Beatles ", "I Will", "Rock/ Country", (float) 1.45));
        System.out.println("The track #1 is replaced with the following track: " + trackList.get(0) + "\n");

        AudioCD cd = new AudioCD(trackList);
        cd.getTotalTimeDuration();
        cd.sortByGenre();
        cd.getTracksInRange();
    }
}