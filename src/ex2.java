import java.util.*;

public class ex2 {

    Random r = new Random();

    public static void main(String[] args) {
        ex2 main = new ex2();
        int size = 5571;
        int loops = 577;

        // List to store the random integers
        List<Integer> data = new LinkedList<Integer>();

        // fill the list with [size] random integers
        for (int i = 0; i < size; i++) {
            int n = main.r.nextInt();
            data.add(n);
        }

        // sort the data set for faster analysis
        Collections.sort(data);

        List<Integer> data2 = new ArrayList<Integer>(data);

        Date currDate = new Date();
        main.test(size, loops, data);
        System.out.println("LinkedList: " + (new Date().getTime() - currDate.getTime()) + " ms");

        Date currDate2 = new Date();
        main.test(size, loops, data2);
        System.out.println("ArrayList: " + (new Date().getTime() - currDate2.getTime()) + " ms");
    }

    void test(int size, int loops, List<Integer> data) {
        // for [loops] random numbers
        for (int loop = 0; loop < loops; loop++) {
            // lookup how many elements are smaller than lookFor
            int lookFor = r.nextInt();
            int count = 0; // not found -> all elements smaller
            for (int i = 0; i < data.size(); i++) {
                ++count;
                if (data.get(i) >= lookFor) {
                    break;
                }
            }
            // [count] now contains the #elements smaller then lookFor
            // do something useful with that information
        }
    }
}