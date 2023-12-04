package datatypes;

public class Task04_12 {
    public static void main(String[] args) {


        //Example 1 (m)
        if (20 < 18) {
            System.out.println("20 is greater than 18");
        }

        // Example 2 (m)
        int x = 20;
        int y = 18;
        if (x < y) {
            System.out.println("x is greater than y");
        }

        // Example 2 (m)
        if (true)
        System.out.println(true);

        // Example 3
        int time = 20;
        if (time < 18)
            System.out.println("Good day.");
         else
            System.out.println("Good evening.");


        // Example 4
        time = 7;
        if (time > 5 && time < 12)
            System.out.println("Good morning.");
        else if (time < 18)
            System.out.println("Good afternoon.");
        else
            System.out.println("Good evening.");

        // Example 5
        int number = 10;
        if (number < 0)
            System.out.println("The number is negative.");

        System.out.println("Statement outside if block");
      // Example 6
        number = 10;
        if (number > 0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is not positive.");
        System.out.println("Statement is not inside if...else block");

        //Example 7
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            }
            else {
                largest = n3;
            }
        } else {
            if (n2 >= n3) {
                largest = n2;
            }
            else {
                largest = n3;
            }
        }
        System.out.println("Largest Number: " + largest);

       // Example 8
        String str = " itstep.by ";
        int i = 5;
        if (i == 4)
            i++;
        System.out.println(str);
        System.out.println("i = " + i);

       // Example 9 (m)
        number=13;
        if(number%2==0)
            System.out.println("even number");
        else
            System.out.println("odd number");

        //Example 10
        int year=2020;
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }

        for ( int year2: new int[]{3,4,100,400})
            if(((year % 4 ==0) && (year2 % 100 !=0)) || (year2 % 400==0))
                System.out.println(year2+ " LEAP YEAR");
            else
                System.out.println(year2+" COMMON YEAR");

   // Example 11
     number=13;
    String output=(number%2==0)?"even number":"odd number";
    System.out.println(output);

   // Example 12
    int marks=65;
    if(marks<50){
        System.out.println("fail");
    }
    else if(marks>=50 && marks<60){
        System.out.println("D grade");
    }
    else if(marks>=60 && marks<70){
        System.out.println("C grade");
    }
    else if(marks>=70 && marks<80){
        System.out.println("B grade");
    }
    else if(marks>=80 && marks<90){
        System.out.println("A grade");
    }else if(marks>=90 && marks<100){
        System.out.println("A+ grade");
    }else{
        System.out.println("Invalid!");

       // Example 13
        int age=20;
        int weight=80;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }

        //Example 14
         age=25;
         weight=48;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }

        //Example 15
        if (2 * 2 == 5)
            System.out.println("Дважды два равно пяти!");

                   // Example 16
        number = 2;
        if(number % 2 != 0)
            System.out.println(++number);

        //Example 17
        int month = 3; // март
        String season; // время года
        if(month == 1 || month == 2 || month == 12)
            season = "Зимушка-зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Вы с какой планеты?";
        System.out.println(season);

      //  Example 18
         number=20;
        switch(number){
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            default:System.out.println("Not in 10, 20 or 30");
        }

       // Example 19
         month=7;
        String monthString="";
        switch(month){
            case 1: monthString="1 - January";
                break;
            case 2: monthString="2 - February";
                break;
            case 3: monthString="3 - March";
                break;
            case 4: monthString="4 - April";
                break;
            case 5: monthString="5 - May";
                break;
            case 6: monthString="6 - June";
                break;
            case 7: monthString="7 - July";
                break;
            case 8: monthString="8 - August";
                break;
            case 9: monthString="9 - September";
                break;
            case 10: monthString="10 - October";
                break;
            case 11: monthString="11 - November";
                break;
            case 12: monthString="12 - December";
                break;
            default:System.out.println("Invalid Month!");
        }
        System.out.println(monthString);

      //  Example 20
        String levelString="Expert";
        int level=0;
        switch(levelString){
            case "Beginner": level=1;
                break;
            case "Intermediate": level=2;
                break;
            case "Expert": level=3;
                break;
            default: level=0;
                break;
        }
        System.out.println("Your Level is: "+level);

       // Example 21
        char branch = 'C';
        int collegeYear = 4;
        switch( collegeYear ){
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}
}