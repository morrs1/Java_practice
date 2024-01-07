package Animals;



public class Omnivorous extends Animal {
    public Omnivorous(String[] parts) {
        this.setName(parts[0]);
        this.setWhatToEat(WhatToEat.OMNIVOROUS);
        this.setNumOfEyes(Integer.parseInt(parts[2]));
        this.setNumOfLegs(Integer.parseInt(parts[3]));
        this.setAnimalFeatures(AnimalFeatures.getFeatures(parts[4]));
        this.setWeight(Integer.parseInt(parts[5]));
    }

    @Override
    public double numOfFood() {
        return this.getWeight() / 10 + 7;
    }

    public String toString() {
        return String.format("Животное: %s, класс животного: %s, кол-во глаз: %d, кол-во ног: %d, особенность: %s, вес: %.0f, кол-во еды: %.0f", getName(),
                getWhatToEat(), this.getNumOfEyes(), this.getNumOfLegs(), this.getAnimalFeatures(), this.getWeight(), this.numOfFood());
    }
}
