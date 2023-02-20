public class Main {
    public static void main(String[] args) {

        // je moet eerst een object van de klasse maken om toegang te krijgen tot de methoden en variabelen van die klasse.
        // Maak een nieuw ApplePieRecipe-object:
        ApplePieRecipe appelPie = new ApplePieRecipe();

        //ingredientenlijst
        // Roep de methode heatOven() op via het applePie-object
        appelPie.printIngredientsButter();
        appelPie.printIngredientsBastardSugar();
        appelPie.printIngredientsFlour();
        appelPie.printIngredientsEgg();
        appelPie.printIngredientsKristalSugar();
        appelPie.printIngredientsVanilleSugar();
        appelPie.printIngredientsApples();
        appelPie.printIngredientsPaneermeel();
        appelPie.printIngredientsSalt();
        appelPie.printIngredientsCinnamon();

        //stappenlijst
        // Roep de methode heatOven() op via het applePie-object
        appelPie.heatOven();
        appelPie.mixEgg();
        appelPie.mixButterSugarFlour();
        appelPie.pealApple();
        appelPie.butterPan();
        appelPie.putDoughInPan();
        appelPie.putAppleInPan();
        appelPie.prepDoughForTop();
        appelPie.addDoughToTop();
        appelPie.bakePie();

    }
}
/*

Stappenplan

        Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken.

        Maak een nieuw project aan in IntelliJ.

        Maak een nieuwe klasse aan genaamd 'Main'. Doe dit door met de rechter muisknop op de map 'SRC' te klikken, vervolgens klik je op 'New' en dan op 'Java class'.

        Maak een public static void main methode aan.

        Maak een nieuwe klasse Ingredient aan, dit gaat het framework worden van een ingredient object

        Maak 3 private variabelen aan binnen de klasse, namelijk amount, unit en name. Geef deze de juiste datatypes.

        Maak een lege constructor aan en een constructor gevuld met alle 3 de variabelen. Zet ook voor alle variabelen zowel een getter als een setter in deze klasse.

        Maak een nieuwe klasse ApplePieRecipe aan, hier gaan we voor elk van de ingredient van Ingredient een object instantieren.

        Maak voor iedere stap een public void  methode aan genaamd step1, step2 enz. Zet vervolgens een System.out.println() in de body van de methode. En laat deze de tekst van de stap uitprinten.

        Maar dat is eigenlijk niet zo handig om een methode stap1 te noemen. Want wat doet deze methode? Weet ik dat over 2 jaar nog? Nee, hernoem daarom de methodes op een manier dat de naam wat zegt over wat de methode doet.

        Maar hoe kunnen we nu deze aanspreken van uit de Main klasse? Ja, precies door een object aan te maken van het type ApplePieRecipe

        Roep hiermee van uit de Main klasse alle methodes aan ApplePieRecipe, zodat als we de public static void main methode laten draaien we alle stappen geprint zien worden.

        De oplettende student heeft gezien dat we helemaal niets doen met de objecten van Ingredient. En dat terwijl we daar zo veel moeite in hebben gestopt. Maar iemand die deze app draait zou ook wel willen weten welke ingredienten nodig zijn voor de recept. Maak daarom een public void methode genaamd printIngredients aan in ApplePieRecipe. Laat deze methode voor ieder object een System.out.println("object.getAmount + " " + object.getUnit + " " + object.getName) uitprinten. (Vervang natuurlijk object met de naam van het object dat je het gegeven bij het instantieren.)

        Roep ook deze aan vanuit de Main methode, zodat eerst de ingredienten een voor een worden geprint gevolgd door elke stap van het recept.

        Dit is een van de mogelijkheden en is op zich helemaal prima, maar neem ook een kijkje bij de extra opdrachten.*/
