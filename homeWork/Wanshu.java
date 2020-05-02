package homeWork;

public class Wanshu {
    public static int[] yinzi(int n){
        int[] res = new int[(n+1)/2];
        for(int i =1;i<=(n+1)/2;i++){
            if(n%i == 0){
                res[i-1] = i;
            }
        }
        return res;
    }
public static boolean isWanshu(int n){
        if(n==1){
            return false;
        }
    for(int i =2;i<n;i++){
        int[] res = yinzi(i);
        int sum = 0;
        for(int j = 0;j<res.length;j++){
            sum += res[j];
        }
        if(sum == i){
            System.out.println(i);
        }
    }
    return  false;
}
    public static void main(String[] args) {
        isWanshu(1000);
    }
}
