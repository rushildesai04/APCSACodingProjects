//Rushil Desai - Die Runner
public class DieRunner {
    public static void main(String[] args) {
        Die fairDie = new Die("fairDie", "fair");
        Die biasDie = new Die("biasDie", "bias");
        int fairCount = 0; 
        int biasCount = 0;
        System.out.println("Fair\tBias"); 

        for (int l = 0; l < 5; l++) {
            for (int i = 0; i < 20; i++) 
            { 
                if (fairDie.throwDie() == 6) 
                { 
                    fairCount++; 
                }
            }   
            for (int i = 0; i < 20; i++) 
            { 
                if (biasDie.throwDie() == 6) 
                { 
                    biasCount++; 
                }
            }
            System.out.println(fairCount + "\t" + biasCount); 
            fairCount = 0;
            biasCount = 0;
        }
    }
}
