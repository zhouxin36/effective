package chapterone;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Stack<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E object) {
        ensureCapacity();
        elements[size++] = object;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        //noinspection unchecked
        E object = (E) elements[--size];
        //清空过期的引用
        elements[size] = null;
        return object;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static <E extends Comparable<E>> E max(List<E> list){
        Iterator<E> i = list.iterator();
        E result = i.next();
        while(i.hasNext()){
            E t = i.next();
            if(t.compareTo(result) > 0){
                result = t;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer max = Stack.max(list);
        System.out.println(max);

        Class<Integer> clazz = Integer.class;
    }
}
