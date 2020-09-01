package best.com;

public class MyNode<E> {

    private E item;

    private MyNode<E> next;
    private MyNode<E> prev;

    public MyNode(E item) {
        this.item = item;
    }

    public MyNode(MyNode<E> next) {
        this.next = next;
    }


    public MyNode(E item, MyNode<E> next, MyNode<E> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }

    public MyNode<E> getPrev() {
        return prev;
    }

    public void setPrev(MyNode<E> prev) {
        this.prev = prev;
    }

}
