package offer;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * Create by 六
 * Date:18-7-4
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        int rows=array.length;
        int col=array[0].length;
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < col;j++){
                if(target == array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array;
        array=new int[][] {{1,3},{2,4},{5}};
        //遍历二维数组
        /*for(int i=0;i<array.length;i++){//行数
            for(int j=0;j<array[2].length;j++){ 每行几列。类似于上面的第三个，只有一个，那么这个长度就是1.
                System.out.println(array[i][j]);
            }
        }*/
        int target=3;
        Solution solution = new Solution();
        boolean find = solution.Find(target, array);
        System.out.println(find);
    }
}
