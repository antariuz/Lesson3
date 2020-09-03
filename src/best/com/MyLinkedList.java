package best.com;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;

    public MyLinkedList() {
    }

    public boolean isEmpty() {
        return head.getItem() == null;
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
    }

    public void showLinkedList() throws MyExceptions {
        MyNode<E> tempNode = head.getNext();
        if (isEmpty()) {
            throw new MyExceptions("This Linked List is empty");
        }
        for (int i = 0; i < getSize(); i++) {
            if (i == 0) {
                System.out.print(head.getItem() + " ");
            } else if (i == getSize() - 1) {
                System.out.println(tempNode.getItem());
            } else {
                System.out.print(tempNode.getItem() + " ");
                tempNode = tempNode.getNext();
            }
        }
        for (int i = 0; i < getSize(); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public int getSize() {
        return size;
    }

}
