import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * IntegerList is a type of List which stores only Integers. It allows the user to perform several tasks relevant to a
 * list of integers, such as finding the sum and product of the integers.
 */
public class IntegerList extends List {

    /**
     * An ArrayList which stores the Integer values in the NumberList
     */
    ArrayList<Integer> list;

    /**
     * Default constructor, constructs an empty list with no values
     */
    public IntegerList() {
        list = new ArrayList<Integer>();
    }

    /**
     * Constructs a list with any number of Integer values
     * @param values the Integer value(s) to build the list
     */
    public IntegerList(Integer... values) {
        this();
        for (int value : values) {
            list.add(value);
        }
    }

    /**
     * Add any number of Integers to an already existing list
     * @param values the Integer value(s) to add to the list
     */
    public void add (Integer... values) {
        for (Integer value:values) {
            list.add(value);
        }
    }

    /**
     * Returns a String representation of the IntegerList
     * @return a String
     */
    public String toString() {
        return list.toString();
    }

    public static void main(int[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a list of integers, followed by any letter");
        IntegerList list = new IntegerList();
        while (stdin.hasNextInt()) {
            list.add(stdin.nextInt());
        }
        stdin.nextLine();
        System.out.println("Your list is " + list.toString());

    }
}