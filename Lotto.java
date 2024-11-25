import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto
{
    private int roundsToPlay;

    public Lotto()
    {
        roundsToPlay = 6;
    }

    public Lotto(int rounds)
    {
        roundsToPlay = rounds;
    }

    public void playLotto()
    {
        Set<Integer> result = new HashSet<>();
        Random random = new Random();
        while(result.size() < roundsToPlay){
            int randomNumber = random.nextInt(49) + 1;  // Generate a number between 1 and 49
            result.add(randomNumber);
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto(6);
        lotto.playLotto();

    }
}
