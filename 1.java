public class Solution {
    public boolean Find(int target, int [][] array) {
        int row=array.length;
        int col=array[0].length;
        int i,j;
        for(i=row-1,j=0;i>=0&&j<col;){
            if(array[i][j]==target)
                return true;
            else if(array[i][j]>target){
                i--;
                continue;
            }
            else if(array[i][j]<target){
                j++;
                continue;
            }
        }
        return false;
    }
}