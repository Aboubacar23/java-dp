package org.sebsy.grasps.controller;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ReservationFactory {
    private final ClientDao clientDao;
    private final TypeReservationDao typeReservationDao;

    public ReservationFactory(ClientDao clientDao, TypeReservationDao typeReservationDao) {
        this.clientDao = clientDao;
        this.typeReservationDao = typeReservationDao;
    }

    public Reservation createReservation(String clientId, String dateStr, String type, int nbPlaces) {
        LocalDateTime date = parseDate(dateStr);
        Client client = clientDao.extraireClient(clientId);
        TypeReservation typeRe = typeReservationDao.extraireTypeReservation(type);

        double montant = typeRe.getPrixUnitaire() * nbPlaces;
        if (client.isPremium()) {
            montant = montant * (1 - typeRe.getReductionPourcent() / 100);
        }

        Reservation reservation = new Reservation(date, type, nbPlaces, montant);
        client.addReservation(reservation);
        return reservation;
    }

    private LocalDateTime parseDate(String dateStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return LocalDateTime.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            throw new RuntimeException("Format de date invalide : " + dateStr, e);
        }
    }
}
