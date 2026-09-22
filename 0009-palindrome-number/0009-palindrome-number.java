class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
       int sum=0;
        while(x>0){
           sum=(sum*10)+(x%10);
           x=x/10; 
        }
        if(num==sum){
            return true;
        }
        return false;
    }
}