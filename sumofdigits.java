

// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum<10)
        return 1;
        if(sum%11==0)
        return 1;
        return 0;
        // code here
    }
}
