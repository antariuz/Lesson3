package best.com;


public class Main {

    public static void main(String[] args) {


        long m = System.currentTimeMillis();

        MyArrayList<Integer> array = MyArrayList.testList(5);
        MyArrayList.showSize("Initial size:", array);
        MyArrayList.showList(array);
        MyArrayList<Integer> arrayTwo = MyArrayList.testList(5);
//        MyArrayList.debugCheck(array);
//
//
//        System.out.print("\n\n" + "Performance time: ");
//        System.out.println(System.currentTimeMillis() - m);
    }


}
