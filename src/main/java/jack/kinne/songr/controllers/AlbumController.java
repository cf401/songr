package jack.kinne.songr.controllers;

import jack.kinne.songr.models.Album;
import jack.kinne.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.Date;
import java.util.List;
@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllMovies(Model m) {
//        Movie theMovie = new Movie("Forrest Gump", "Robert Zemeckis", Date.valueOf("1994-07-06"), 72.0, "PG-13");
//        Movie secondMovie = new Movie("Shawshank Redemption", "Frank Darabont", Date.valueOf("1994-09-23"), 91.0, "R");
//        Movie[] movies = new Movie[]{theMovie, secondMovie};
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addMovie(String title, String artist, int songCount, int secondsLength, String imageUrl) {
        Album a = new Album(title, artist, songCount, secondsLength, imageUrl);
        albumRepository.save(a);
        return new RedirectView("/albums");
    }
}

//    String title;
//    String artist;
//    int songCount;
//    int secondsLength;
//    String imageUrl;