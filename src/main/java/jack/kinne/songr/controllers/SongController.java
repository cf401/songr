package jack.kinne.songr.controllers;

import jack.kinne.songr.models.Album;
import jack.kinne.songr.models.AlbumRepository;
import jack.kinne.songr.models.Song;
import jack.kinne.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getAllMovies(Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "allSongs";
    }

    @PostMapping("/songs")
    public RedirectView addSong(String title, String artist, Integer lengthSeconds, String imageUrl, String album) {

        Album a = albumRepository.findByTitle(album);
        if (a == null) {
            //String title, String artist, int songCount, int secondsLength, String imageUrl
            a = new Album(album, artist, 1, lengthSeconds, imageUrl);
            albumRepository.save(a);
        }
        //todo: increment song count
        //albumRepository.findByTitle(album) ish, setting.
        //TODO: add total seconds of song to album total

        Song s = new Song(title, lengthSeconds, a);
        songRepository.save(s);
        return new RedirectView("/songs");
    }

}
