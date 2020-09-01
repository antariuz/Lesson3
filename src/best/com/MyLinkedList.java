package best.com;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private MyNode<E> tail;

    private int size;

    public MyLinkedList() {
    }

    public void add(E e) {
        MyNode<E> node = new MyNode(e);
        node.setItem(e);
        if (node.getPrev() == null){
            node = head;
        } else if (node.getNext() == null){
            node = tail;
        }
    }

}
