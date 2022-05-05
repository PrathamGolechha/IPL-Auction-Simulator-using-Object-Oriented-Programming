/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipl.simulator.ooad;

/**
 *
 * @author prath
 */
public class ButtonStatus {
    static ButtonStatus instance;
    private ButtonStatus(){
        
    }
    public static ButtonStatus getInstance(){
        if(instance == null){
            instance  = new ButtonStatus();
        }
        return instance;
    }
    
    void ButtonStatus(String Team)
    {
        if("T1".equals(Team))
        {
            AuctionDisplay.Team1Button.setEnabled(false);
            AuctionDisplay.Team2Button.setEnabled(true);
            AuctionDisplay.Team3Button.setEnabled(true);
            AuctionDisplay.Team4Button.setEnabled(true);
            }
        else if("T2".equals(Team))
        {
            AuctionDisplay.Team2Button.setEnabled(false);
            AuctionDisplay.Team1Button.setEnabled(true);
            AuctionDisplay.Team3Button.setEnabled(true);
            AuctionDisplay.Team4Button.setEnabled(true);
        }
        else if("T3".equals(Team))
        {
            AuctionDisplay.Team3Button.setEnabled(false);
            AuctionDisplay.Team2Button.setEnabled(true);
            AuctionDisplay.Team1Button.setEnabled(true);
            AuctionDisplay.Team4Button.setEnabled(true);
        }
        else if("T4".equals(Team))
        {
            AuctionDisplay.Team4Button.setEnabled(false);
            AuctionDisplay.Team2Button.setEnabled(true);
            AuctionDisplay.Team3Button.setEnabled(true);
            AuctionDisplay.Team1Button.setEnabled(true);
        }
        int nextvalue=Integer.parseInt(AuctionDisplay.CurrentPriceTeam.getText())+Integer.parseInt(AuctionDisplay.BidIncrement.getText());
        System.out.println(nextvalue);
        if(Integer.parseInt(AuctionDisplay.Team1Purse.getText())<nextvalue)
        {
           AuctionDisplay.Team1Button.setEnabled(false); 
        }
        if(Integer.parseInt(AuctionDisplay.Team2Purse.getText())<nextvalue)
        {
           AuctionDisplay.Team2Button.setEnabled(false); 
        }
        if(Integer.parseInt(AuctionDisplay.Team3Purse.getText())<nextvalue)
        {
           AuctionDisplay.Team3Button.setEnabled(false); 
        }
        if(Integer.parseInt(AuctionDisplay.Team4Purse.getText())<nextvalue)
        {
           AuctionDisplay.Team4Button.setEnabled(false); 
        }
       
    }
}
