package olympic_game;

public class MedalCalculator {

    public static Country findCountryWithMostGold(Country[] countries) {
        Country topCountry = countries[0];
        for (Country country : countries) {
            if (country.getGoldMedals() > topCountry.getGoldMedals()) {
                topCountry = country;
            }
        }
        return topCountry;
    }

    public static   Country findCountryWithMostMedals(Country[] countries) {
        Country mostMedals = countries[0];
        for (Country country : countries) {
            if (country.totalMedals() > mostMedals.totalMedals()) {
                mostMedals = country;
            }
        }
        return mostMedals;
    }

    public static int calculateMedals(Country[] countries) {
        int totalSum = 0;

        for (Country country : countries) {
           totalSum += country.totalMedals();
        }
        return totalSum;
    }

}
