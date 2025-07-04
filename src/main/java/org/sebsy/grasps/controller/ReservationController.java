package org.sebsy.grasps.controller;

import org.sebsy.grasps.Params;
import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Controlleur qui prend en charge la gestion des réservations client
 */
public class ReservationController {

    private final ReservationFactory reservationFactory;

    public ReservationController(ReservationFactory reservationFactory) {
        this.reservationFactory = reservationFactory;
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
