import java.util.ArrayList;
import java.util.Arrays;
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
        //what size of list?
        System.out.println(stringList.size());
        //remove elem
        stringList.remove(newS);
        System.out.println(stringList);
        System.out.println(stringList.size());
        //adding with index
        stringList.add(1,"secondElementNew");
        String[] massString=new String[5];
        //to mass
        stringList.toArray(massString);
        System.out.println("In massive with name MassString "+Arrays.toString(massString));
        //
        System.out.println("For each stringList");
        for(String foreach:stringList){
            System.out.println(foreach);
        }

    }
}
