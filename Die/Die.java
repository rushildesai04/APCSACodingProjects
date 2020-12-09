//Rushil Desai - Die 
public class Die
{
    //Variables - Private
    private String dieName;
    private String bias;  
    private int outcome;

    //Constructor - Die Initialization
    public Die (String pDieName, String pBias)
    {
        dieName = pDieName;
        bias = pBias;
    }
    //Constructor - Die Throw
    public int throwDie ()
    {
        if (bias.equals("fair"))
        {
            outcome = (int) ((Math.random () * 6) + 1);
        }
        else
        {
            outcome = (int) (Math.random () * 7 +1);
            if (outcome == 7)
            {
                outcome = 6;
            }
        }
    return outcome;
    }

    //Constructor - Return String
    public String toString()
    {
        return "Die " + dieName + " gives a " + outcome;
    }
}