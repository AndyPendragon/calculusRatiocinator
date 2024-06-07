package com.andyPendragon.calculusRatiocinator;

import lombok.Getter;

@Getter
public class Composition {
    private Affirmation reponse;

    public Composition(Affirmation affirmation1, Conjonction conjonction, Affirmation affirmation2) {
        switch (conjonction){
            case et :
                this.reponse = Conjonction.et(affirmation1, affirmation2);
            case ou :
                this.reponse = Conjonction.ou(affirmation1, affirmation2);
            case donc :
                this.reponse = Conjonction.donc(affirmation1, affirmation2);
        }
    }

    public Composition(Composition composition1, Conjonction conjonction, Affirmation affirmation2) {
        switch (conjonction){
            case et :
                reponse = Conjonction.et(composition1.reponse, affirmation2);
            case ou :
                reponse = Conjonction.ou(composition1.reponse, affirmation2);
            case donc :
                reponse = Conjonction.donc(composition1.reponse, affirmation2);
        }
    }

    public Composition(Affirmation affirmation1, Conjonction conjonction, Composition composition2) {
        switch (conjonction){
            case et :
                this.reponse = Conjonction.et(affirmation1, composition2.reponse);
            case ou :
                this.reponse = Conjonction.ou(affirmation1, composition2.reponse);
            case donc :
                this.reponse = Conjonction.donc(affirmation1, composition2.reponse);
        }
    }
}