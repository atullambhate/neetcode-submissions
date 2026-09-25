class Solution {
    public boolean isAnagram(String s, String t) {
     
     if(s.length() != t.length()) {
        return false;
     }
    char[] unsortedS = s.toCharArray();
    char[] unsortedT = t.toCharArray();


    Arrays.sort(unsortedS);
    Arrays.sort(unsortedT);

    String sortS = new String(unsortedS);
    String sortT = new String(unsortedT);

    if(sortS.equals(sortT)){
        return true;
    }

      return false;
    }
}
