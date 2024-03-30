public interface CollectionsList<T> {
    public void add(T element);
    public void add(int index, T element);
    public T remove(int index);
    public void removeByElement(T element);
    public void clear();
    public Object find(int index);
    public int findByElement(T element);
}
