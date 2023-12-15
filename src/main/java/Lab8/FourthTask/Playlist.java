package Lab8.FourthTask;

import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<Song>{
    private List<Song> songs;
    public Playlist(List<Song> songs){
        this.songs=songs;
    }
    @Override
    public Iterator<Song> iterator(){
        return songs.iterator();
    }
}
