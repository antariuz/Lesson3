package best.com;

public class ArrayList {

    private Object E;
    private final int INITIAL_CAPACITY = 10;
    private int currentCapacity;
    private int index;


    public ArrayList(){
        this.ArrayList
    }


//    public void add(Object E) {
//        Object[currentCapacity] = new Object[currentCapacity + 1];
//        ArrayList[currentCapacity]
//    }

    public Object getE() {
        return E;
    }

    public void setE(Object e) {
        E = e;
    }

    public int getINITIAL_CAPACITY() {
        return INITIAL_CAPACITY;
    }

    public void setINITIAL_CAPACITY(int INITIAL_CAPACITY) {
        this.INITIAL_CAPACITY = INITIAL_CAPACITY;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

}
