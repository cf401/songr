package jack.kinne.songr.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    int secondsLength;
    String imageUrl;

    //An Album has a title,
    // an artist,
    // a songCount,
    // a length (in seconds),
    // and an imageUrl that is a link to that album’s art.

    public Album() {
    }

    public Album(String title, String artist, int songCount, int secondsLength, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.secondsLength = secondsLength;
        this.imageUrl = imageUrl;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setSecondsLength(int secondsLength) {
        this.secondsLength = secondsLength;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getSecondsLength() {
        return secondsLength;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
