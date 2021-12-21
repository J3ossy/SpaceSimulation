import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    private ArrayList<Item> items;

    Simulation() {
        items = new ArrayList();
    }


    /* reads an input file line by line and creates item objects
    @param: file: filename
    @return: ArrayList item: a list containing all item in the specific file
     */
    public ArrayList<Item> loadItems(String file) {
        File fileName = new File(file);

        try {
            Scanner fileScanner = new Scanner(fileName);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] oneItem = line.split("=");
                items.add(new Item(oneItem[0], Integer.valueOf(oneItem[1])));

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not foundS");
        }
        return items;
    }


    /* This method starts creating u1 rockets and fills them with as many items as possible before creating a new rocket object.
       @return Arraylist fleetU1: a list of u1 Rockets filled with items until no more item is available
     */
    public ArrayList<Rocket> loadU1() {
        ArrayList fleetU1 = new ArrayList();
        int i = 0;

        while (i < items.size()) {
            Rocket u1 = new U1();
                while (i < items.size() && u1.canCarry(items.get(i))) {
                u1.carry(items.get(i));
                i++;
            }
            fleetU1.add(u1);
        }
        return fleetU1;
    }


    /* This method starts creating u2 rockets and fills them with as many items as possible before creating a new rocket object.
    @return Arraylist fleetU2: a list of u1 Rockets filled with items until no more item is available
  */
    public ArrayList<Rocket> loadU2() {
        ArrayList fleetU2 = new ArrayList();
        int i = 0;

        while (i < items.size()) {
            Rocket u2 = new U2();
            while (i < items.size() && u2.canCarry(items.get(i))) {
                u2.carry(items.get(i));
                i++;
            }
            fleetU2.add(u2);
        }
        return fleetU2;
    }


    /* This method keeps track of all rockets been sent and calculates the total amount of costs.
        If land or launch returns false, it has to send the rocket again.
        @param Arraylist fleet: the fleet that should be simulated
        @return budget: total cost of all rockets needed to get all item sent
     */
    public int runSimulation(ArrayList<Rocket> fleet){
        int budget = 0;
        int fail = 0;

        for(Rocket r:fleet){
            budget += r.getRocketCost();
            while (!r.land() || !r.launch()){
                budget += r.getRocketCost();
                fail++;
            }
        }
        return budget;
    }
}
