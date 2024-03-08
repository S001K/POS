import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ingredients {
    private static Ingredients single_instance = null;

    Dictionary<String, Double> ingredients = new Hashtable<String, Double>();

    private Ingredients() {

    }

    public int fillInventory() {
        try {
            File myObj = new File("ingredients.csv");
            Scanner Reader = new Scanner(myObj);
            while (Reader.hasNextLine()) {
                String[] data = Reader.nextLine().split(";");
                ingredients.put(data[0], Double.parseDouble(data[1]));
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("A file error occurred.");
            e.printStackTrace();
        }
        return 0;
    }

    public void decraseBy(String key, double amount) {
        ingredients.put(key, ingredients.get(key) - amount);
        System.out.println("New " + key + " amount is: " + ingredients.get(key).toString());
    }

    public void updateDatabse() {
        Enumeration<String> enu = ingredients.keys();
        try {
            FileWriter writer = new FileWriter("ingredients.csv");

            while (enu.hasMoreElements()) {
                String name = enu.nextElement();
                double amount = ingredients.get(name);

                String data = name + ";" + amount + "\n";
                writer.write(data);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("A file error occurred.");
        }
    }

    public static synchronized Ingredients getInstance() {
        if (single_instance == null) {
            single_instance = new Ingredients();

        }
        return single_instance;
    }

}
