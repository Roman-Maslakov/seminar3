import java.util.Iterator;

public class WIterator {

    int size = ListOfWorkers.workers.length;

    int cursor = -1;

    Iterator<BaseWorker> iterator = new Iterator<BaseWorker>() {

        public boolean hasNext() {

            return cursor + 1 < size;
        }

        public BaseWorker next() {

            cursor++;
            return ListOfWorkers.workers[cursor];
        }
    };

    // public Iterator<BaseWorker> createIterator() {

    // return new Iterator<BaseWorker>() {

    // public boolean hasNext() {

    // return cursor + 1 < size;
    // }

    // public BaseWorker next() {

    // cursor++;
    // return ListOfWorkers.workers[cursor];
    // }
    // };
    // }

}