package olympic_game;

public class Country {
    private String name;
    int goldMedals;
    int silverMedals;
    int bronzeMedals;

    public Country(String name) {
        this.name = name;
        this.goldMedals = 0;
        this.silverMedals = 0;
        this.bronzeMedals = 0;
    }

   public void countGold(int count) {
        this.goldMedals += count;
   }

   public void countSilver(int count) {
        this.silverMedals += count;
   }

   public void countBronze(int count) {
        this.bronzeMedals += count;
   }

   public void displayMedals (){

       System.out.println(name + "goldmedals" + goldMedals + "silvermedals"+ silverMedals + "bronzemedals" + bronzeMedals );

   }

   public int totalMedals() {
        return goldMedals + silverMedals + bronzeMedals;
   }

    public int getGoldMedals() {
        return goldMedals;
    }

    public int getSilverMedals() {
        return silverMedals;
    }

    public int getBronzeMedals() {
        return bronzeMedals;
    }

    public String getName() {
        return name;
    }
}
