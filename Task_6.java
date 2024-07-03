// Task_6



import java.util.Scanner;


public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of terms : ");
        int now = scan.nextInt();

        System.out.println();

        int pk = 0;
        int agk = 0;
        int ak = 1;
        int jk = 0;

        jk = (int)Math.pow(now , 2);

        while(pk != now){
            
            if (ak == 1) {
                System.out.println(ak);
            }else{ System.out.println(ak);}

            ak += 2;
            pk ++;
        }

       
        System.out.println("The Sum of odd Natural Numbers up to " +now+ " terms is: " + jk);

    }
}

