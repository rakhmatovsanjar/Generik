package UzumBank.S_ArrayList;

import UzumBank.BankModel;
import UzumLits.ListAbstract;

public class S_ArrayList<S> extends ListAbstract<S> {
    BankModel bankModel=new BankModel();
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public S_ArrayList() {
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    public boolean containsNumber(Integer n) {
        return n.equals(bankModel.getPhoneNomber());
    }
    public boolean containsPassword(String s) {
        return s.equals(bankModel.getPassword());
    }

    @Override
    public void add(S s) {
        ensureCapacity(size + 1);
        elementData[size++] = s;
    }

    @Override
    public void remove(Object o) {
        int found = -1;
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
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

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i]=null;
        }
        size=0;
    }

    @Override
    public boolean equalss(Object o) {
        return super.equalss(o);
    }

    @Override
    public int hashCodee() {
        return super.hashCodee();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("-------------------------------------\n");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                result.append("-------------------------------------\n");
            }
            result.append(elementData[i]);
        }
        result.append("-------------------------------------\n");
        return result.toString();
    }
}
