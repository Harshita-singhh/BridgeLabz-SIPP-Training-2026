public class pair<T, U> {

    private T first;
    private U second;

    public pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
    }
}