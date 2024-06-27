public abstract class List<E> {
    public abstract boolean isEmpty();
    public abstract void append(E value);
    public abstract void add(E value);
    public abstract int size();
    public abstract E get(int index);
    public abstract void set(int index, E value);
    public abstract void insert(int index, E value);
    public abstract void remove(int index);

}
