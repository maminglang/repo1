package homeWork;

import java.util.Random;

public class DoubleChromosphere {
    public static void main(String[] args) {
        //前六位为红球，后一位为蓝球,基于数组实现
        Random rand = new Random();
        int[] nums = new int[7];
        int[] tempNum = new int[33];
//        int temp = 0;
//        int count = 0;
//        while (temp<tempNum.length){
//            int redNum = rand.nextInt(33)+1;
//            if(tempNum[redNum-1] != redNum-1){
//                tempNum[redNum-1] = redNum;
//                count ++;
//            }
//            if(count == 5){
//                break;
//            }
//            temp++;
//        }
//        for(int i= 0;i<tempNum.length;i++){
//            int index = 0;
//            if(tempNum[i]!= 0){
//                nums[index] = tempNum[i];
//                index++;
//            }
//        }
        nums[0] = rand.nextInt(33)+1;
        int generateNum = 1;
        while(generateNum<=nums.length-2){
            //每生成一次数字，就需要与前面的对比，避免重复。在数组情况下有更好写法？
            nums[generateNum] = rand.nextInt(33)+1;
            for(int i =0;i<nums.length-3;i++){
                if(nums[i]!= nums[generateNum]){
                    break;
                }
            }
            generateNum++;
        }
        nums[nums.length-1] = rand.nextInt(16)+1;

        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
