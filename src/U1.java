public class U1 extends Rocket {

    U1() {
        super(100000000, 10000, 18000);
    }

    // Override the launch method of rocket class to include the probability of failure
    @Override
    public boolean launch() {
        double chance = 5.0 * (super.getRocketWeightKg() / super.getMaxWeight());
        double random = Math.random() * 100 + 1;
        return chance <= random;
    }


    // Override the land method of rocket class to include the probability of failure
    @Override
    public boolean land() {
        double chance = 1.0 * (super.getRocketWeightKg() / super.getMaxWeight());
        double random = Math.random() * 100 + 1;
        return chance <= random;
    }


}
