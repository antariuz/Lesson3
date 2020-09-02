package best.com;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;

    public MyLinkedList() {
    }

    public void add(E e) {
        MyNode<E> node = new MyNode<>(e);
        if (head == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
        System.out.println(node.getItem() + " " + size);
    }

    public E showLinkedList() {
        return node.getItem();
    }

    public int getSize() {
        return size;
    }

}
