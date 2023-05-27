package TwoPointers.Easy;

public class ValidPalindrome {
   public boolean solution(String s) {
       s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
       int l = 0;
       int r = s.length() - 1;
       char[] chars = s.toCharArray();
       for(;l < s.length() / 2;l++){
           if(chars[l] != chars[r]) {
               return false;
           }
           r--;
       }
       return true;
   }
}
