package homeWork;

public class PrintCheckerBoard {
    public static void main(String[] args) {
        char[] temp = {' ','0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int size = temp.length;
        char[][] res = new char[size][size];
        res[0] = temp;
        for(int i = 0;i < size;i++){
                for(int j =0; j<size; j++) {
                    if(i == 0){
                        res[i][j] = temp[j];
                    }
                    else if( j == 0){
                            res[i][j] = temp[i];
                    }
                    else {
                        res[i][j] = '+';
                    }
                    System.out.print(res[i][j] + " ");
                }
            System.out.println();
            }
        }
}
