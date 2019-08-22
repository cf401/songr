package jack.kinne.songr.models;

import jack.kinne.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    public Album findByTitle(String title);
}
