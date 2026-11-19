import java.util.LinkedList;
import java.util.Queue;

// Abstract Class
abstract class AbstractClassQueue {

    // Abstract methods
    public abstract void addItem(String item);
    public abstract void offerItem(String item);
    public abstract void displayQueue();
    public abstract String peekItem();
    public abstract String elementItem();
    public abstract String pollItem();
    public abstract String removeItem();
    public abstract boolean isQueueEmpty();
    public abstract int getQueueSize();
}

// Subclass
class SubClassQueue extends AbstractClassQueue {

    // Create a Queue using LinkedList
    Queue<String> products = new LinkedList<String>();

    // Add a product using add()
    @Override
    public void addItem(String item) {
        products.add(item);
    }

    // Add a product using offer()
    @Override
    public void offerItem(String item) {
        products.offer(item);
    }

    // Display all products
    @Override
    public void displayQueue() {
        System.out.println("Product Queue: " + products);
    }

    // Get the first product using peek()
    @Override
    public String peekItem() {
        return products.peek();
    }

    // Get the first product using element()
    @Override
    public String elementItem() {
        return products.element();
    }

    // Remove the first product using poll()
    @Override
    public String pollItem() {
        return products.poll();
    }

    // Remove the first product using remove()
    @Override
    public String removeItem() {
        return products.remove();
    }

    // Check if the Queue is empty
    @Override
    public boolean isQueueEmpty() {
        return products.isEmpty();
    }

    // Get the number of products
    @Override
    public int getQueueSize() {
        return products.size();
    }
}

// Main Class
public class MainQueue {

    public static void main(String[] args) {

        // Create an object of SubClassQueue
        SubClassQueue productQueue = new SubClassQueue();

        // Add products to the Queue
        productQueue.addItem("Laptop");
        productQueue.offerItem("Keyboard");
        productQueue.offerItem("Mouse");

        // Display all products
        productQueue.displayQueue();

        // Display the first product
        System.out.println("Peek (first product): " + productQueue.peekItem());

        // Display the first product using element()
        System.out.println("Element (first product): " + productQueue.elementItem());

        // Remove the first product using poll()
        System.out.println("Removed (poll): " + productQueue.pollItem());

        // Remove the first product using remove()
        System.out.println("Removed (remove): " + productQueue.removeItem());

        // Display Queue after removals
        System.out.println("Product Queue after removals:");
        productQueue.displayQueue();

        // Check if the Queue is empty
        System.out.println("Is product queue empty? " + productQueue.isQueueEmpty());

        // Display the Queue size
        System.out.println("Number of products: " + productQueue.getQueueSize());
    }
}
