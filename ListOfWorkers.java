import java.util.Arrays;
import java.util.Iterator;

public class ListOfWorkers implements Iterable<BaseWorker> {
    
    BaseWorker[] workers = {
        new Worker("Ignat Sveridov", 200000),
        new Freelancer("Timofey Fedotov", 650),
        new Freelancer("Sasha Ivanov", 450),
        new Worker("Potap Tapich", 120000),
        new Worker("Bulat Voron", 80000),
        new Freelancer("Petya Lakomkin", 500)
    };
    
    public Iterator<BaseWorker> iterator() {
        
        return new WIterator(workers);
    }

    public void printList3x() {

        Iterator<BaseWorker> wIterator = iterator();

        Arrays.sort(workers);

        Arrays.asList(workers).forEach(System.out::println);
        
        System.out.println("\n".repeat(5));

        for (BaseWorker worker : workers) {
            
            System.out.println(worker);
        }

        System.out.println("\n".repeat(5));

        while (wIterator.hasNext()) {
            System.out.println(wIterator.next());
        }
    }
}