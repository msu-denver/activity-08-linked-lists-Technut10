/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Activity 08 - LinkedList
 */


public class LinkedList<E> {

    private class Node<E> {
        private E value;
        private Node<E> next;

        public Node(final E value) {
            this.value = value;
            next = null;
        }
        public E getValue() {
            return value;
        }
        public Node<E> getNext() {
            return this.next;
        }
        public void setValue(E value) {
            this.value = value;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
        @Override
        public String toString() {
            return value.toString();
        }
    }

    private Node<E> head;
    public LinkedList() {
            head = null;
    }

    public boolean isEmpty() {
        return false;
    }

    public void append(E value) {
        Node<E> newNode = new Node<>(value);
        if (isEmpty())
            head = newNode;
        else {
            Node<E> current = head;
            while (current.getNext() != null)
                current = current.getNext();
            // at this point current (for sure) points to the tail node!
            current.setNext(newNode);
        }
    }

    public void add(E value) {
        /*
        * case 1: the list is empty
        * other cases: the list is NOT empty*/
        Node newNode = new Node(value);
        if (!isEmpty()) {
            newNode.setNext(head);
            head = newNode;
        }
        head = newNode;

    }

    public int size() {
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }

    public E get(int index) {
        if(index < 0 )
            throw new ArrayIndexOutOfBoundsException();
        int currentIndex = 0;
        Node<E> current = head;
        while(currentIndex < index && current != null){
            currentIndex++;
            current = current.getNext();
        }
        // when current is null after the loop above it means that the given index is invalid
        if(current == null){
            throw new ArrayIndexOutOfBoundsException();
        }// at this point current is NOT null AND therefore currentIndex = index (or, in other words, current
        // is pointing to the node we want)
        current.setValue(current.getValue());
        return current.getValue();
    }

    public void set(int index, E value) {
        if(index < 0 )
            throw new ArrayIndexOutOfBoundsException();
        int currentIndex = 0;
        Node<E> current = head;
        while(currentIndex < index && current != null){
            currentIndex++;
            current = current.getNext();
        }
        // when current is null after the loop above it means that the given index is invalid
        if(current == null){
            throw new ArrayIndexOutOfBoundsException();
        }// at this point current is NOT null AND therefore currentIndex = index (or, in other words, current
        // is pointing to the node we want)
        current.setValue(value);
    }

    public void insert(int index, E value) {

    }

    public void remove(int index) {

    }

    @Override
    public String toString() {
        Node <E> current = head;
        String out = "[";
        while(current != null){
            out += current + ", ";
            current = current.getNext();

        }
        out = out.trim();
       return out + "]";
    }
}
