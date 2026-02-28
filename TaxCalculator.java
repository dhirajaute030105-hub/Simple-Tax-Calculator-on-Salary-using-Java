import java.util.Scanner;
class TaxCalculator
{
    public static void main(String args[])
    {
        int tax;
        int ch;
        double FA=0;
        Scanner s1=new Scanner(System.in);

        System.out.print("Enter your Annual Salary::");
        double salary=s1.nextDouble();
        System.out.println("-------- Final Data --------");
        System.out.println(" ");
        if(salary<=400000)
        {
            tax=0;
            FA=salary-(salary*tax);  //FA=Final Amount
            System.out.println("Tax on your Salary is :: "+tax+"%");
            
        }
        else if(salary>400000 && salary<=800000)
        {
            tax=5;
            FA=salary-(salary*tax*0.01);
            System.out.println("Tax on your Salary is :: "+tax+"%");
        }
        else if(salary>800000 && salary<=1200000)
        {
            tax=10;
            FA=salary-(salary*tax*0.01);
            System.out.println("Tax on your Salary is :: "+tax+"%");
        }
        else if(salary>1200000 && salary<=1600000)
        {
            tax=15;
            FA=salary-(salary*tax*0.01);
            System.out.println("Tax on your Salary is :: "+tax+"%");
        }
        else if(salary>1600000 && salary<=2000000)
        {
            tax=20;
            FA=salary-(salary*tax*0.01);
            System.out.println("Tax on your Salary is :: "+tax+"%");
        }
        else if(salary>2000000 && salary<=2400000)
        {
            tax=25;
            FA=salary-(salary*tax*0.01);
            System.out.println("Tax on your Salary is :: "+tax+"%");
        }
        else if(salary>2400000)
        {
            tax=30;
            FA=salary-(salary*tax*0.01);
            System.out.println("Tax on your Salary is :: "+tax+"%");
        }
        else
        {
            System.out.println("Please Enter Valid Salary like Non-Negative && Non-Zero");
        }
        
        System.out.println(" ");
        System.out.println("Your Salary after tax is ::"+FA);
        System.out.println(" ");
        System.out.print("Please press 1 if you want to deposit some amount for Savings neither 0 :: ");
        
        int ch5=s1.nextInt(); //ch=choice

        if(ch5==1)
        {
            System.out.println("Press 1 :: Saving for 2 years of 5% of your Salary");
            System.out.println("Press 2 :: Saving for 5 years of 5% of your Salary");
            System.out.println("Press 3 :: Saving for 10 years of 5% of your Salary");
            System.out.println("Press 4 :: Saving for 15 years of 5% of your Salary");
            System.out.println("Press 5 :: Saving for 20 years of 5% of Your Salary");
            System.out.print("Enter Your Choice ::");
            int ch1=s1.nextInt();

            switch(ch1)
            {
                case 1:
                {
                    System.out.println("Thank you for Choicing Our Plan");
                    double Saving=(FA*5*2)/100.0;
                    double SA=Saving+(Saving*0.07);
                    System.out.println("Your Saving Amount after 2 years with 7% return is ::"+SA);
                    break;
                    
                }
                case 2:
                    {
                        System.out.println("Thank you for Choicing Our Plan");
                        double Saving=(FA*5*5)/100.0;
                        double SA=Saving+(Saving*0.07);
                        System.out.println("Your Saving Amount after 5 years with 7% return is ::"+SA);
                        break;
                    }
                case 3:
                    {

                        System.out.println("Thank you for Choicing Our Plan");
                        double Saving=(FA*5*10)/100.0;
                        double SA=Saving+(Saving*0.07);
                        System.out.println("Your Saving Amount after 10 years with 7% return is ::"+SA);
                        break;
                    }
                case 4:
                    {
                        System.out.println("Thank you for Choicing Our Plan");
                        double Saving=(FA*5*15)/100.0;
                        double SA=Saving+(Saving*0.07);
                        System.out.println("Your Saving Amount after 15 years with 7% return is ::"+SA);
                        break;
                    }
                case 5:
                    {
                        System.out.println("Thank you for Choicing Our Plan");
                        double Saving=(FA*5*20)/100.0;
                        double SA=Saving+(Saving*0.07);
                        System.out.println("Your Saving Amount after 20 years with 7% return is ::"+SA);
                        break;
                    }
            }
            

        }
        else
        {
            System.out.println(".....Thank You.....");
        }
        
    }
}
