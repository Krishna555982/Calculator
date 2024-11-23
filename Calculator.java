import java.util.Scanner;
class Calculator 
	{
    public static void main(String[] args) 
		{
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;
        boolean continueCalculation = true;

        while (continueCalculation) 
			{
				System.out.println("Enter your first number:-");
				num1 = scanner.nextDouble();
				System.out.println("Enter your operator");
				char op = scanner.next().charAt(0);
				System.out.println("Enter yiur second number");
				num2 = scanner.nextDouble();
				
				if ( op == '+')
				{
					System.out.println("Result:- " + (num1+num2));
				}
				else if (op =='-')
				{
					System.out.println("Result:- " + (num1-num2));
				}
				else if ( op == '*')
				{
					System.out.println("Result:- " + (num1*num2));
				}
				else if ( op == '/')
				{
					if (num2 != 0)
					{
						System.out.println("Result:- " + (num1/num2));
					}
					else
					{
						System.out.println("Error: Division by zero!");
					}
				}
				else
				{
					System.out.println("Error: Invalid operator!");
				}
				System.out.println("Do you want to perform another calculation? (yes/no)");
				String rep = scanner.next();
				continueCalculation = rep.equalsIgnoreCase("yes");
			}
				System.out.println("Calculator exited.");
				scanner.close();
		}
	}