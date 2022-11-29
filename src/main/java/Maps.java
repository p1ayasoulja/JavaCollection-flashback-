import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        //key should be unique
        map.put("World","FirstElem");
        System.out.println(map.size());
        map.put("World","SecondElem");
        System.out.println(map.size());
        map.put("World2","ThirdElem");
        System.out.println(map.size());
        map.put("World3","FourthElem");
        System.out.println(map.size());
        System.out.println(map);
        for(Map.Entry<String,String> tmp: map.entrySet()){
            System.out.println(tmp.getKey()+" "+tmp.getValue());
        }
    }
}
