# **OLYMPIC GAME**

Country Class:

Attributes:

    name (String), goldMedals (int), silverMedals (int), bronzeMedals (int).

Constructor: 

    Initialize a new country object with its name. The medal counts should be initialized to 0.
Methods:
        
    addGold(int count): Increments the gold medal count by count.
    addSilver(int count): Increments the silver medal count by count.
    addBronze(int count): Increments the bronze medal count by count.
    getTotalMedals(): Returns the total number of medals.
    displayMedalCount(): Prints the medal count in the format: "Country: Gold: x, Silver: y, Bronze: z".
MedalCalculator:

Methods:

    calculateTotalMedals(Country[] countries): Takes an array of Country objects and returns the total medals across all countries.
    findCountryWithMostGold(Country[] countries): Returns the country with the highest number of gold medals. If there is a tie, return any one of the tied countries.
    findCountryWithMostMedals(Country[] countries): Returns the country with the highest total medal count. If there is a tie, return any one of the tied countries.
Main Class:

    In your main method, create instances of a few countries.
    Update their medal counts using the methods provided.
    Create an array of these country objects and use the MedalTallyCalculator class to display:
    The total number of medals across all countries.
    The country with the most gold medals.
    The country with the most medals overall.
    Display the medal count for each country using the displayMedalCount() method.