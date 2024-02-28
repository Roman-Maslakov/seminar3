import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public abstract class BaseWorker implements Comparable<BaseWorker> {

    static Random rand = new Random();

    private String name;

    public abstract int calcSalary();

    public static ArrayList<BaseWorker> workers = new ArrayList<>();

    public static Comparator<BaseWorker> comparator = new Comparator<BaseWorker>() {
        
        public int compare(BaseWorker w1, BaseWorker w2) {

            return w1.calcSalary() - w2.calcSalary();
        }
    };

    public BaseWorker(String name) {

        this.name = name;
    }

    public static void fillArray() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                workers.add(new Worker("Worker", rand.nextInt(30000, 150000)));
            } else
                workers.add(new Freelancer("Freelancer", rand.nextInt(300, 700)));
        }
    }

    public static void printArray() {

        for (BaseWorker worker : workers) {
            System.out.println(worker);
        }
    }

    public static void sortArray() {

        workers.sort(comparator);
    }

    public String toString() {

        return "Name: " + this.name +
                " - salary: " + this.calcSalary();
    }

    public int compareTo(BaseWorker worker) {

        return this.calcSalary() - worker.calcSalary();
    }
}