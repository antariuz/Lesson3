package best.com;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedListTest();
    }

    public static void MyLinkedListTest() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }

    public static void MyArrayListTest() {
        long m = System.currentTimeMillis();
        MyArrayList<Integer> array = MyArrayList.testList(5);
        MyArrayList.showSize("Initial size:", array);
        MyArrayList.showList(array);
        MyArrayList<Integer> arrayTwo = MyArrayList.testList(5);
        MyArrayList.debugCheck(array);
        System.out.print("\n\n" + "Performance time: ");
        System.out.println(System.currentTimeMillis() - m);
    }

}
