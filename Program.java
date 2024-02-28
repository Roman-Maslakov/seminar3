public class Program {

    public static void main(String[] args) {

        BaseWorker.fillArray();
        
        BaseWorker.printArray();

        System.out.println("\n".repeat(5));

        BaseWorker.sortArray();

        BaseWorker.printArray();

        System.out.println("\n".repeat(5));

        ListOfWorkers lw = new ListOfWorkers();

        lw.printList3x();
    }
}