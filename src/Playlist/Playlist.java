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
        //remove a song by index, and display the new size
        musicPlaylist.remove(1);
        System.out.println(musicPlaylist.size());
        //remove a song by string, and display the new size
        musicPlaylist.remove("Wings For Marie");
        System.out.println(musicPlaylist.size());
        //declare variables to accomplish a song swap
        int indexA = musicPlaylist.indexOf("Iin Desu Ka?");
        int indexB = musicPlaylist.indexOf("The New Year");
    }
}
