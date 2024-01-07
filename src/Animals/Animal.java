package Animals;

public abstract class Animal {
    private int numOfLegs, numOfEyes;
    private AnimalFeatures animalFeatures;
    private boolean eatAnimals;
    private double weight;
    private String name;

    private WhatToEat whatToEat;

    public abstract double numOfFood();

    public boolean isEatAnimals() {
        return eatAnimals;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public int getNumOfEyes() {
        return numOfEyes;
    }

    public AnimalFeatures getAnimalFeatures() {
        return animalFeatures;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    public void setAnimalFeatures(AnimalFeatures animalFeatures) {
        this.animalFeatures = animalFeatures;
    }

    public void setEatAnimals(boolean eatAnimals) {
        this.eatAnimals = eatAnimals;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatToEat getWhatToEat() {
        return whatToEat;
    }

    public void setWhatToEat(WhatToEat whatToEat) {
        this.whatToEat = whatToEat;
    }
}
