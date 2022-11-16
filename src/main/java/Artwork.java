public class Artwork {
    private String title;
    private double price;
    private String nft;
    private Artist artist;

    public Artwork(String title, double price, String nft, Artist artist){
        this.title = title;
        this.price = price;
        this.nft = nft;
        this.artist = artist;
    }

    //getters and setters
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public Artist getArtist(){
        return this.artist;
    }

    public void setArtist(Artist artist){
        this.artist = artist;
    }



// nft and price
    public String getNft(){
        return this.nft;
    }
    public void setNft(String nft){
        this.nft = nft;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }


}
