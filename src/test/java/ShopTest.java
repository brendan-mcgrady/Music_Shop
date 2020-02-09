import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    ArrayList<ISell> stock;

    @Before
    public void before () {
        stock = new ArrayList<ISell>();
        shop = new Shop();
        guitar = new Guitar(6, "Maple", "Brown", InstrumentType.STRING, 40., 65.);
        trumpet = new Trumpet(25, "Brass", "Golden", InstrumentType.BRASS, 70., 84.);
    }


}
