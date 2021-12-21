public class U2 extends Rocket {

    U2(){
        super(120000000, 18000, 29000);
    }

    // Override the launch method of rocket class to include the probability of failure
    @Override
    public boolean launch() {
        double chance = 4.0 * (super.getRocketWeightKg()/super.getMaxWeight());
        double random = Math.random()*100+1;
        return chance<=random;
    }

    // Override the land method of rocket class to include the probability of failure
    @Override
    public boolean land() {
        double chance = 8.0 * (super.getRocketWeightKg() / super.getMaxWeight());
        double random = Math.random() * 100 + 1;
        return chance <= random;
    }

}
