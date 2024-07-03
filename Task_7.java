// Task_7



import java.util.Scanner;


public class Task_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();

        int pk = 0;
        int agk = 0;
        int ak = 0;
        int jk = 0;
        int now = 10;

        while(pk != now){

            System.out.println();
            System.out.println("Enter Number: ");
            jk = scan.nextInt();

            System.out.println();
            
            ak += jk;

            System.out.println("Sum = " + ak);
            
            pk ++;
        }

       

    }
}

