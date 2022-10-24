package Conditionalstatement;
import java.io.*;
import java.util.*;
class Even_Odd
{
    public static void main (String args[] )
    {
        Scanner in= new Scanner(System.in);
        int n =in.nextInt();
        if ((n%2) ==0)
            System.out.print("0");

        else System.out.print("1");
    }
}
