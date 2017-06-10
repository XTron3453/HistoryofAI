/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aimusic;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class KeyManager 
{
    private ArrayList<String> notes;
    private String keys[] = {"C", "C#", "D", "Eb", "E", "F", 
        "F#", "G", "Ab", "A", "A#", "B"};
    private String key;        
    
    public KeyManager(String key)
        {
            notes = new ArrayList<>();
            this.key = key;
            
        }
    
    public KeyManager(int key)
        {
            notes = new ArrayList<>();
            this.key = keys[key - 1];
        }
    
    public ArrayList<String> getNotes()
        {
            if(key.equals("C") || key.equals("Am") || key.equals("B#"))
                {
                    notes.add("C");
                    notes.add("D");
                    notes.add("E");
                    notes.add("F");
                    notes.add("G");
                    notes.add("A");
                    notes.add("B");
                }
            else if(key.equals("C#") || key.equals("A#m") || key.equals("Db"))
                {
                    notes.add("C#");
                    notes.add("D#");
                    notes.add("E#");
                    notes.add("F#");
                    notes.add("G#");
                    notes.add("A#");
                    notes.add("B#");
                }
            else if(key.equals("D") || key.equals("Bm"))
                {
                    notes.add("C#");
                    notes.add("D");
                    notes.add("E");
                    notes.add("F#");
                    notes.add("G");
                    notes.add("A");
                    notes.add("B");
                }
            else if(key.equals("D#") || key.equals("B#m") || key.equals("Eb"))
                {
                    notes.add("C");
                    notes.add("D");
                    notes.add("Eb");
                    notes.add("F");
                    notes.add("G");
                    notes.add("Ab");
                    notes.add("Bb");
                }
            else if(key.equals("E") || key.equals("Cm") || keys.equals("Fb"))
                {
                    notes.add("C#");
                    notes.add("D#");
                    notes.add("E");
                    notes.add("F#");
                    notes.add("G#");
                    notes.add("A");
                    notes.add("B");
                }
            else if(key.equals("F") || key.equals("Dm") || key.equals("Fb") || key.equals("E#"))
                {
                    notes.add("C");
                    notes.add("D");
                    notes.add("E");
                    notes.add("F");
                    notes.add("G");
                    notes.add("A");
                    notes.add("Bb");
                }
            
            else if(key.equals("F#") || key.equals("D#m") || keys.equals("Fb"))
                {
                    notes.add("C#");
                    notes.add("D#");
                    notes.add("E#");
                    notes.add("F#");
                    notes.add("G#");
                    notes.add("A#");
                    notes.add("B");
                }
            
            else if(key.equals("G") || key.equals("Em"))
                {
                    notes.add("C");
                    notes.add("D");
                    notes.add("E");
                    notes.add("F#");
                    notes.add("G");
                    notes.add("A");
                    notes.add("B");
                }
            
            else if(key.equals("Ab") || key.equals("Fm") || key.equals("G#"))
                {
                    notes.add("C");
                    notes.add("Db");
                    notes.add("Eb");
                    notes.add("F");
                    notes.add("G");
                    notes.add("Ab");
                    notes.add("Bb");
                }
            
            else if(key.equals("A") || key.equals("F#m"))
                {
                    notes.add("C#");
                    notes.add("D");
                    notes.add("E");
                    notes.add("F#");
                    notes.add("G#");
                    notes.add("A");
                    notes.add("B");
                }
            
            else if(key.equals("Bb") || key.equals("Gm") || keys.equals("A#"))
                {
                    notes.add("C");
                    notes.add("D");
                    notes.add("Eb");
                    notes.add("F");
                    notes.add("G");
                    notes.add("A");
                    notes.add("Bb");
                }
            
            else if(key.equals("B") || key.equals("G#m") || keys.equals("Cb"))
                {
                    notes.add("C#");
                    notes.add("D#");
                    notes.add("E");
                    notes.add("F#");
                    notes.add("G#");
                    notes.add("A#");
                    notes.add("B");
                }
            
            return notes;
        }
    
}
