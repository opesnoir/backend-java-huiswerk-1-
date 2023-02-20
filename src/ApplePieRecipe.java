// in deze klasse krijg je ook een lege construcor cadeau, maar het is conventie er een aan te maken

public class ApplePieRecipe {

    // Stel de eigenschappen van het object in door de desbetreffende variabelen van het object in te stellen op de gewenste waarden.
    // De gewenste waarden:
    Ingredient butter = new Ingredient(200, "gram", "butter");
    Ingredient bastardSugar = new Ingredient(200, "gram", "bastard suiker");
    Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuks", "ei");
    Ingredient vanilleSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snufje", "zout");
    Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalSugar = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    //lege constructor
    public ApplePieRecipe() {

    }

    // methodes ingredienten en stappen
    // methode ingredienten
    public void printIngredientsButter (){
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
    }
    public void printIngredientsBastardSugar (){
        System.out.println(bastardSugar.getAmount() + " " + bastardSugar.getUnit() + " " + bastardSugar.getName());
    }
    public void printIngredientsFlour (){
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
    }
    public void printIngredientsEgg (){
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
    }
    public void printIngredientsVanilleSugar (){
        System.out.println(vanilleSugar.getAmount() + " " + vanilleSugar.getUnit() + " " + vanilleSugar.getName());
    }
    public void printIngredientsApples (){
        System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
    }
    public void printIngredientsSalt (){
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
    }
    public void printIngredientsKristalSugar (){
        System.out.println(kristalSugar.getAmount() + " " + kristalSugar.getUnit() + " " + kristalSugar.getName());
    }
    public void printIngredientsCinnamon (){
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
    }
    public void printIngredientsPaneermeel (){
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }

    // methode stappen
    public void heatOven(){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void mixEgg(){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixButterSugarFlour (){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void pealApple (){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void butterPan(){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void putDoughInPan(){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void putAppleInPan(){
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void prepDoughForTop(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void addDoughToTop(){
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bakePie(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}

