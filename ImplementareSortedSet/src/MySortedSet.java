import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> mySortedSet = new TreeSet<Integer>();

        // Adding elements to the sorted set
        mySortedSet.add(10);
        mySortedSet.add(30);
        mySortedSet.add(20);

        // Printing the sorted set
        System.out.println("Sorted Set: " + mySortedSet);

        // Accessing the first and last elements of the sorted set
        int firstElement = mySortedSet.first();
        int lastElement = mySortedSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
/*This code creates a TreeSet object and adds some elements to it using the add method.
It then prints the sorted set using System.out.println, accesses the first and last elements of the sorted set using the
first and last methods, and prints those elements.
Since TreeSet implements the SortedSet interface, the elements are automatically sorted in natural order.
The first method is used to access the first (lowest) element in the sorted set,
 and the last method is used to access the last (highest) element in the sorted set.
 */

