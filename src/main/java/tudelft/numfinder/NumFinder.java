package tudelft.numfinder;


public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {

        for(int n : nums) {
            System.out.println("n : "+n);
            System.out.println("smallest : "+smallest);
            System.out.println("largest : "+largest);

            if(n < smallest)
                smallest = n;
            else if (n > largest)
                largest = n;

        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
