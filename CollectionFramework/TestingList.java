package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        // add(E e);
        strList.add("Neeraj");
        strList.add("Gupta");

        // add(int index,E element);
        System.out.println();

        // remove(int index);
        strList.remove(1);

        //Not Applicable int
       // strList.add(2);

        // remove(Object o);
         strList.remove("Satyam");

         strList.add("Mala");

        // Clear all the element
        // strList.clear();

        // Contains(Object o);
        if (strList.contains("Mala")) {
            // indexOf(Object o);
            System.out.println(strList.indexOf("Mala"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(" " + strList.get(i));
        }
        //For Each Loop
        for(String str:strList){
            System.out.println(str);
        }

    }

}
