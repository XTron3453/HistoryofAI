/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aimusic;

import java.util.ArrayList;
import org.jfugue.player.Player;

/**
 *
 * @author Michael
 */
public class AIMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Note: currently the song can only use Piano, and have 16 quarter notes, further
//Customization will be added in if time permits

//The key is entered into this string, I would like this input to take place n a seperate window
        String music;        
        String key;
        key = "C#";
        
        Player player = new Player();
//KeyManager selects notes in key and takes in parameter key to determine it
        KeyManager keyManager = new KeyManager(key);
        ArrayList<String> notes;
//Notes from key are inputed inb the notes in the main
        notes = keyManager.getNotes();
//Musicmaker creates a random set of notes using the notes of the key and the key
        MusicMaker musicMaker = new MusicMaker(notes, key);
        
        music = musicMaker.makeMusic();
        
//Plays tune
        System.out.println(music);
        player.play(music);
        
        
        
        
    }
    
}
