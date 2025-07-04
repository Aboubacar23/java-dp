import junit.framework.TestCase;
import org.junit.Test;
import org.sebsy.grasps.Params;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.controller.ReservationController;

public class ReservationControllerTest extends TestCase {
    /**
     * DELTA
     */
    private static final double DELTA = 0.0000001;

    @Test
    public void testCreerReservationTheatrePremium() {
        Params params = new Params();
        params.setDateReservation("20/11/2020 19:55:00");
        params.setNbPlaces(3);
        params.setIdentifiantClient("1");
        params.setTypeReservation("TH"); // Théâtre

        ReservationController controller = new ReservationController();
        Reservation reservation = controller.handle(params);

        assertEquals(382.5, reservation.getTotal(), DELTA);
    }

    @Test
    public void testCreerReservationTheatreNonPremium() {
        Params params = new Params();
        params.setDateReservation("20/11/2020 19:55:00");
        params.setNbPlaces(3);
        params.setIdentifiantClient("3");
        params.setTypeReservation("TH"); // Théâtre

        ReservationController controller = new ReservationController();
        Reservation reservation = controller.handle(params);

        assertEquals(450.0, reservation.getTotal(), DELTA);
    }

    @Test
    public void testCreerReservationCinemaPremium() {
        Params params = new Params();
        params.setDateReservation("21/11/2020 20:30:00");
        params.setNbPlaces(4);
        params.setIdentifiantClient("2");
        params.setTypeReservation("CI"); // Cinéma

        ReservationController controller = new ReservationController();
        Reservation reservation = controller.handle(params);

        assertEquals(43.6, reservation.getTotal(), DELTA);
    }

    @Test
    public void testCreerReservationCinemaNonPremium() {
        Params params = new Params();
        params.setDateReservation("21/11/2020 20:30:00");
        params.setNbPlaces(4);
        params.setIdentifiantClient("3");
        params.setTypeReservation("CI"); // Cinéma

        ReservationController controller = new ReservationController();
        Reservation reservation = controller.handle(params);

       // assertEquals(43.6, reservation.getTotal(), DELTA);
    }
}
