import java.util.ArrayList;
import java.util.Collections;

public class Largestpalindromeproduct {

    public static boolean ispalindrome(int val){
	String s1 = String.valueOf(val);
	StringBuffer sb = new StringBuffer(s1);
	StringBuffer sr = sb.reverse();
	String s2 = sr.toString();
	if(s1.equals(s2)){
	    return true;
	}else{
	    return false;
	}
    }
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=999; i>=100; i--){
	    for(int j=999; j>=100; j--){
		int val=i*j;
		if(ispalindrome(val)){
		    list.add(val);
		}
	    }
	}
	System.out.print(Collections.max(list));    
	}
}
