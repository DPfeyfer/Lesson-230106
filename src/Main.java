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


        //task 3.1
        System.out.println("Task 3.1");
        int numberOfPersons1 = 12_000_000;
        int year = 0;
        while (year < 10){
            year ++;
            numberOfPersons1 = numberOfPersons1 + growthOfPersons;
            System.out.println(year + " year the number of persons is " + numberOfPersons1);
        }
        System.out.println();


        //task 4
        System.out.println("Task 4");
        double deposit1 = 15000;
        double percent = 7;
        int month = 0;
        while (deposit1 < 12_000_000){
            deposit1 = deposit1 + (deposit1 * percent) / 100;
            month ++;
            System.out.println("The month " + month + " deposit will be " + String.format("%.2f",deposit1));
        }

        System.out.println();


        //task 5
        System.out.println("Task 5");
        double deposit2 = 15000;
        double percent2 = 7;
        int month2 = 0;
        while (deposit2 < 12_000_000){
            deposit2 = deposit2 + (deposit2 * percent2) / 100;
            month2 ++;
            if(month2 % 6 == 0){
                System.out.println("The month " + month2 + " deposit will be " + String.format("%.2f",deposit2));
            }
        }
        System.out.println();


        //task 6
        System.out.println("Task 6");
        double deposit3 = 15000;
        double percent3 = 7;
        int month3 = 0;
        while (month3 < 108){
            deposit3 = deposit3 + (deposit3 * percent3) / 100;
            month3 ++;
            if(month3 % 6 == 0){
                System.out.println("The month " + month3 + " deposit will be " + String.format("%.2f",deposit3));
            }
        }
        System.out.println();


        //task 7
        System.out.println("Task 7");
        int firstFriday = 6;
        for (; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Today " + firstFriday + "th friday. You need to do report!" );
        }
        System.out.println();


        //task 8
        System.out.println("Task 8");
        System.out.println();
    }
}