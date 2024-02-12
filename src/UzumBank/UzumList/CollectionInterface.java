package UzumLits;

public interface CollectionInterface<S> extends IterableInterface<S> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    void add(S s);

    void remove(Object o);
    void clear();

    boolean equalss(Object o);

    int hashCodee();
}
