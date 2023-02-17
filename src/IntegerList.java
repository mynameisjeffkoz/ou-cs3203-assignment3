import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * IntegerList is a type of List which stores only Integers. It allows the user to perform several tasks relevant to a
 * list of integers, such as finding the sum and product of the integers.
 */
public class IntegerList extends List {

    /**
     * An ArrayList which stores the Integer values in the IntegerList
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

    public void add (int index, int value) {
        list.add(index, value);
    }

    /**
     * Get the sum of all the values in the IntegerList
     * @return the sum of the IntegerList
     */
    public int getSum() {
        int acc = 0;
        for (int num:list)
            acc += num;
        return acc;
    }

    /**
     * Calculate the product of all the values in the IntegerList
     * @return the product of all values in the list
     */
    public int getProduct() {
        int acc = 1;
        for (int num:list)
            acc *= num;
        return acc;
    }

    /**
     * Create a new IntegerList, which contains all the same values as the original list in opposite order
     * @return a new IntegerList
     */
    public IntegerList getReverse() {
        IntegerList newList = new IntegerList();
        for (int num:list) {
            newList.add(0,num);
        }
        return newList;
    }

    /**
     * Returns a String representation of the IntegerList
     * @return a String
     */
    public String toString() {
        return list.toString();
    }

    /**
     * Main method: Allow the user to input their list, and demonstrate the various methods in IntegerList
     * @param args currently unused
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a list of integers, followed by any letter");
        IntegerList list = new IntegerList();
        while (stdin.hasNextInt()) {
            list.add(stdin.nextInt());
        }
        stdin.nextLine();
        stdin.close();
        System.out.println("Your list is " + list.toString());
        System.out.println("The sum is " + list.getSum());
        System.out.println("The product is " + list.getProduct());

    }
}