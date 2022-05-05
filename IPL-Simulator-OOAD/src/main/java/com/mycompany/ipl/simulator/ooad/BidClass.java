/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipl.simulator.ooad;

/**
 *
 * @author prath
 */
public class BidClass {
    static BidClass instance;
    private BidClass(){
        
    }
    public static BidClass getInstance(){
        if(instance == null){
            instance  = new BidClass();
        }
        return instance;
    }
    static Players One=Players.getInstance();
    static End end=End.getInstance();
    static TimerClass timer=TimerClass.getInstance();
    void Bid(String Team)
    {
        int NewBidValue=20;
        int CurrentBidValue=Integer.parseInt(AuctionDisplay.CurrentPriceTeam.getText());
        if(CurrentBidValue>=100 && CurrentBidValue<400)
        {
            NewBidValue=25;    
        }
        else if(CurrentBidValue>=400)
        {
            NewBidValue=50;
        }
        AuctionDisplay.LastTeamPrice.setText(AuctionDisplay.PrevTeamPrice.getText());
        AuctionDisplay.PrevTeamPrice.setText(AuctionDisplay.CurrTeamPrice.getText());
        AuctionDisplay.Prev2PriceTeam.setText(AuctionDisplay.PrevPriceTeam.getText());
        AuctionDisplay.PrevPriceTeam.setText(String.valueOf(CurrentBidValue));
        AuctionDisplay.CurrentPriceTeam.setText(String.valueOf(CurrentBidValue+NewBidValue));
        AuctionDisplay.CurrTeamPrice.setText(Team);
        setBidIncrement(CurrentBidValue+NewBidValue);
        
        
        
    }
    
    void setBidIncrement(int CurrentPrice)
    {
        if(CurrentPrice>=100 && CurrentPrice<400)
        {
            int NewBidValue=25; 
            AuctionDisplay.BidIncrement.setText(String.valueOf(NewBidValue));
        }
        else if(CurrentPrice>=400)
        {
            int NewBidValue=50;
            AuctionDisplay.BidIncrement.setText(String.valueOf(NewBidValue));
        }
    }
    
    void EndBid()
    {
        String WinTeam=AuctionDisplay.CurrTeamPrice.getText();
        int SoldPrice=Integer.parseInt(AuctionDisplay.CurrentPriceTeam.getText());
        Teams.Winbid(WinTeam,SoldPrice);
        AuctionDisplay.count+=1;
        
        AuctionDisplay.Team1Button.setEnabled(true);
        AuctionDisplay.Team2Button.setEnabled(true);
        AuctionDisplay.Team3Button.setEnabled(true);
        AuctionDisplay.Team4Button.setEnabled(true);
        
        AuctionDisplay.LastTeamPrice.setText("None");
        AuctionDisplay.PrevTeamPrice.setText("None");
        AuctionDisplay.CurrTeamPrice.setText("None");
        AuctionDisplay.Prev2PriceTeam.setText("0");
        AuctionDisplay.PrevPriceTeam.setText("0");
        if(AuctionDisplay.count<=11)
        {One.onePlayer(AuctionDisplay.count);}
        else
        {
            end.EndGame();
            timer.timer.stop();
        }
        timer.timerStatus(0);        
        }
    
}
