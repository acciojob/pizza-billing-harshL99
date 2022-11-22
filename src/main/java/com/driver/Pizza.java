package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    private Boolean addOnceCheese=false,addOnceTop=false,addOncePaperBag=false;

    private int totalBill=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg)
            price=300;
        else
            price=400;

        totalBill+=price;
        addString("Base Price Of The Pizza: "+price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!addOnceCheese) {
            totalBill+=80;
            addOnceCheese=true;
        }
    }

    public void addExtraToppings(){
        if(!addOnceTop) {
            totalBill+=70;
            addOnceTop=true;
        }
    }

    public void addTakeaway(){
        if(!addOncePaperBag) {
            totalBill+=20;
            addOncePaperBag=true;
        }
    }

    public void addString(String x){
        bill=bill+x+"\n";
    }
    public String getBill(){
        // your code goes here
        if(addOnceCheese)
            addString("Extra Cheese Added: 80");
        if(addOnceTop)
            addString("Extra Toppings Added: 70");
        if(addOncePaperBag)
            addString("Paperbag Added: 20");
        addString("Total Price: "+totalBill);
        return this.bill;
    }
}
