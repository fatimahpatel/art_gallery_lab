public class Customer {
   private String name;
   private double wallet;

   public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
   }
   //Getters and Setters
   public String getName(){
    return this.name;
   }
   public double getWallet(){
      return this.wallet;
   }
   public void setName(String name){
      this.name = name;

   }
   public void setWallet(){
      this.wallet = wallet;
   }

   public void buyArt(Artwork artwork, Gallery gallery){
       //AIM: remove money from wallet and add money to till
       //remove money from customer's wallet
       this.wallet = this.wallet - artwork.getPrice();
       // Get the till value
       double till = gallery.getTill();
       //add this money to the till
       gallery.setTill(till + artwork.getPrice());
   }

}
