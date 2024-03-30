// 1
public class CustomQueue<T> {
    private LinkedList<T> queue = new LinkedList<T>();

        public void add(T element) {
        queue.add(element);
    }

    public T get() {
        return queue.find(0);
    }

    public T remove() {
        return queue.remove(0);
    }
}
