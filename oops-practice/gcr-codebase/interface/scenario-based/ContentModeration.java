interface TextModeration {

    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("badword");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean checkOffensiveContent(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {
        return post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("click here");
    }

    @Override
    public void displayModerationPolicy() {
        System.out.println("Platform Policy: No Spam and No Offensive Content.");
    }
}

public class ContentModeration {
    public static void main(String[] args) {

        String[] posts = {
                "Welcome to our community",
                "Buy now and get 50% off",
                "This contains badword content",
                "Click here to win prizes",
                "Have a great day"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:");

        for (String post : posts) {

            if (moderator.checkSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            }
            else if (moderator.checkOffensiveContent(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            }
            else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}