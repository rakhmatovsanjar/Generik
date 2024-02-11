public class SanjarList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public SanjarList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elementData.length) {
            int newCapacity = elementData.length * 3 / 2 + 1;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = elementData[i];
            }
            elementData = newArray;
        }
    }


    public int size() {
        return size;
    }


    public void add(T element) {
        ensureCapacity(size + 1);
        elementData[size++] = element;
    }

    public void addAll(SanjarList<T> newElementDat) {
        ensureCapacity(size + newElementDat.size());
        for (int i = 0; i < newElementDat.size(); i++) {
            elementData[size++] = newElementDat.get(i);
        }
    }

    public void remove(T element) {
        int found = -1;
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            for (int i = found; i < size - 1; i++) {
                elementData[i] = elementData[i + 1];
            }
            size--;
        }
    }


    public void add(int index, T element) {
        if (index < 0 || index > size) {
            System.out.println("Bunaqa index yuq aka adshtiz");
        }
        ensureCapacity(size + 1);
        Object[] newArray = new Object[size + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = elementData[i];
        }
        for (int i = index; i < size; i++) {
            newArray[i + 1] = elementData[i];
        }
        newArray[index] = element;
        elementData = newArray;
        size++;
    }

    public T get(int index) {
        for (int i = 0; i < elementData.length; i++) {
            if (i == index) {
                return (T) elementData[i];
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(elementData[i]);
        }
        result.append("]");
        return result.toString();
    }

}
