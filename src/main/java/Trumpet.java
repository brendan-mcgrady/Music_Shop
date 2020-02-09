// Create classes for different types of instruments
// Each class will have its own instance variables for attributes particular to that instrument

public class Trumpet extends Instrument implements IPlay, ISell {

    private int toneHoles;
    private double sellPrice;
    private double buyPrice;

    public Trumpet(int toneHoles, String material, String colour, InstrumentType type, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.toneHoles = 25;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play() {
        return "Gerry Rafferty hears from a distance and joins in!";
    }

    public double calculateMarkup() {
        return ((this.sellPrice - this.buyPrice) / this.buyPrice) * 100;
    }

    public int getToneHoles() {
        return this.toneHoles;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(double price) {
        this.sellPrice = price;
    }

}
