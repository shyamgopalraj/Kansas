import java.util.HashMap;
import java.util.Map;

public class testMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String,String> map = new HashMap<>();
        map.put("A", "b");
        map.put("A", "c");
        System.out.println("value is: "+map.get("A"));
        
    }

}
