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
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class MyBenchmark {

    private Double[] Master;
    /**
     *
     */

    @Param({"1000", "10000", "100000", "1000000", "10000000", "100000000"})
    public int n = 1000;

    @Setup
    public void setup() {
        if (Master.length == n) {

            Master = new Double[n];
            Random r = new Random();
            for (int j = 0; j < n; j++) {

                Master[j] = 1.0 + (150.0 - 1.0) * r.nextDouble();

            }

        }
    }

        @Benchmark
        public void PQ 
            () {
    Double[] Temp = Master.clone();

            MinPQ<Double> mini;
            mini = new MinPQ();
            for (Double Temp1 : Temp) {
                mini.insert(Temp1);
            }
        }

        @Benchmark
        public void testMethod 
            () {
    Double[] Temp = Master.clone();
            Collections.shuffle(Arrays.asList(Temp));
            Double[] Insert;
            Insert = Temp.clone();

            Insertion.sort(Insert);
        }

    }




