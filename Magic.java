//Magic Square Creator
//Made by Rushil Desai 

public class Magic
{
    public static int[][] Magic(int sides)
    {
        //Variable Initialization
        int[][] arr = new int[sides][sides];
        int boxes = sides * sides;
        int a = 0;
        int b = sides / 2;

        //Assigning values to Array
        arr[a][b] = 1;
        for (int e = 2; e < boxes + 1; e++)
        {
            if (e % sides == 1)
            {
                a++;
            }
            else
            {
                a--;
                b++;
            }

            if (a < 0)
            {
                a = sides - 1;
            }
            else if (b < 0)
            {
                b = sides - 1;
            }
            else if (a > sides - 1)
            {
                a = 0;
            }
            else if (b > sides - 1)
            {
                b = 0;
            }
            arr[a][b] = e;
        }

        return arr;
    }
    public static void main(String[] args)
    {
        //Initializing the objects for 5x5 and 11x11 Arrays
        int[][] five = Magic(5);
        int[][] eleven = Magic(11);
        
        //Outputting 5x5 Array
        for (int[] c : five)
        {
            for (int d : c)
            {
                System.out.print(d + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //Outputting 11x11 Array
        for (int[] c : eleven)
        {
            for (int d : c)
            {
                System.out.print(d + " ");
            }
            System.out.println();
        }
        
    }
}

