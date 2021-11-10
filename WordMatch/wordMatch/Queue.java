import java.util.Iterator;

//Queue is used as a data structure that follows the First Out, Last In rule. 

public class Queue<T> implements Iterable<T>
{
    private Node first, last;
    private int count = 0; 
    private class Node {
        private T item;
        private Node next;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void enqueue(T item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
            count = count + 1; 
        } else {
            oldlast.next = last;
            count = count + 1; 
        }
    }
    
    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        count = count - 1; 
        return item;
    }
    
    public int size()
    {
        return count; 
    }
    
    // To make this data structure work with for-each loops
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<T> {

        private Node n = first;

        public boolean hasNext() {
            return n != null;
        }

        public T next() {
            T item = n.item;
            n = n.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
}
