package best.com;

public class Main {

    public static void main(String[] args) {
        MyLinkedListTest();
    }

    public static void MyLinkedListTest() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");
        list.add("y");
        System.out.println(list.getSize());
        System.out.println(list.showLinkedList());

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
