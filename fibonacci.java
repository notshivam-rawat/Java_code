import java.sql.SQLOutput;

public class fibonacci {
    public static void fibonacci(int nOrder){
        int num1= 0;
        int num2 = 1;
        for(int i = 1;i<=nOrder;i++){
            int sum = num1+num2;
            num1 = num2;
            num2 = sum;
        }
    }
    public static void main(String[] args){
        int nOrder
    }
}
