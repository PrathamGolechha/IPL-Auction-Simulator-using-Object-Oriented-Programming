/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipl.simulator.ooad;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author prath
 */
public class End {
    
    static End instance;
    private End(){
        
    }
    public static End getInstance(){
        if(instance == null){
            instance  = new End();
        }
        return instance;
    }
    
    void EndGame()
    {
     JFrame jFrame = new JFrame();
        int T1Points=Integer.parseInt(AuctionDisplay.Team1Points.getText());
        int T2Points=Integer.parseInt(AuctionDisplay.Team2Points.getText());
        int T3Points=Integer.parseInt(AuctionDisplay.Team3Points.getText());
        int T4Points=Integer.parseInt(AuctionDisplay.Team4Points.getText());
        int winner=max(T1Points,T2Points,T3Points,T4Points);
        String win="";
        if(winner==T1Points)
        {
            win="Team 1";
        }
        else if(winner==T2Points)
        {
            win="Team 2";
        }
        else if(winner==T3Points)
        {
            win="Team 3";
        }
        else if(winner==T4Points)
        {
            win="Team 4";
        }
               
                JOptionPane.showMessageDialog(jFrame, win+" Wins!");   
    }
    int max(int a, int b, int c, int d) {

    int max = a;

    if (b > max)
        max = b;
    if (c > max)
        max = c;
    if (d > max)
        max = d;

     return max;
}
    
}
