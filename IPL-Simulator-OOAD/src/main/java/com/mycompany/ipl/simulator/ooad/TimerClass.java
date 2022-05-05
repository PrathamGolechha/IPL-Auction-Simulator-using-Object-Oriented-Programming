/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipl.simulator.ooad;

/**
 *
 * @author prath
 */

import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class TimerClass {
    static TimerClass instance;
    private TimerClass(){
        
    }
    public static TimerClass getInstance(){
        if(instance == null){
            instance  = new TimerClass();
        }
        return instance;
    }
    
    int second;
    Timer timer;    
    static BidClass Bid = BidClass.getInstance();
    void timer()
    {
        timer = new Timer(1000, (ActionEvent e) -> {
            second--;
            AuctionDisplay.Timer.setText(second+"");
            if (second<=0)
            {timer.stop();
            AuctionDisplay.Timer.setText("0");
            Bid.EndBid();
            }
        });
    }
    
    void timerStatus(int status)
    {
        second=16;
        if (status==0)
        timer.start();
        else
        timer.restart();    
    }
    
    
        
        
    
}
