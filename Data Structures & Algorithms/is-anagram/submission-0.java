class Solution {
    public boolean isAnagram(String s, String t) {
     
     if(s.length() != t.length()) {
        return false;
     }
    char[] charS = s.toCharArray();
    char[] charT = t.toCharArray();


    Arrays.sort(charS);
    Arrays.sort(charT);

    String sortS = new String(charS);
    String sortT = new String(charT);

    if(sortS.equals(sortT)){
        return true;
    }

      return false;
    }
}
