import java.util.Vector;

public class VectorStack {

    private Vector<Integer> stack;
    private int size;

    public VectorStack(int size) {
        this.stack = new Vector<Integer>(size);
        this.size = size;
    }

    public void push(int n) {
        if (this.isFull()) {
            System.out.println("Stos jest pełny.");
            return;
        }
        this.stack.add(n);
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stos jest pusty.");
            return -1;
        }
        int top = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return top;
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public boolean isFull() {
        return this.stack.size() == this.size;
    }
}
