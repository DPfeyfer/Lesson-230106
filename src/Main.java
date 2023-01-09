public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");
        double deposit = 15000;
        double totalDeposit = 0;
        int totalMonth = 0;
        while (totalDeposit < 2459000){ //why 2460000
            totalDeposit = totalDeposit + deposit;
            totalMonth ++;
            System.out.println("we need " + totalMonth + " month for " + totalDeposit + " $");
        }
        System.out.println();
        System.out.println("we need " + totalMonth + " month for " + totalDeposit + " $");
        System.out.println();


        //task 2
       System.out.println("Task 2");
       int a = 1;
       for (; a < 11; a++) {
            System.out.print(a + " ");
       }
       System.out.println();
       while (a > 1){
           a --;
           System.out.print(a + " ");
       }
       System.out.println();
       System.out.println();// why we have not space?


        //task 2.1
        System.out.println("task 2.1");
        int b = 0;
        while (b < 10){
            b ++;
            System.out.print(b + " ");
        }
        System.out.println();
        for (; b > 0 ; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println();


        //task 3
        System.out.println("Task 3");
        int numberOfPersons = 12_000_000;
        int growthOfPersons = (numberOfPersons / 1000) * 9;
        for (int year = 1; year < 11; year++) {
            numberOfPersons = numberOfPersons + growthOfPersons;
            System.out.println(year + " year the number of persons is " + numberOfPersons);
        }
        System.out.println();


        //task 4
        System.out.println("Task 4");
        System.out.println();


        //task 5
        System.out.println("Task 5");
        System.out.println();


        //task 6
        System.out.println("Task 6");
        System.out.println();


        //task 7
        System.out.println("Task 7");
        System.out.println();


        //task 8
        System.out.println("Task 8");
        System.out.println();
    }
}