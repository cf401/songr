package jack.kinne.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    int lengthSeconds;

    @ManyToOne
    Album album;

    public Song(){};

    public Song(String title, Integer lengthSeconds, Album album) {
        this.title = title;
        this.lengthSeconds = lengthSeconds;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    //A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
    //Ensure that the relationship between Albums and Songs is appropriately set up.
    //A user should be able to see information about all the songs on the site.
    //A user should be able to view a page with data about one particular album.
    //A user should be able to add songs to an album.
    //A user should be able to see the songs that belong to an album when looking at that album.
}
