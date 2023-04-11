public class ByTwos implements Series {

    int value;

    ByTwos() {
        value = 0;
    }

    public int getNext() {
        value += 2;
        return value;
    }
}
