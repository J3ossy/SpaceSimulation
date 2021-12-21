public class Rocket implements SpaceShip {

    private int rocketCost;
    private int rocketWeightKg;
    private int maxWeight;

    Rocket(int rocketCost,int rocketWeightKg, int maxWeight ){
    this.rocketCost = rocketCost;
    this.rocketWeightKg = rocketWeightKg;
    this.maxWeight = maxWeight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if (item.getWeight() <= (maxWeight-rocketWeightKg)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        rocketWeightKg += item.getWeight();
    }


    /*
    Getter and Setter
     */

    public int getRocketCost() {
        return rocketCost;
    }

    public void setRocketCost(int rocketCost) {
        this.rocketCost = rocketCost;
    }

    public int getRocketWeightKg() {
        return rocketWeightKg;
    }

    public void setRocketWeightKg(int rocketWeightKg) {
        this.rocketWeightKg = rocketWeightKg;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
