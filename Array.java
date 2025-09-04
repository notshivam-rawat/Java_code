import java.util.Scanner;
// array is a non primitive data type
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  l = sc.nextInt();
        int arr[] = new int[l];
        int sum = 0;
        for(int i=0;i<l;i++){



        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<l;i++){
            sum = sum + arr[i];
            if(i%2==0){
                System.out.println("the even number in array is "+arr[i]);


            }
            else{
                System.out.println("the odd number in array is "+arr[i]);
            }

        }
        System.out.print(sum);
    }
}

