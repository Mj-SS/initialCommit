package pl.sda.szymon;

public class StackImpl implements StackInterface {

    private Object[] stackData = new Object[10];
    private int currentIndex = 0;


    @Override
    public void push(Object obj) {
        stackData[currentIndex] = obj;
        currentIndex++;
    }
    @Override
    public Object pop() {
       Object obj = stackData[currentIndex - 1];
       stackData[currentIndex - 1] = null;
       currentIndex--;
        return obj;
    }

    @Override
    public Object peek() {
        return stackData[currentIndex - 1];
    }
}
