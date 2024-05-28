import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    Integer min;
    Integer max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int a = random.nextInt(max) + min;

            @Override
            public boolean hasNext() {
                if (a != 0) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                return a;
            }
        };
    }
}