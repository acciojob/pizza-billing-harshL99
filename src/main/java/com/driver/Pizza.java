package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    private Boolean addOnceCheese=false,addOnceTop=false,addOncePaperBag=false,addOnceBill=false;

//    private int totalBill=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg)
            this.price=300;
        else
            this.price=400;


        addString("Base Price Of The Pizza: "+this.price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.addOnceCheese) {
            this.price+=80;
            this.addOnceCheese=true;
        }
    }

    public void addExtraToppings(){
        if(!this.addOnceTop) {
            if(this.isVeg) {
                this.price+=70;
            }
            else {
                this.price+=120;
            }
            this.addOnceTop=true;
        }
    }

    public void addTakeaway(){
        if(!this.addOncePaperBag) {
            this.price+=20;
            this.addOncePaperBag=true;
        }
    }

    public void addString(String x){
        this.bill=this.bill+x+"\n";
    }
    public String getBill(){

        if(!this.addOnceBill) {
            if (this.addOnceCheese)
                addString("Extra Cheese Added: 80");
            if (this.addOnceTop) {
                if (this.isVeg)
                    addString("Extra Toppings Added: 70");
                else
                    addString("Extra Toppings Added: 120");
            }
            if (this.addOncePaperBag)
                addString("Paperbag Added: 20");

            addString("Total Price: " + this.price);

            this.addOnceBill=true;
            return this.bill;

        }
        else return "";
    }
}
