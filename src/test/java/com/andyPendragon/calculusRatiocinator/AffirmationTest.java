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
}
