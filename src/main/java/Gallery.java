import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name, double till, ArrayList<Artwork> stock){
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
    public double getTill(){
        return this.till;
    }
    public ArrayList<Artwork> getStock(){
        return this.stock;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTill(double till){
        this.till = till;
    }
    public void setStock(ArrayList<Artwork> stock){
        this.stock = stock;
    }

}
