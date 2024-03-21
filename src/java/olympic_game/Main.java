package olympic_game;

public class Main {

    public static void main(String[] args) {
        Country norway = new Country("norway");
        norway.countGold(2);
        norway.countSilver(3);
        norway.countBronze(1);


        norway.displayMedals();
        norway.getGoldMedals();

        Country usa = new Country("usa");
        usa.countGold(4);
        usa.countSilver(6);
        usa.countBronze(3);

        usa.displayMedals();
        usa.getGoldMedals();


        Country sweden = new Country("sweden");
        sweden.countGold(1);
        sweden.countSilver(1);
        sweden.countBronze(0);


        Country[] countries = {
                norway, usa, sweden
        };


        System.out.println( "country with most gold: " + MedalCalculator.findCountryWithMostGold(countries).getName());
        System.out.println("country with most medals: " + MedalCalculator.findCountryWithMostMedals(countries).getName());
        System.out.println("sum + total medals: " + MedalCalculator.calculateMedals(countries));
        System.out.println(norway.totalMedals());
        System.out.println(usa.totalMedals());
        System.out.println(sweden.totalMedals());
    }
}
