class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        java.util.Arrays.sort(tarr);
        java.util.Arrays.sort(sarr);
        int i = 0;
        int j = 0;
        while(i!=s.length() && j!=t.length()){
            if(sarr[i] != tarr[j]) return false;
            i++;
            j++;
        }
        return true;
    }
}
