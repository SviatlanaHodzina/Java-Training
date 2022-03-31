package by.epam.learn.collectionsCD;

import java.util.ArrayList;
import java.util.Comparator;

class AudioCD {

    ArrayList<AudioTrack> trackList;

    public AudioCD(ArrayList<AudioTrack> trackList) {
        this.trackList = trackList;
    }

    public void sortByGenre() {
        trackList.sort(Comparator.comparing(AudioTrack::getTrackGenre));
        trackList.indexOf(trackList);
        System.out.println("Sorted Track List by Genre: ");
        System.out.println(trackList + "\n");
    }

    public void getTotalTimeDuration() {
        float totalTimeDuration = 0;
        for (AudioTrack tracks : trackList) {
            totalTimeDuration = totalTimeDuration + tracks.getDuration();
        }
        System.out.println("TimeDuration of CD: ");
        System.out.println(totalTimeDuration + " minutes" + "\n");
    }

    public void getTracksInRange() {
        System.out.println("The tracks' duration in the range of 3.0 ÷ 4.0 minutes are: ");
        for (AudioTrack tracks : trackList) {
            if (tracks.getDuration() > 3.0 && tracks.getDuration() < 4.0) {
                System.out.println(tracks);
            }
        }
    }
}