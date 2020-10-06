import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Test
{
    public static void main(String args[])
    {
        double grade1 = 91.14;
        double grade2 = 85.01;
        double grade3 = 72;
        double grade4 = 63;
        double grade5 = 81.14;
        System.out.print("value of grade1 : "+grade1+'\n');

        System.out.print("value of grade2 : "+grade2+'\n');
        System.out.print("value of grade3 : "+grade3+'\n');
        System.out.print("value of grade4 : "+grade4+'\n');
        System.out.print("value of grade5 : "+grade5+'\n');

        List<Double> list = Arrays.asList(grade1,grade2,grade3,grade4,grade5);
        double sum = 0;
        Iterator<Double> iter = list.iterator();
        while (iter.hasNext())
        {
            sum+=iter.next();
        }
        double average = sum/list.size();
        System.out.println("\n");
        System.out.print("The average of those grades : "+ average);
        System.out.println("\n");

        // if statement
        String output;
        System.out.println("Using if statement");
        if (average>90)
        {
            output = "A: Fantastic job!";
            System.out.print(output);
        }else if(average>80)
        {
            output = "B: Good!";
            System.out.print(output);
        }else if(average>70)
        {
            output = "C: Please try more next time!";
            System.out.print(output);
        }else
        {
            output = "F: Unfortunately you failed!";
            System.out.print(output);
        }
        System.out.println("\n");
        // case statement
        System.out.print("Using case statement");
        System.out.println("\n");
   
        char grade = output.charAt(0);

        switch(grade)
        {
            case 'A':System.out.print(grade+" :Fantastic job!");
            break;
            case 'B':System.out.print(grade+" :Good!");
            break;
            case 'C':System.out.print(grade+" :Please try more next time!");
            break;
            case 'F':System.out.print(grade+" :Unfortunately you failed!");
            break;
            default: System.out.print("Invalid grade");
            
        }
        System.out.println("\n");
        System.out.println("Your grade is :"+grade);

    }
}