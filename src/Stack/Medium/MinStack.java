package Stack.Medium;

import java.util.Arrays;

public class MinStack {
    Object[] array;
    int pointer;
    int next;

    public MinStack() {
        array = new Object[16];
        pointer = 0;
        next = 1;
    }

    public void push(int val) {
        if (pointer + 1 != next) {
            pointer = next - 1;
        }
        if (pointer >= array.length) {
            array = Arrays.copyOf(array, array.length / 2 * 3);
        }
        array[pointer] = val;
        next++;
    }

    public void pop() {
        array[pointer] = null;
        if (pointer > 0) {
            pointer--;
            next--;

        }
    }

    public int top() {
        return (int) array[pointer];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (Object i : array) {
            if (i != null)
                if ((int) i < min)
                    min = (int) i;

        }
        return min;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        Object[] array = new Object[]{2147483646,2147483646,2147483647};
        for (Object i : array) {
            if (i != null)
                obj.push((int) i);
        }
        System.out.println(obj);
        obj.pop();
        obj.pop();
        obj.pop();
        System.out.println(obj);



    }
}
