import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program is running");

        /*
        List funktioner:

        insert(n, e): insert the item e at position n,
        remove(n): remove the item at position n,
        get(n): get the item at position n,
        sort(): sort the items in the list,
        slice(start, end): return a sub-list slice starting at the position start up until the position end,
        reverse(): reverse the order of the list.


         */

        //Arrays
        int[] numberArray = {1, 2 , 3, 4};

        ArrayMethodsClass.arraySumMethod(numberArray);


        ArrayMethodsClass.arrayAverageMethod(numberArray);


        System.out.println(Arrays.stream(numberArray).average());

        ArrayList<String> names = new ArrayList<>();
        names.add(0, "Lolman");
        names.add(1, "Davo");

        //HashMap (Abstract Data Type (ADT) implementation)

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("David", 69696969);
        phonebook.put("Lars", 42042069);
        System.out.println(phonebook);

        /*HashMap funktioner:
        put(key, value): add a key-value mapping,
        delete(key): remove key and its associated value,
        get(key): retrieve the value associated to the key
         */

        System.out.println(phonebook.get("David"));

        // Comparable
        // public interface Comparable<T> laver en ordning på objekterne af hver class der gør brug af det.
        // Dette bliver kaldt classens "naturlige" orden og classens compareTo method er dens "naturlige" comparison method



String s1 = "hi";
String s2 = "ho, man";
        System.out.println(s1.compareTo(s2));

        Reddit hey = new Reddit("Lolz", 3000);
        Reddit omfgjajajajajaja = new Reddit("fuck dig lmao lol haha xdxdxd", 1000000);

        System.out.println(hey.compareTo(omfgjajajajajaja));





    }
}