class Solution {
    public int reverse(int x) {
        long sum = 0;
        int k = x;

        if (x<0){
            k = -1*k;
        }
        while(k>0){
            sum = sum*10 + x%10;
            x = x/10;
            k = k/10;
        }
        if(sum < Math.pow(-2,31) || sum > Math.pow(2,31) ){
            return 0;
        }
        else{
            return (int)sum;
        }
    }
}
