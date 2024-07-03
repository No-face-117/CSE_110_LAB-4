// Task_10



import java.util.Scanner;


public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number : ");
        int now = scan.nextInt();

        System.out.println();

        int pk = 1;
        int pkk = 1;
        int agk = 10;
        int agkk = 10;
        int ak = 0;
        int akk = 0;
        int jk = 1;
        int kkk =0;

        while(pk != 0){
            
            ak = now / agk;

            if (ak != 0) {
                agk *= 10;
            }else{break;}


           jk ++;
           pk ++;

        }

        while (pkk != 0) {

            if (agk == 0) {
                break;
            }
            else{
                agk /= 10;
                if (agk != 0) {
                    kkk = now / agk;
                System.out.print(kkk + ",");
                now %= agk;
                }
                
            }

        }
        scan.close();
    }
   
}

