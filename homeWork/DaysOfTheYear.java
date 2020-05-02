package homeWork;

import java.util.Scanner;

public class DaysOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // next方式接收字符串
        System.out.println("请输入年月日(例2020.4.27)：");
        // 判断是否还有输入
        String str1 = "";
        str1 = scanner.nextLine();
        scanner.close();

        String[] temp = str1.split("\\.");//split的参数是个正则表达式。以.作为分割符的时候，需要加//
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int days = Integer.parseInt(temp[2]);
        int[] arr = new int[]{31,60,91,121,152,182,213,244,274,305,335,366};

        int num = 0;
        if(month == 1){
            num = days;
        }
        if(isLeapYear(year)){//闰年
                num = arr[month-2]+days;
        }else{
            num = arr[month-2]+days -1;
        }
        System.out.println(num);

    }

    public  static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
