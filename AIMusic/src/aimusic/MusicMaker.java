/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aimusic;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Michael
 */
public class MusicMaker 
{
    
    private Random rand;
    private ArrayList<String> notes;
    private String pattern;
    private String key;
    private String trueKey;
    
    
    public MusicMaker(ArrayList<String> notes, String key)
        {
            this.notes = notes;
            this.key= key;
            rand = new Random();
        }
//First: It checks if the key is minor, the purpose of this is to make that we 
//start the song on the note of the key, so we need to remove the "m" from the
//minor notation for the player to work. It will remove the "m" and add that note first
    public String makeMusic()
        {
            boolean minorKey = false;
            int selector;
            for(int n = 1; n <= 16; n++)
                {
                    selector = rand.nextInt(7) + 1;
                    if(n == 1)
                        {
                            
                            pattern = "V0 I[Piano] ";
                            
                            for(int m = 0; m < key.length(); m++)
                                {
                                    if(key.substring(m, m + 1).equals("m"))
                                        {
                                            trueKey = key.substring(0, m);
                                            pattern = trueKey + "q ";
                                            minorKey = true;                                            
                                        }
                                }
                            
                            if(!minorKey)
                                {
                                    trueKey = key;
                                    pattern = key + "q ";
                                }
                                                                                                 
                        }
//Second: It adds random notes in the key based off a random generator
                    else
                        {
                            pattern = pattern + notes.get(selector - 1) + "q ";
                        }
//Third: every four notes it adds a measure (for proper notation)
                    
                    if((n % 4 == 0) && (n != 16))
                        {
                            pattern = pattern + "| ";
                        }
                    
                }
//Returns the String of music notation
            return pattern;
        }
//Returns the "tonic" or first note of the scale
    public String getTrueKey()
        {
            return trueKey;
        }
    
}
