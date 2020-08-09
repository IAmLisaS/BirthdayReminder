// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146
// Unit 8, Exercise #8
// BirthdayReminder.java

import java.util.Scanner;
public class BirthdayReminder
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int MAX = 10;
      final String QUIT = "ZZZ";
      String[] names = new String[MAX];
      String[] birthdates = new String[MAX];
      String entry;
      String msg;
      String list = "";
      int count = 0, x;
      boolean isFound = false;
      System.out.print("Enter a name: ");
      entry = input.nextLine();
      names[count] = entry;
      while(count < names.length && (!entry.equals(QUIT)) )
      {
         System.out.print("Enter birthdate with slashes between the month, day, and year: ");
         entry = input.nextLine(); 
         birthdates[count] = entry;
         ++count;
         if(count < names.length)
         {
            System.out.print("Enter a name or " + QUIT + " to quit: ");
            entry = input.nextLine();
            names[count] = entry;
         }
      }
      System.out.print("Count of names entered: " + count + "\n");
      for(x = 0; x < count; ++x)
         list += names[x] + "\n";
      System.out.print(list);
      System.out.print("Enter a name to search for: ");
      entry = input.nextLine();
      while(!entry.equals(QUIT))
      {
          isFound = false;
          for(x = 0; x < count; ++x)
             if (entry.equals(names[x]))
             {
                isFound = true;
                System.out.print(names[x] +
                  "'s birthdate is " + birthdates[x]);
             }
          if(!isFound)
            msg = "Sorry, no entry for " + entry + "\n";
          else
            msg = "";
          System.out.print(msg + "\nEnter a name to search for or " + QUIT + " to quit: ");
          entry = input.nextLine();
            
      }
   }
}