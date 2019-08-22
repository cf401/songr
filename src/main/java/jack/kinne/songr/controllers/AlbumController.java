package jack.kinne.songr.controllers;

import jack.kinne.songr.models.Album;
import jack.kinne.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.Date;
import java.util.List;
@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums/{id}")
    public String getOneAlbum(@PathVariable long id, Model m) {
        Album a = albumRepository.findById(id).get();
        m.addAttribute("album", a);
        return "oneAlbum";
    }

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

}

//    String title;
//    String artist;
//    int songCount;
//    int secondsLength;
//    String imageUrl;