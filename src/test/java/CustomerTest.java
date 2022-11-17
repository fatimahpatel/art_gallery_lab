import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;

public class CustomerTest {

    private Customer customer;
    @BeforeEach
    public void setUp(){
        customer = new Customer ("Bob", 15);
    }
    @Test
    public void canBuyArt(){
        //Arrange
        ArrayList<Artwork> collection = new ArrayList<>();
        Artist vanGogh = new Artist("Van-Gogh");
        Artwork sunflowers = new Artwork ("Sunflowers", 10, "jfferfnl", vanGogh);
        collection.add(sunflowers);
        Gallery gallery = new Gallery("Tate Modern", 0, collection);

        //Act
        customer.buyArt(sunflowers, gallery);
        double testWallet = customer.getWallet();
        //Assert
        assertThat(testWallet).isEqualTo(5);
    }

    @Test
    public void increaseTill(){
        //Arrange
        ArrayList<Artwork> collection = new ArrayList<>();
        Artist vanGogh = new Artist("Van-Gogh");
        Artwork sunflowers = new Artwork ("Sunflowers", 10, "jfferfnl", vanGogh);
        collection.add(sunflowers);
        Gallery gallery = new Gallery("Tate Modern", 0, collection);

        //Act
        customer.buyArt(sunflowers, gallery);
        double testWallet = customer.getWallet();
        double testTill = gallery.getTill();
        //Assert
        assertThat(testTill).isEqualTo(10);
    }
    

}
