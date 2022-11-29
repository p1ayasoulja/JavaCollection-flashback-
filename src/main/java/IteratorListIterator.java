import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIterator {
    public static void main(String[] args) {
        List<String> stringListFirst=new ArrayList<>();
        stringListFirst.add("firstElem");
        stringListFirst.add("secondElem");
        stringListFirst.add("thirdElem");
        System.out.println("StringListFirst = "+stringListFirst);

        List<String> stringList=new ArrayList<>(stringListFirst);
        System.out.println("StringList = "+stringList);
        Iterator<String> iterator=stringList.iterator();
        System.out.println();
        System.out.println("Lets Iterate it!");
        while(iterator.hasNext()){
            String currentString=iterator.next();
            System.out.println("Current string is "+currentString);
            currentString=null;
        }
        ListIterator<String> listIterator=stringList.listIterator();
        System.out.println("ListIterator");
        while (listIterator.hasPrevious()){

        }
    }
}
