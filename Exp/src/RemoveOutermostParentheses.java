
public class RemoveOutermostParentheses {
	
    public static String removeOuterParentheses(String S) {
        int start = 0;
        int end = 0;
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<S.length();i++) {
        	char c = S.charAt(i);
        	if(c == '(') {
        		sum = sum - 1;
        	}
        	else {
        		sum = sum + 1;
        	}
        	end = i;
        	if(sum == 0) {
        		stringBuilder.append(S.substring(start+1, end));
        		start = end+1;
        	}
        }
        return stringBuilder.toString();
    }
    
	public static void main(String[] args) {
		System.out.println(removeOuterParentheses("(()())(())(()(()))"));
	}
}
