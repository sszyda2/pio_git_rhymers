package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int ZERO_REJECTED = 0;
    private int totalRejected = ZERO_REJECTED;

    /**
     * @return total number of rejected rhymers
     */
    public int getTotalRejected() {
        return totalRejected;
    }

    /**
     * @return total number of rejected rhymers
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * @param in line 25 increases if a number is rejected
     */

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
