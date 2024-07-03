// Task_1_a



public class Task_1_a {
    public static void main(String[] args) {

        int pk = 1;
        int star = 24;
        while(pk > -7) {
            if (star == 24){System.out.println(star);}
            star -= 6;

            if (star == -12) {
                break;
            } else {
                System.out.println(star);;
            }
            pk ++;
        }
    }
}


