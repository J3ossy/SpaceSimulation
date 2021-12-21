public class Main {

    public static void main(String[] args) {

        // Creates a new simulation
        Simulation simulation = new Simulation();

        // load items from files
        simulation.loadItems("phase-1.txt");
        simulation.loadItems("phase-2.txt");

        System.out.println("Running simulation for U1 rockets:");

        int cost_U1 = simulation.runSimulation(simulation.loadU1());
        System.out.println("Total cost for U1 rockets: " + cost_U1);

        System.out.println("Running simulation for U2 rockets:");

        int cost_U2 = simulation.runSimulation(simulation.loadU2());
        System.out.println("Total cost for U2 rockets: " + cost_U2);


    }
}
