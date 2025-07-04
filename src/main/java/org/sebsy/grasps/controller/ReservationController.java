package org.sebsy.grasps.controller;

import org.sebsy.grasps.Params;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;

public class ReservationController {

    private final ReservationFactory reservationFactory;

    public ReservationController() {
        this.reservationFactory = new ReservationFactory(new ClientDao(), new TypeReservationDao());
    }

    public Reservation handle(Params params) {
        return reservationFactory.createReservation(
                params.getIdentifiantClient(),
                params.getDateReservation(),
                params.getTypeReservation(),
                params.getNbPlaces()
        );
    }
}
