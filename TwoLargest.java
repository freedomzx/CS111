import java.util.ArrayList;
public class TwoLargest
{
  public static void main(String[] args)
  {
    System.out.println("Insert a terminating number for the sequence: ");
    double terminator = IO.readDouble();
    double num1;
    double largest = 0;
    double secondLargest = 0;
    ArrayList<Double> numbers = new ArrayList<Double>();
    System.out.println("Insert a sequence of numbers to find the max of: ");
    while(num1 != terminator)
    {
      num1 = IO.readDouble();
      if(num1 != terminator)
      {numbers.add(num1);
        largest = num1;
        secondLargest = num1;}
      else if(num1 == terminator)
      {break;}
    }
    for(Double n : numbers)
    {
      if(n > largest)  {
        largest = n;
      }
    } numbers.remove(largest);
    for(Double n : numbers)
    {
      if(n > secondLargest)
      {
        secondLargest = n;
      }
    }
    IO.outputDoubleAnswer(largest);
    IO.outputDoubleAnswer(secondLargest);
  }
}
