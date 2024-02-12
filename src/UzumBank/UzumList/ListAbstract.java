package UzumLits;

public abstract class ListAbstract<S> implements ListInterface<S> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(S s) {

    }

    @Override
    public void remove(Object o) {
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equalss(Object o) {
        return false;
    }

    @Override
    public int hashCodee() {
        return 0;
    }
}
