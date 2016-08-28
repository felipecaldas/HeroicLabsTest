package heroiclab.test.fcaldas.heroiclabstest;

/**
 * Created by fcaldas on 28/08/2016.
 */
public class GameState {
    public int randomNumber;
    public String opponentId;

    public GameState(int a, String b) {
        randomNumber = a;
        opponentId = b;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getOpponentId() {
        return opponentId;
    }

    public void setOpponentId(String opponentId) {
        this.opponentId = opponentId;
    }
}
