import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        System.out.println("\nObject \t\t\t\t\t\t\t\t\t\tLength\n");
        String myString = "Java";                                                                   // Normal String value can be indexed into a one dimensional array and other high data structures
        System.out.println(myString + " \t\t\t\t\t\t\t\t\t\t" + myString.length());
        String[] myArray = new String[2];                                                           // A one dimensional array can be added into an arrayList and other high data structures
        myArray[0] = "Java";
        myArray[1] = myString;
        System.out.println(Arrays.toString(myArray) + " \t\t\t\t\t\t\t\t" + myArray.length);
        List<String> myList = new ArrayList<>();                                                    // An arrayList can be added into a linkedList and other high data structures
        myList.add("Java");
        myList.add(Arrays.toString(myArray));
        System.out.println(myList + " \t\t\t\t\t\t" + myList.size());
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Java");
        myLinkedList.add(String.valueOf(myList));
        System.out.println(myLinkedList + " \t\t\t\t" + myLinkedList.size());
    }
}
