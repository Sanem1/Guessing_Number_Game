import java.util.*;

public class Guessing
{
public static void main (String[] args)
{
final int MAX = 10;
int answer, guess, payment = 0;
Scanner scan = new Scanner (System.in);
Random generator = new Random();
for(int a=0; a<5; a++)
{
answer = generator.nextInt(MAX) + 1;
System.out.print ("I'm thinking of a number between 1 and "
+ MAX + ". Guess what it is: ");
guess = scan.nextInt();
if (guess == answer )
{
payment= 9+payment;
System.out.println ("You got it! Good guessing! You earn 9 liras! - Total is:" + payment);
System.out.println ("The number was " + answer);
}
else
{
payment= payment - 1;
System.out.println ("That is not correct, sorry. You lost 1 lira... - Total is:" + payment );
System.out.println ("The number was " + answer);
}
}
}
}