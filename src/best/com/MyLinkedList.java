package best.com;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;

    public MyLinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isValidIndex(int index) {
        return index < getSize();
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

    public void add(int index, E e) throws MyExceptions {
        if (!isValidIndex(index)) {
            throw new MyExceptions("The inputted index is larger than the size of the Linked List");
        }
        MyNode<E> newNode = new MyNode<>(e);
        if (index == 0) {
            newNode.setPrev(null);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else {
            MyNode<E> prevNode = findNode(index - 1);
            MyNode<E> nextNode = findNode(index);
            prevNode.setNext(newNode);
            newNode.setPrev(prevNode);
            newNode.setNext(nextNode);
            newNode.setPrev(newNode);
        }
        size++;
    }

    public E peek() {
        return head.getItem();
    }

    public void push(E e) {
        MyNode<E> pushNode = new MyNode<>(e);
        pushNode.setPrev(null);
        pushNode.setNext(head);
        head.setPrev(pushNode);
        head = pushNode;
        size++;
    }


    public MyNode<E> findNode(int index) throws MyExceptions {
        if (!isValidIndex(index)) {
            throw new MyExceptions("The inputted index is larger than the size of the Linked List");
        }
        MyNode<E> detectedNode = head;
        for (int i = 0; i < index; i++) {
            detectedNode = detectedNode.getNext();
        }
        return detectedNode;
    }

    public void showLinkedList() throws MyExceptions {
        if (isEmpty()) {
            throw new MyExceptions("This Linked List is empty");
        }
        MyNode<E> tempNode = head;
        for (int i = 0; i < getSize(); i++) {
            if (i == 0) {
                System.out.print(head.getItem() + " ");
            } else if (i == getSize() - 1) {
                tempNode = tempNode.getNext();
                System.out.println(tempNode.getItem());
            } else {
                tempNode = tempNode.getNext();
                System.out.print(tempNode.getItem() + " ");
            }
        }
        for (int i = 0; i < getSize(); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

}
