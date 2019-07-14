import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("printing something..");
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("vikash");
        stringList.add("rahul");
        stringList.add("priyanka");

        for (String name:stringList
             ) {
            System.out.println(name);
        }


    }
}