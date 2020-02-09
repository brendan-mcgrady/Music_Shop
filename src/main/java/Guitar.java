// Create classes for different types of instruments
// Each class will have its own instance variables for attributes particular to that instrument

public class Guitar extends Instrument implements IPlay, ISell {

    private int strings;
    private double buyPrice;
    private double sellPrice;

    public Guitar(int strings, String material, String colour, InstrumentType type, double buyPrice, double sellPrice) {
        super(material, colour, type);
        this.strings = strings;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play() {
        return "Clapton would be jealous!";
    }

    public double calculateMarkup() {
        return ((this.sellPrice - this.buyPrice) / this.buyPrice) * 100;
    }

    public int getStrings() {
        return this.strings;
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
