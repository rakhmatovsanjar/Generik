package UzumLits;

public interface ListInterface<S> extends CollectionInterface<S> {
    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean contains(Object o);

    @Override
    void add(S s);

    @Override
    void remove(Object o);

    @Override
    void clear();

    @Override
    boolean equalss(Object o);

    @Override
    int hashCodee();
}
