/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbsj.cs2383;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.MinPQ;
import java.util.Arrays;
import java.util.Collections;
import org.openjdk.jmh.annotations.*;
import java.util.Random;



@State(Scope.Benchmark)
public class MyBenchmark {
 
    /**
     *
     */

@State(Scope.Benchmark)
public static class BenchState {

   public Double[] Master;


}



    @Param({"25","50","100","200","400","500"})
public int n;

   
   @Benchmark
public void PQ (BenchState st) {
    Double[] Temp =this.FillMaster(st).clone();

 MinPQ<Double> mini;
        mini = new MinPQ();
    for (Double Temp1 : Temp) {
        mini.insert(Temp1);
    }
}


    @Benchmark
public void Insert (MyBenchmark.BenchState st) {
    Double[] Temp =this.FillMaster(st).clone();
     Collections.shuffle(Arrays.asList(Temp));
        Double[] Insert;
        Insert =Temp.clone();
        
        Insertion.sort(Insert);
}

    private Double[] FillMaster(BenchState st) {

        if(st.Master.length==n){
        return st.Master;
        }else{
        st.Master= new Double[n];
        Random r = new Random();
            for(int j=0;j<n;j++){
            
                st.Master[j] = 1.0 + (150.0 - 1.0) * r.nextDouble();
            
            
            }
        
        }
        return st.Master;
        
    }


}