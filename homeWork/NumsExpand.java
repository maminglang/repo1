package homeWork;

public class NumsExpand {
    //题目应该价格限制，数组元素不为零
    public static int[] addElement(int[] array, int num){
        int capacity = array.length;//数组初始化长度即为数组容量
        int limitSize =  (int)(capacity*0.8);
        int size = 0;
        for(int i =0;i<capacity;i++){
            if(array[i] !=0){
                size++;
            }
        }
if(size<= limitSize){
    System.out.println("数组需要扩容");
    int[] newArray = new int[(int)(capacity*1.2)];
    System.arraycopy(array,0,newArray,0,capacity);
    newArray[size+1] = num;
    System.out.println("扩容后数组的容量为："+newArray.length);
return newArray;
}else{
    System.out.println("数组不需要扩容");
    array[size+1] = num;
    return array;
}

    }
    public static void main(String[] args) {


    }
}
