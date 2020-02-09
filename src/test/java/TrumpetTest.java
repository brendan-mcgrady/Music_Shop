import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

        Trumpet trumpet;

        @Before
        public void before() {
            trumpet = new Trumpet(25, "Brass", "Golden", InstrumentType.BRASS, 70., 84.);
        }

        @Test
        public void trumpetHasStringCount() {
            assertEquals(25, trumpet.getToneHoles());
        }

        @Test
        public void trumpetHasMaterialType() {
            assertEquals("Brass", trumpet.getMaterial());
        }

        @Test
        public void trumpetHasColour() {
            assertEquals("Golden", trumpet.getColour());
        }

        @Test
        public void trumpetHasInstrumentType() {
            assertEquals(InstrumentType.BRASS, trumpet.getType());
        }

        @Test
        public void trumpetHasBuyPrice() {
            assertEquals(70, trumpet.getBuyPrice(), 0.);
        }

        @Test
        public void trumpetHasSellPrice() {
            assertEquals(84, trumpet.getSellPrice(), 0.);
        }

        @Test
        public void setTrumpetSellingPrice() {
            trumpet.setSellPrice(89.);
            assertEquals(89, trumpet.getSellPrice(), 0.);
        }

        @Test
        public void trumpetCanBePlayed() {
            assertEquals("Gerry Rafferty hears from a distance and joins in!", trumpet.play());
        }

        @Test
        public void canGetTrumpetMarkup() {
            assertEquals(20, trumpet.calculateMarkup(), 0.);
        }

}
