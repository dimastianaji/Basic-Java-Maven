import src.main.java.Counter;

public class Driver {

    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        System.out.println("Current Count: " + counter.getCount());
        
        counter.increaseBy(5); 
        
        System.out.println("Current Count: " + counter.getCount()); 
        
        counter.decreaseBy(2);
        
        System.out.println("Current Count: " + counter.getCount());

        counter.multy(2);
        
        System.out.println("Current Count: " + counter.getCount()); 
        
    }

}
