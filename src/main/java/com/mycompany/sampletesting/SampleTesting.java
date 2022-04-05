/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sampletesting;

/**
 *
 * @author prath
 */
import java.util.*;

class Helper extends TimerTask
{
    NewJFrame time = new NewJFrame();
    int i=0;
    public void run()
    {
        ++i;
        time.trigger(i);
        System.out.println("Trigger at value:"+i);
    }
}
 
public class SampleTesting {
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Timer timer = new Timer();
        TimerTask task = new Helper();
        timer.schedule(task, 2000, 2000);
    }
}
