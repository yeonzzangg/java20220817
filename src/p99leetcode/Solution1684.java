package p99leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
	 public int countConsistentStrings(String allowed, String[] words) {
		 int cnt = 0;
			Set<Character> allowedLetters = new HashSet<>();

			// allowed -> char배열로
			for(char letter : allowed.toCharArray())
			{
				allowedLetters.add(letter);
			}

			// 비교
			for(String word : words)
			{
				for(int i = 0; i < word.length(); i++)
				{
					// allowed를 하나라도 포함하지 않으면 break
					if(!allowedLetters.contains(word.charAt(i)))
					{
						break;
					}

					if(i == word.length() -1)
					{
						cnt++;
					}
				}
			}

			return cnt;
	 }
	
	
	
	
//	
//    public int countConsistentStrings(String allowed, String[] words) {
//        int cnt = 0;
//        for (String word : words) {
//            if (consistOf(allowed, word)) {
//                cnt++;   
//            }
//        }
//        
//        return cnt;
//    }
//    
//    private boolean consistOf(String allowed, String word) {
//        for (int i = 0; i < word.length(); i++) {
//            if (!hasChar(allowed, word.charAt(i))) {
//                return false;
//            }
//        }
//        
//        return true;
//    }
//    
//    private boolean hasChar(String allowed, char c) {
//        for (int i = 0; i < allowed.length(); i++) {
//            if (allowed.charAt(i) == c) {
//                return true;
//            }
//        }
//        
//        return false;
//    }
}