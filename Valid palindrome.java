class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int l=0;
        int h=s.length() - 1;
        char cHead,cTail;
        while(l<=h){
            cHead=s.charAt(l);
            cTail=s.charAt(h);
            if(!Character.isLetterOrDigit(cHead)){
                l++;
            }
            else if(!Character.isLetterOrDigit(cTail)){
                h--;
            }
            else{
                if(Character.toLowerCase(cHead)!=Character.toLowerCase(cTail)){
                    return false;
                }
                l++;
                h--;
            }
        }
        return true;
    }
}
