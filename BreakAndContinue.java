public class BreakAndContinue {
    public static void main(String[] args) {
        // for (int i = 0; i <=10; i++) {
        //     if (i % 2 == 0) {
        //          continue;
        //     }
        //     System.out.println(i);
        // }


        for (int i = 9; i > 0; i--) {
            if (i % 2 == 0) {
                continue;
            } else if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        // ?? Why i = 3 was skipped finally?
 
        //     int number = 0;
        //     while (true) {
        //     number++;
        //     if (number > 5) {
        //         break;
        //     }
        // }
        //System.out.println(number);   
}
}
