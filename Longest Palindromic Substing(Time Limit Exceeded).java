import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static String longestPalindrome(String s) {
        String ans="";
        
		if(s.length()==1)
			return s;
		else if(s.length()==2) {
			if(s.charAt(0)==s.charAt(1))
				return s;
			else
				return s.charAt(0)+"";
		}else {
			for(int i=0; i<s.length(); i++) {
				String tmp = s.substring(i,s.length());
				//System.out.println(tmp);
				while(true) {
					if(isPanlindrome(tmp)) {
						if(ans.length()<tmp.length())
							ans=tmp;
						else
							break;
					}else {
						if(tmp.length()==1)
							break;
						tmp = tmp.substring(0,tmp.length()-1);
					}
				}	
			}		
		}
		return ans;
    }
	
	
	public static boolean isPanlindrome(String s) {
		String tmp = s;
		if(s.length()==1)
			return true;
		else if (s.length()==2) {
			if(s.charAt(0)==s.charAt(1))
				return true;
		}
		
		
		if((s.length()%2)==0) {
			while(true) {
				if(tmp.charAt(0)==tmp.charAt(tmp.length()-1)) {
					if(tmp.length()==2)
						break;
					tmp = tmp.substring(1,tmp.length()-1);
				}else {
					return false;
				}
			}	
		}else {
			while(true) {
				if(tmp.charAt(0)==tmp.charAt(tmp.length()-1)) {
					if(tmp.length()==3)
						break;
					tmp = tmp.substring(1,tmp.length()-1);
				}else {
					return false;
				}
			}		
		}	
		return true;
	}
}
