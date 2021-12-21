public interface SpaceShip {

    // returns true if the launch was successful
    boolean launch();

    // returns true if the land was successful
    boolean land();

    //returns true if the rocket can carry the item and false if it will exceed the weight limit
    boolean canCarry(Item item);

    // updates the weight of the rocket
    void carry(Item item);

}
