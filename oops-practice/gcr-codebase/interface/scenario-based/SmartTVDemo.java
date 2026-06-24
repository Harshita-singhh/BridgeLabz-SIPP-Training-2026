interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing game...");
    }

    @Override
    public void showSubscriptionDetails() {
        System.out.println("Smart TV Premium Subscription Active");
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {

        String[] movies = {
                "Inception",
                "Interstellar",
                "Avengers"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies Available:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nGames Available:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}