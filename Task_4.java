// task_4



import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pk = 0;
        int agk = 1;
        int ak = 1;
        int jk = 0;

        System.out.println("Enter your number : ");
        pk = scan.nextInt();



        while(agk != 0 ){

            jk = pk % ak;

            if (jk == 0){System.out.println(ak);}
            else if (ak > pk){break;}

            agk ++;
            ak ++;

        }
        scan.close();
    }
}

