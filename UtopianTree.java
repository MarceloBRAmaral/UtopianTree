import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {

        int h=0;

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();//enter the number of test cases
        int n[] = new int[t];//provision for the number of cycles of each test case

        for(int i=0;i<t;i++) {//enter the number of cycles for each test case
            n[i] = input.nextInt();
        }

        for(int k=0;k<t;k++){//run the logic for all test cases; "k" is the test case number

            for(int j=0;j<=n[k];j++){//run the logic for each test case; "j" is the cycle count number

                if(j==0){h=1;//initial height is 1m
                }else{
                    if(j%2==0){//if j is even
                        h++;
                    }else{h*=2;}//if j is odd
                }
            }
            System.out.println(h);
        }

    }
}