public class Ingredient {
    // class variables
    private double amount;
    private String unit;
    private String name;


    // als je een klasse aanmaakt wordt er automatisch een lege constructor aangemaakt, maak een lege moet je als je andere constructors aanmaakt alsnog aanmaken om errors te voorkomen
    // constructors zijn heel specifiek, ze werken alleen met de opgegeven onderdelen
    // constructor ("bouwvakker 1" deze maakt alleen maar ingredienten aan zonder waardes erin)
    public Ingredient() {
    }

    public Ingredient(double amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    //("bouwvakker 2" deze maakt alleen maar ingredienten aan met amount, unit en name)
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }


    // methoden
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
