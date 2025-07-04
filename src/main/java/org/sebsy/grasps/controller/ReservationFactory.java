package org.sebsy.grasps.controller;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReservationFactory {
    private final ClientDao clientDao;
    private TypeReservationDao typeReservationDao;

    public ReservationFactory(ClientDao clientDao, TypeReservationDao typeReservationDao) {
        this.clientDao = clientDao;
        this.typeReservationDao = typeReservationDao;
    }

    public Reservation createReservation(String clientId, String dateStr, String type, int nbPlaces) {
        LocalDateTime date = LocalDateTime.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        Client client = clientDao.extraireClient(clientId);
        TypeReservationDao typeRe = typeReservationDao.extraireTypeReservation(type);

        double montant = typeRe.getPrixUnitaire() * nbPlaces;
        if (client.isPremium()) {
            montant = montant * (1 - typeRe.getReductionPourcent());
        }

        Reservation reservation = new Reservation(date, type, nbPlaces, montant);
        client.addReservation(reservation);
        return reservation;
    }
}
