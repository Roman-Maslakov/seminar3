import java.util.Iterator;

public class WIterator implements Iterator<BaseWorker>{

    int size;

    int cursor = -1;

    BaseWorker[] arr;

    public WIterator(BaseWorker[] arr) {

        this.arr = arr;
        size = arr.length;
    }

    @Override
    public boolean hasNext() {

        return cursor < size - 1;
    }

    @Override
    public BaseWorker next() {

        cursor++;
        return arr[cursor];
    }
}