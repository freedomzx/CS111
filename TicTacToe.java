public class TicTacToe
{
  public static void main(String[] args)
  {
    //counter variable to represent whose player turn it is
    int counterVariable = 0;
    //code to represent spaces
    int tl = 0; int tm = 0; int tr = 0; //top row
    int ml = 0; int am = 0; int mr = 0; //middle row
    int bl = 0; int bm = 0; int br = 0; //bottom row
    System.out.println("Let's play a game of Tic Tac Toe!");
    System.out.println("In order to choose a space, pick numbers baesd on their position in a numberpad.");
    System.out.println("These means 1 is top left, 2 is top middle, 3 is top right,");
    System.out.println("4 is middle left, 5 is absolute center, 6 is middle right,");
    System.out.println("7 is bottom left, 8 is bottom middle, and 9 is middle right.");
    while(tl + tm + tr != 3 &&
    ml + am + mr != 3 &&
    bl + bm + br != 3 &&
    tl + ml + bl != 3 &&
    tm + am + bm != 3 &&
    tr + mr + br != 3 &&
    tl + am + br != 3 &&
    bl + am + tr != 3 &&
    //player 2
    tl + tm + tr != 30 &&
    ml + am + mr != 30 &&
    bl + bm + br != 30 &&
    tl + ml + bl != 30 &&
    tm + am + bm != 30 &&
    tr + mr + br != 30 &&
    tl + am + br != 30 &&
    bl + am + tr != 30)
    {while(
    counterVariable % 2 != 0)
    {
      System.out.println("Player 2's Turn!");
      System.out.print("Choose your space (valid input: spaces 1-9)");
      int pick = IO.readInt();
      if(pick == 1)
      {
        if(tl == 1 || tl == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          tl = 1;
        }
      }
      else if(pick == 2)
      {
        if(tm == 1 || tm == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          tm = 1;
        }
      }
      else if(pick == 3)
      {
        if(tr == 1 || tr == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          tr = 1;
        }
      }
      else if(pick == 4)
      {
        if(ml == 1 || ml == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          ml = 1;
        }
      }
      else if(pick == 5)
      {
        if(am == 1 || am == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          am = 1;
        }
      }
      else if(pick == 6)
      {
        if(mr == 1 || mr == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          mr = 1;
        }
      }
      else if(pick == 7)
      {
        if(bl == 1 || bl == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          bl = 1;
        }
      }
      else if(pick == 8)
      {
        if(bm == 1 || bm == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          bm = 1;
        }
      }
      else if
      (pick == 9)
      {
        if(br == 1 || br == 10)
        {
          System.out.println("That space is already taken.");
        }
        else
        {
          br = 1;
        }
      }
      counterVariable++;}
      while(
      counterVariable % 2 == 0)
      {
        System.out.println("Player 1's Turn!");
        System.out.print("Choose your space (valid input: spaces 1-9)");
        int pick = IO.readInt();
        if(pick == 1)
        {
          if(tl == 1 || tl == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            tl = 10;
          }
        }
        else if(pick == 10)
        {
          if(tm == 1 || tm == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            tm = 10;
          }
        }
        else if(pick == 3)
        {
          if(tr == 1 || tr == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            tr = 10;
          }
        }
        else if(pick == 4)
        {
          if(ml == 1 || ml == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            ml = 10;
          }
        }
        else if(pick == 5)
        {
          if(am == 1 || am == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            am = 10;
          }
        }
        else if(pick == 6)
        {
          if(mr == 1 || mr == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            mr = 10;
          }
        }
        else if(pick == 7)
        {
          if(bl == 1 || bl == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            bl = 10;
          }
        }
        else if(pick == 8)
        {
          if(bm == 1 || bm == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            bm = 10;
          }
        }
        else if
        (pick == 9)
        {
          if(br == 1 || br == 10)
          {
            System.out.println("That space is already taken.");
          }
          else
          {
            br = 10;
          }
        }
        counterVariable++;}
    }

    if(tl + tm + tr == 3 ||
    ml + am + mr == 3 ||
    bl + bm + br == 3 ||
    tl + ml + bl == 3 ||
    tm + am + bm == 3 ||
    tr + mr + br == 3 ||
    tl + am + br == 3 ||
    bl + am + tr == 3 ||
    tl + tm + tr == 30 ||
    ml + am + mr == 30 ||
    bl + bm + br == 30 ||
    tl + ml + bl == 30 ||
    tm + am + bm == 30 ||
    tr + mr + br == 30 ||
    tl + am + br == 30 ||
    bl + am + tr == 30)
    {
      System.out.println("TIC TAC TOE NYAGGA");
    }
  }
}
