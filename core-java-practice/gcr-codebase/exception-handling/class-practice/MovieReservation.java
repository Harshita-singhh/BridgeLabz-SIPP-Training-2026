public class MovieReservation {

    int seats[] = {101, 102, 103, 104, 105};

    public int getSeat(int index) {

        try {

            return seats[index];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid seat position.");

            return -1;
        }
    }

    public static void main(String[] args) {

        MovieReservation obj = new MovieReservation();

        System.out.println(obj.getSeat(2));
        System.out.println(obj.getSeat(8));
    }
}