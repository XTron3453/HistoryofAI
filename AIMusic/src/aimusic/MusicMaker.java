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
                    else
                        {
                            pattern = pattern + notes.get(selector - 1) + "q ";
                        }
                    
                    if((n % 4 == 0) && (n != 16))
                        {
                            pattern = pattern + "| ";
                        }
                    
                }
            
            return pattern;
        }
    
    public String getTrueKey()
        {
            return trueKey;
        }
    
}
