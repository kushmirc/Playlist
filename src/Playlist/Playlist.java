package Playlist;
import java.util.ArrayList;
public class Playlist {

    public static void main(String[] args) {
        //create playlist arraylist
        ArrayList<String> musicPlaylist = new ArrayList<String>();
        //add songs to playlist
        musicPlaylist.add("That's What Friends are For");
        musicPlaylist.add("Elderly Woman");
        musicPlaylist.add("The New Year");
        musicPlaylist.add("Love Like Rockets");
        musicPlaylist.add("Dear Prudence");
        musicPlaylist.add("Wings For Marie");
        musicPlaylist.add("Iin Desu Ka?");
        //display the playlist
        System.out.println(musicPlaylist);
        //display the number of songs in the playlist
        System.out.println(musicPlaylist.size());
    }
}
