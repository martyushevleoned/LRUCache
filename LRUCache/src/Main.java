import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LRUCache<Employee> cache = new LRUCache<>(4);
        loadFromFile("src/data.txt").forEach(cache::addElement);
        cache.getAllElements().forEach(System.out::println);
    }

    private static ArrayList<Employee> loadFromFile(String path) {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        fragments[1],
                        Integer.parseInt(fragments[2])
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return staff;
    }
}