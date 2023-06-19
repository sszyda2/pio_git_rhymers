package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int TOTAL_NUMBERS = 12;
    public static final int ZERO_ELEMENTS = -1;
    private static final int DEFAULT = -1;
    private int total = ZERO_ELEMENTS;
    private final int[] numbers = new int[TOTAL_NUMBERS];

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ZERO_ELEMENTS;
    }

    public boolean isFull() {
        return total == TOTAL_NUMBERS - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

}
