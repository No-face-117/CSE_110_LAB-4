// Task_1_b



public class Task_1_b {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int pk = 1;
        int star = -10;
        while(pk < 21) {
            if (star == -10){System.out.println(star);}
            star += 5;

            if (star == 30) {
                break;
            } else {
                System.out.println(star);;
            }
            pk ++;
        }
    }
}

