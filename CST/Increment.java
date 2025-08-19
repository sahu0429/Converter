import java.util.*;
public class Increment
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int salary;
        System.out.println("Enter the Salary");
        salary =sc.nextInt();
        float appraisal;
        System.out.println("Enter the Appraisal (1.0 to 5.0)");
        appraisal =sc.nextFloat();
        float increment;
        float new_sal;
        if(salary >0 && appraisal>=1.0 && appraisal<=3.0)
        {
            increment=(salary/100)*10;
            new_sal=salary+increment;
            System.out.println("Incremented salary: "+new_sal);
        }
        else if(salary >0 && appraisal>=3.1 && appraisal<=4.0)
        {
            increment=(salary/100)*25;
            new_sal=salary+increment;
            System.out.println("Incremented salary: "+new_sal);
        }
        else if(salary >0 && appraisal>=4.1 && appraisal<=5.0)
        {
            increment=(salary/100)*30;
            new_sal=salary+increment;
            System.out.println("Incremented salary: "+new_sal);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}