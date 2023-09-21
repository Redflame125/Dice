public class Dice {

    public Dice() {
        numberOfEyes = 0;
    }
    private int numberOfEyes;

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void roll() {
        numberOfEyes = (int) (Math.random() * 6 + 1);
    }
}
