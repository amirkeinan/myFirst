import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[4];
        float count=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter number "+(i+1)+":");
            arr[i]=sc.nextInt();
            count+=arr[i];

        }
        System.out.println("the avg" + count/4);
    }


}