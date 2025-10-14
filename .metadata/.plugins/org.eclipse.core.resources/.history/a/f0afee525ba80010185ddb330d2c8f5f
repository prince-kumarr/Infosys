package String;

public class removedublicate {
	static char to_lower(char ch) {
		if(ch >= 'A' && ch <= 'Z') {
			return (char) (ch + ('a' - 'A'));
		}
		return ch;
	}
	static String rem_dup(String str) {
		int sl = str.length();
        String res = "";
        for(int i = 0; i < sl; i++) {
            // If the character is not already in the result string, add it.
        	boolean found = false;
            for(int j=0;j<res.length();j++) {
            	if(to_lower(res.charAt(j)) == to_lower(str.charAt(i)) && res.charAt(j) != ' ' ) {
            		found = true;
            	}
       		}
            if(!found) {
            	res += str.charAt(i);
            }
        }
        return res;
	}
	public static void main(String[] args) {
		
		System.out.println(rem_dup("Ahello world oleF"));
       
	}

}
