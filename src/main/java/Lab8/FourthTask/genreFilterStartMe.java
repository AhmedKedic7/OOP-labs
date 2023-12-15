package Lab8.FourthTask;

import java.util.Iterator;
import java.util.List;

public class genreFilterStartMe {
    public static void main(String[] args) {
        List<Song> songs=List.of(
                new Song("Ljubav u doba kokaina", "Dino Merlin", "Pop"),
                new Song("Stanica Podlugovi", "Đorđe Balašević", "Rock"),
                new Song("Pusti, pusti modu", "Crvena Jabuka", "Pop"),
                new Song("Kad bi dao Bog", "Zdravko Čolić", "Pop"),
                new Song("Gracija", "Halid Bešlić", "Pop")
        );

        Playlist playlist = new Playlist(songs);

        GenreFilterIterator popGenreIterator = new GenreFilterIterator(playlist, "Pop");

        while (popGenreIterator.hasNext()) {
            Song song = popGenreIterator.next();
            System.out.println(song);
        }
    }



}
