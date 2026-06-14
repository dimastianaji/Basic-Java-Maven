package src.main.java;

public class Counter {

    private int count;
    
    public Counter() {
        this.reset();
    }
        
    public void reset() {
        count = 0;
    }
    
    public void increment() {
        count++;
    }
    
    public void decrement() {
        count--;
    }

    public void increaseBy(int amount) {
        count += amount;
    }

    public void decreaseBy(int amount) {
        count -= amount;
    }

    public void multy(int factor) {
        count *= factor;
    }
    
    public int getCount() {
        return count;
    }
    
}
