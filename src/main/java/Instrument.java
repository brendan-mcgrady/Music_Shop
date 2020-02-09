// Create an Instrument superclass which contains attributes you see as being common to all instruments

public abstract class Instrument {

    private String material;
    private String colour;

    // Create and use an enum for instrument types e.g. keyboard, wind, brass etc

    private InstrumentType type;

    public Instrument(String material, String colour, InstrumentType type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

}
