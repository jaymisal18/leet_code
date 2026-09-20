class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        int j=1;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int val=('z'-c)+1;

             sum+=val*j;
             j++;
        }
        return sum;
    }
}