import java.util.ArrayList;
import java.util.List;

public class BasicListMethods {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        //Adding new obj to list
        stringList.add("newString");
        stringList.add("secondString");
        stringList.add("thirdString");
        //showing list
        System.out.println(stringList);
        //is list contains "string"
        System.out.println(stringList.contains("thirdString"));
        List<String> stringList2=new ArrayList<>();
        stringList2.add("fourthString");
        //Adding elem of list2 to list
        stringList.addAll(stringList2);
        System.out.println(stringList);
        //clearing list2
        stringList2.clear();
        stringList2.addAll(stringList);
        //is list2.equals to list?
        System.out.println(stringList.equals(stringList2));
        String newS="fifth element";
        //adding string elem
        stringList.add(newS);
        System.out.println(stringList);
        stringList2.remove(newS);
        System.out.println(stringList);
    }
}
