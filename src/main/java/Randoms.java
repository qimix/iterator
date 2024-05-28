import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    Integer min;
    Integer max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
        iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();

    }

    private class RandomIterator implements Iterator {
        int num = random.nextInt(max) + min;

        @Override
        public boolean hasNext() {
            if(num >= min) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return num;
        }
    }
}
