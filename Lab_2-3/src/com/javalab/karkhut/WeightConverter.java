package com.javalab.karkhut;

class WeightConverter {
    private double weightInKilograms;
    private double weightInPounds;
    private final double MULTIPLIER_POUNDS_TO_KILOGRAMS;

    WeightConverter(double weightInPounds) {
        this.weightInPounds = weightInPounds;
        this.weightInKilograms = 0;
        this.MULTIPLIER_POUNDS_TO_KILOGRAMS = 2.20462262;
    }

    void convertIntoKilograms() {

        weightInKilograms = weightInPounds / MULTIPLIER_POUNDS_TO_KILOGRAMS;

        System.out.println("Your weight is: " + ((int) weightInKilograms) + " kilograms and " + ((weightInKilograms - (int) weightInKilograms) * (1000)) + " grams");

    }

}
