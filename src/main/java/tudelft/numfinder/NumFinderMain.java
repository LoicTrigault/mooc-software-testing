package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        nf.find(new int[] {4, 25, 7, 9});

        // this crashes car on ne fait que comparer des valeurs qui sont < n
        // pas de passage dans le else if
        //nf.find(new int[] {4, 3, 2, 1});

        System.out.println("=======Result=======");
        System.out.println("largest : "+nf.getLargest());
        System.out.println("smallest : "+nf.getSmallest());

    }
}
