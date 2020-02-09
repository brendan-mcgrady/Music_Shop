import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, "Maple", "Brown", InstrumentType.STRING, 40., 65.);
    }

    @Test
    public void guitarHasStringCount() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void guitarHasMaterialType() {
        assertEquals("Maple", guitar.getMaterial());
    }

    @Test
    public void guitarHasColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void guitarHasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void guitarHasBuyPrice() {
        assertEquals(40, guitar.getBuyPrice(), 0.);
    }

    @Test
    public void guitarHasSellPrice() {
        assertEquals(65, guitar.getSellPrice(), 0.);
    }

    @Test
    public void setGuitarSellingPrice() {
        guitar.setSellPrice(64.);
        assertEquals(64, guitar.getSellPrice(), 0.);
    }

    @Test
    public void guitarCanBePlayed() {
        assertEquals("Clapton would be jealous!", guitar.play());
    }

    @Test
    public void getMarkupForGuitar() {
        assertEquals(62.5, guitar.calculateMarkup(), 0.);
    }

}
