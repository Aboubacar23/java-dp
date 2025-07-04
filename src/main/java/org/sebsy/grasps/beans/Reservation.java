package org.sebsy.grasps.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    private Long id;

    private LocalDateTime date;

    private int nbPlaces;

    private double total;

    private double montant;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;

    public Reservation() {

    }

    public Reservation(LocalDateTime date, int nbPlaces, double total, Client client, double montant) {
        this.date = date;
        this.nbPlaces = nbPlaces;
        this.total = total;
        this.client = client;
        this.montant = montant;
    }

    public Reservation(LocalDateTime date, int nbPlaces, double total) {
        this.date = date;
        this.nbPlaces = nbPlaces;
        this.total = total;
    }

    public Reservation(LocalDateTime date) {
        super();
        this.date = date;
    }

    public Reservation(LocalDateTime date, String type, int nbPlaces, double montant) {
        this.date = date;
        this.nbPlaces = nbPlaces;
        this.total = montant;
    }

    /**
     * Getter
     *
     * @return the date
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Setter
     *
     * @param date the date to set
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * Getter
     *
     * @return the nbPlaces
     */
    public int getNbPlaces() {
        return nbPlaces;
    }

    /**
     * Setter
     *
     * @param nbPlaces the nbPlaces to set
     */
    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    /**
     * Getter
     *
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Setter
     *
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Getter
     *
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Setter
     *
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
