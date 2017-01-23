import java.util.*;

public class ex2 {

    public static void main(String[] args) {
        ex2 main = new ex2();
        int size = 5571;
        int loops = 577;

        Date currDate = new Date();
        main.test1(size, loops);
        System.out.println("test1 " + (new Date().getTime() - currDate.getTime()) + " ms");

        Date currDate2 = new Date();
        main.test2(size, loops);
        System.out.println("test2 " + (new Date().getTime() - currDate2.getTime()) + " ms");
    }

    void test1(int size, int loops) {
        // List to store the random integers
        List<Integer> data = new LinkedList<Integer>();

        Random r = new Random();

        // fill the list with [size] random integers
        for (int i = 0; i < size; i++) {
            int n = r.nextInt();
            data.add(n);
        }

        // sort the data set for faster analysis
        Collections.sort(data);

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

    void test2(int size, int loops) {
        // List to store the random integers
        List<Integer> data = new ArrayList<Integer>();

        Random r = new Random();

        // fill the list with [size] random integers
        for (int i = 0; i < size; i++) {
            int n = r.nextInt();
            data.add(n);
        }

        // sort the data set for faster analysis
        Collections.sort(data);

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