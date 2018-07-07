/**
 * Create by 六
 * Date:18-7-7
 * 二分查找
 */
public class binary {
    //二分查找，其实就是边界问题。
    public static int binarySerach(int array[],int key){
        int left=0;
        int right=array.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(array[mid]==key){
                return mid;
            }else if(array[mid]<key){  //在右半边
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
    //查找第一个与某元素相同的下标
    public static int findFirstEqual(int array[],int key){
        int left=0;
        int right=array.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(array[mid]>key){
                right=mid-1;
            }else {
                left=mid+1;
            }
            if(array[mid]==key){
                return mid;
            }
        }
        return -1;
    }
    /**
     * 假如查找8.  初始：left=0;right=8;mid=4,下标为4的值为5,5<8.
     *              left=4+1,right=8,没有变.mid=6,下标6的为7 7<8.
     *              left=6+1,right=8,mid=7  下标7的为8  8=8.找到了。下标为7。
     * @param args
     */
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,2,9,2};
        int i = binarySerach(array, 2);
        System.out.println(i);
    }
}
