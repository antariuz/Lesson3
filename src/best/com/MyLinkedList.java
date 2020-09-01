package best.com;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private MyNode<E> tail;

    public MyLinkedList() {
    }

    public void add(E e) {
        MyNode<E> node = new MyNode<>(e);
        if (head == null){
            head = tail = node;
        } else {

        }
    }

}
