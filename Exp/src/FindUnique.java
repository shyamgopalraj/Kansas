import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUnique {
    
    Set<Character> set = new  HashSet<Character>();
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    
    public void solutionForSortedString(String input) {
        if(input == null) {
            return;
        }
        for(int index = 0 ; index<input.length(); index++) {
            char c = input.charAt(index);
            if(set.isEmpty()) {
                set.add(input.charAt(c));
            }
            else {
                if(set.contains(c)) {
                    set.remove(c);
                }
                else
                    set.add(c);
            }
        }
    }
    
    public void solutionForUnsortedString(String input) {
        if(input == null) {
            System.out.println("input string null");
        }
        for(int index = 0; index < input.length(); index++ ) {
            char c = input.charAt(index);
            if(map.containsKey(c)) {
                int val = map.get(c);
                val++;
                map.put(c, val);
            }else
                map.put(c, 1);
        }
        
        for(int index = 0; index < input.length(); index++ ) {
            char c = input.charAt(index);
            int val = map.get(c);
            if(val == 1)
                System.out.println("unique character is string is: "+c);
        }
    }

    public static void main(String[] args) {
        
    }

}
