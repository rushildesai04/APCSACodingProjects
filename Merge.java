//Made by Rushil Desai

import java.util.Scanner;
import java.util.ArrayList;

public class Merge
{
    public static void main(String[] args)
    {
        //Initialization
        Scanner rush = new Scanner(System.in);
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Integer> listTwo = new ArrayList<Integer>();

        //List One 
        int i = 0;
        System.out.println("Enter the values for the first array, up to 10 values. (Enter a negative number to quit.)");
        while (i < 10)
        {
            int a = rush.nextInt();
            if (a < 0)
            {
                break;
            }
            else if (i == 0)
            {
                i++;
                listOne.add(a);
            }
            else if (listOne.get(listOne.size() - 1) <= a)
            {
                i++;
                listOne.add(a);
            }
            else
            {
                System.out.println("ERROR: Array not in correct order");
                break;
            }
        }

        //List Two 
        int j = 0;
        System.out.println("Enter the values for the second array, up to 10 values. (Enter a negative number to quit.)");
        while (j < 10)
        {
            int a = rush.nextInt();
            if (a < 0)
            {
                break;
            }
            else if (j == 0)
            {
                j++;
                listTwo.add(a);
            }
            else if (listTwo.get(listTwo.size() - 1) <= a)
            {
                j++;
                listTwo.add(a);
            }
            else
            {
                System.out.println("ERROR: Array not in correct order");
                break;
            }
        }

        //Main List
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int g = 0; g < listOne.size(); g++)
        {
            list.add(listOne.get(g));
        }
        for (int k = 0; k < listTwo.size(); k++)
        {
            list.add(listTwo.get(k));
        }

        //Sorting
        for (int m = 0; m < list.size()-1; m++)
        {
            for (int n = m + 1; n < list.size(); n++)
            {
                if (list.get(m) > list.get(n))
                {
                    int temp = list.get(m);
                    list.set(m, list.get(n));
                    list.set(n, temp);
                }
            }
        }

        //Output
        System.out.println("First Array: " + listOne);
        System.out.println("Second Array: " + listTwo);
        System.out.println("Merged Array: " + list);
    }
}

