import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int nextNumber;

            @Override
            public boolean hasNext() {
                nextNumber = random.nextInt(max) + min;
                return true;
            }

            @Override
            public Integer next() {
                return nextNumber;
            }
        };
    }
}