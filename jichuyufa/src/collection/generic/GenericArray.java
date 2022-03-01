package collection.generic;

import java.util.ArrayList;

/**
 * 泛型集合
 */
public class GenericArray {
    public static void main(String[] args) {
        //<String>即为泛型集合
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("xxx");
        arrayList.add("yyy");
//        arrayList.add(10);

        for (Object obj:
             arrayList) {
            String str = (String) obj;
            System.out.println(obj);
        }

    }
}
