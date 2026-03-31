class Solution {
    public int arrangeCoins(int n) {
        long start=1;//we cannot use zero here..atleast we should have 1 coin
        long end=n;//total number of coins we have
        while(start<=end){
            long mid=start+(end-start)/2;
            long coins=mid*(mid+1)/2;// total complete rows that we can fill
            if(coins==n){
                return (int)mid;
            }
            else if(coins<n){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return (int)end;


        
    }
}