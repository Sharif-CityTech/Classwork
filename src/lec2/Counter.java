/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lec2;

/**
 *
 * @author class
 */
public class Counter {
    int mycount=0;
    static int ourCount=0;
    
    void increment(){
        mycount++;
        ourCount++;
    }
 public static void main(String[] args){
     Counter counter1= new Counter();
     Counter counter2=new Counter();
     counter1.increment();
     counter1.increment();
     counter2.increment();
     
     System.out.println("counter 1:"+counter1.mycount+" "+Counter.ourCount);
     System.out.println("counter 2:"+counter2.mycount+" "+Counter.ourCount);
 }
}
