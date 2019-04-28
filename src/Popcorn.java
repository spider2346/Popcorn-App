/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian Byczkowski
 */
public class Popcorn {
    private String flavor;
    private String flavor2;
    private String color;
    private int size;
    private String giftMessage;
    private boolean mix;
    private boolean gift;
    private double price;
    
    public Popcorn(String flavor, String flavor2, String color, int size, String giftMessage, boolean mix, boolean gift, double price){
        this.flavor = flavor;
        this.color = color;
        this.flavor2 = flavor2;
        this.size = size;
        this.mix = mix;
        this.gift = gift;
        this.giftMessage = giftMessage;
        this.price = price;
    }
    
    public String toString(){
        String str = "Your order has been placed!" + "\n" + "\n" + "Tin Size:  " + size + " Gallon(s)" + "\n"  + "Tin Color:  " + color + "\n" + "Popcorn Flavor:  " + flavor + "\n";
        if(mix)
            str += "Second Flavor:  " + flavor2 + "\n";
        if(gift)
            str += "Message on Tin:  " + giftMessage + "\n";
          return str + "\n" + "Your total for this order is $" + price + "\n";
                  
    }
    
  
}
    
