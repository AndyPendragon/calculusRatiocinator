package com.andyPendragon.calculusRatiocinator;

public enum Conjonction {
    et,
    ou,
    donc;

    public static Affirmation et(Affirmation affirmation1, Affirmation affirmation2){
        if ((affirmation1 == Affirmation.vrai) && affirmation2 == Affirmation.vrai){
            return Affirmation.vrai;
        }
        else return Affirmation.faux;
    }

    public static Affirmation ou(Affirmation affirmation1, Affirmation affirmation2){
        if ((affirmation1 == Affirmation.vrai) || affirmation2 == Affirmation.vrai) {
            return Affirmation.vrai;
        }
        else return Affirmation.faux;
    }

    public static Affirmation donc(Affirmation affirmation1, Affirmation affirmation2){
        if ((affirmation1 == Affirmation.vrai) && affirmation2 == Affirmation.faux) {
            return Affirmation.faux;
        }
        else return Affirmation.vrai;
        }
}