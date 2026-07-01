import java.util.HashSet;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();

    public static void registerParticipant(String email) {

        if (participants.add(email))
            System.out.println(email + " Registered Successfully.");
        else
            System.out.println("Duplicate Registration Not Allowed.");
    }

    public static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Participants: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("harshita@gmail.com");
        registerParticipant("aman@gmail.com");
        registerParticipant("riya@gmail.com");
        registerParticipant("aman@gmail.com");

        displayParticipants();
    }
}