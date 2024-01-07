package Animals;

public class Predator extends Animal {
    public Predator(String[] parts) {
        this.setName(parts[0]);
        this.setWhatToEat(WhatToEat.PREDATOR);
        this.setNumOfEyes(Integer.parseInt(parts[2]));
        this.setNumOfLegs(Integer.parseInt(parts[3]));
        this.setAnimalFeatures(AnimalFeatures.getFeatures(parts[4]));
        this.setWeight(Integer.parseInt(parts[5]));
    }

    @Override
    public double numOfFood() {
        return this.getWeight() / 2 + 5;
    }

    public String toString() {
        return String.format("Животное: %s, класс животного: %s, кол-во глаз: %d, кол-во ног: %d, особенность: %s, вес: %.0f, кол-во еды: %.0f", getName(),
                getWhatToEat(), this.getNumOfEyes(), this.getNumOfLegs(), this.getAnimalFeatures(), this.getWeight(), this.numOfFood());
    }
}
