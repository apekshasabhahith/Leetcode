/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0;
        int end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid;//if mid becomes end then there is no need of cheking further since all of the further elements are bad itself so we update end by mid and keeps on cheking on left side of the array!!
            }
            else{
                start=mid+1;//if mid value is not bad then we goes on cheking on right side of the array till the end by taking mid+1 as start till the end of the array
            }
            }
         return start; //at last middle and last and start element will beome same hence we make it return it can be end also...
        }
        
    }
