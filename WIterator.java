import java.util.Iterator;

public class WIterator implements Iterator<BaseWorker>{

    int size = ListOfWorkers.workers.length;

    int cursor = 0;

    Iterator<BaseWorker> iterator = new Iterator<BaseWorker>() {

        @Override
        public boolean hasNext() {

            return cursor < size;
        }

        @Override
        public BaseWorker next() {

            //cursor++;
            return ListOfWorkers.workers[cursor];
        }
    };

    public boolean hasNext() {

        return cursor < size;
    }

    public BaseWorker next() {

        //cursor++;
        return ListOfWorkers.workers[cursor];
    }
}