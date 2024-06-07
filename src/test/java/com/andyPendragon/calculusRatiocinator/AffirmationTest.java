package com.andyPendragon.calculusRatiocinator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.andyPendragon.calculusRatiocinator.Affirmation.*;
import static com.andyPendragon.calculusRatiocinator.Conjonction.*;

class AffirmationTest {

    @Test
    void lou_est_pauvre_et_lou_est_genereux() {
        Affirmation lou_est_pauvre = faux;
        Composition lou_est_genereux = new Composition(vrai,ou,faux);

        Composition lou_est_pauvre_et_lou_est_genereux = new Composition(lou_est_pauvre, et, lou_est_genereux);

        Assertions.assertEquals(vrai, lou_est_pauvre_et_lou_est_genereux.getReponse());
    }

    @Test
    void lou_est_beau_donc_lou_est_pauvre() {
        Affirmation lou_est_beau = vrai;
        Affirmation lou_est_pauvre = faux;

        Composition lou_est_beau_donc_lou_est_pauvre = new Composition(lou_est_beau, donc, lou_est_pauvre);

        Assertions.assertEquals(faux, lou_est_beau_donc_lou_est_pauvre.getReponse());
    }

    @Test
    void lou_est_pauvre_donc_lou_est_genereux() {
        Affirmation lou_est_pauvre = faux;
        Composition lou_est_genereux = new Composition(vrai,ou,faux);

        Composition lou_est_pauvre_donc_lou_est_genereux = new Composition(lou_est_pauvre, donc, lou_est_genereux.getReponse());

        Assertions.assertEquals(faux, lou_est_pauvre_donc_lou_est_genereux.getReponse());
    }

    @Test
    void lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre() {
        Affirmation lou_est_beau = vrai;
        Composition lou_est_genereux = new Composition(vrai, ou, faux);
        Affirmation lou_est_pauvre = faux;

        Composition lou_est_beau_ou_lou_est_genereux = new Composition(lou_est_beau, ou, lou_est_genereux);
        Assertions.assertEquals(vrai, lou_est_beau_ou_lou_est_genereux.getReponse());

        Composition lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre = new Composition(lou_est_beau_ou_lou_est_genereux, donc, lou_est_pauvre);
        Assertions.assertEquals(faux, lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre.getReponse());
    }

    @Test
    void lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre_et_lou_est_pauvre_ou_lou_est_genereux() {
        Affirmation lou_est_beau = vrai;
        Composition lou_est_genereux = new Composition(vrai, ou, faux);
        Affirmation lou_est_pauvre = faux;

        Composition lou_est_beau_ou_lou_est_genereux = new Composition(lou_est_beau, ou, lou_est_genereux.getReponse());
        Composition lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre = new Composition(lou_est_beau_ou_lou_est_genereux.getReponse(), donc, lou_est_pauvre);
        Assertions.assertEquals(vrai, lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre.getReponse());

        Composition lou_est_pauvre_ou_lou_est_genereux = new Composition(lou_est_pauvre, ou, lou_est_genereux.getReponse());
        Composition lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre_et_lou_est_pauvre_ou_lou_est_genereux = new Composition(lou_est_beau_ou_lou_est_genereux.getReponse(), donc, lou_est_pauvre_ou_lou_est_genereux.getReponse())
        Assertions.assertEquals(faux, lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre_et_lou_est_pauvre_ou_lou_est_genereux.getReponse());
    }
}
