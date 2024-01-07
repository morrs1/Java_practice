import java.util.Arrays;
import java.util.List;

public class Monster {
    private int numOfEyes, numOfArms, NumLegs;

    public Monster() {
        this(2);
    }

    public Monster(int quantity) {
        this(quantity, quantity, quantity);
    }

    public Monster(int quantityE, int quantityA, int quantityL) {
        this.NumLegs = quantityL;
        this.numOfEyes = quantityE;
        this.numOfArms = quantityA;
    }

    public void voice() {
        this.voice(1);
    }

    public void voice(int quan) {
        this.voice(quan, "Grrrr");
    }

    public void voice(int quan, String sound) {
        for (int i = 0; i < quan; i++) {
            System.out.println(sound);
        }
    }

    public Monster deepCopy() {
        return new Monster(this.NumLegs, this.numOfArms, this.numOfEyes);
    }

    @Override
    public String toString() {
        return String.format("Ноги: %d, руки: %d, глаза: %d", NumLegs, numOfArms, numOfEyes);
    }

    public int getNumOfEyes() {
        return numOfEyes;
    }

    public int getNumOfArms() {
        return numOfArms;
    }

    public int getNumLegs() {
        return NumLegs;
    }

    public void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    public void setNumOfArms(int numOfArms) {
        this.numOfArms = numOfArms;
    }

    public void setNumLegs(int numLegs) {
        NumLegs = numLegs;
    }

    public static void extend(List<Integer> list, Integer...integers){
        Arrays.stream(integers).forEach(list::add); //нам поебать нахуй
    }
}

/*
 *
 *
 *
 *
 *
 * */