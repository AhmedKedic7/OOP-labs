package Lab8.FourthTask;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song>{
    private Iterator<Song> songIterator;
    private String targetGenre;
    private Song nextSong;

    public GenreFilterIterator(Playlist playlist, String targetGenre) {
        this.songIterator = playlist.iterator();
        this.targetGenre = targetGenre;
        findNextSong();
    }
    private void findNextSong() {
        nextSong = null;

        while (songIterator.hasNext()) {
            Song song = songIterator.next();
            if (song.getGenre().equals(targetGenre)) {

                nextSong = song;
                return;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return nextSong != null;
    }
    @Override
    public Song next(){
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs with the target genre");
        }

        Song currentSong = nextSong;
        findNextSong();
        return currentSong;
    }

}
