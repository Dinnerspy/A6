/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbsj.cs2383;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Insertion;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Nicholas
 */
public class A7 {

    
    public static void main(String[] args) {
        MinPQ<Double> mini;
        mini = new MinPQ();
     
        Double[] Word ={3.4, 3.2, 4.2, 12.0, 13.2};

        Collections.shuffle(Arrays.asList(Word));
        Double[] Insert = Word;
        Insert =Word.clone();
        
        Insertion.sort(Insert);
 
        for(int i =0; i<Word.length;i++){
        
        mini.insert(Word[i]);
        
        }
        
        mini.iterator();
        
        for(int j = 0; j<Word.length;j++){
        
        Word[j] = mini.delMin();

        
        }
        
       
        
        
        
    }

}
