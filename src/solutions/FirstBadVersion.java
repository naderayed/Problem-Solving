package solutions;

public class FirstBadVersion {

    /*
    description:
    You are a product manager and currently leading a team to develop a new product.
    Unfortunately, the latest version of your product fails the quality check.
    Since each version is developed based on the previous version, all the versions after a bad version are also bad.
    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
    which causes all the following ones to be bad.
    You are given an API bool isBadVersion(version) which returns whether version is bad.
    Implement a function to find the first bad version. You should minimize the number of calls to the API.
    solution: very basic problem i will use binarySearch algo to get the very first bad version while nothing to explain
    Link:https://leetcode.com/problems/first-bad-version/
     */

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


        public int firstBadVersion(int n) {
            int first=0;
            int last= n;
            while(first<=last){
                int m = first+(last-first)/2;
                if(true){
               // if(!isBadVersion(m)){
                    first = m+1;
                }else{
                    last = m-1;
                }
            }
            return first;
        }

}
