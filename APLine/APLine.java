public class APLine
{
    private int a;
    private int b;
    private int c;

    APLine()
    {
        a = 1;
        b = 1;
        c = 0;
    }

    APLine(int one, int two, int three)
    {
        if (one != 0)
        {
            a = one;
        }
        else
        {
            a = 1;
        }
        if (two != 0)
        {
            b = two;
        }
        else
        {
            b = 1;
        }
        c = three;
    }

    double getSlope()
    {
        double doubleA = a;
        double doubleB = b;
        double slope = (doubleA * -1) / doubleB;
        return slope;
    }

    Boolean isOnLine(int x, int y)
    {
        if ((a*x) + (b*y) + c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}