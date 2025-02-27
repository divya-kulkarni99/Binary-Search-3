//Pow(x, n)
//Time Complexity :  O(log N)
//Space Complexity : O(log N)
class Solution {
    public double myPow(double x, int n) {
        //base
        if(n == 0) return 1.0000;
        //logic
        double result = myPow(x, n/2);
        if(n % 2 == 0){
            return result*result;
        }
        else{
            if(n < 0) return result*result*1/x;
            return result*result*x;
        }
    }
}