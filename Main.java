import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    
    // Create User A (NYC area)
    UserProfile alice = new UserProfile("Alice", "Female", "Male", 40.71, -74.00);
    alice.addInterest("Coding");
    alice.addInterest("Hiking");
    alice.addInterest("Jazz");

    // Create User B (Nearby in Brooklyn)
    UserProfile bob = new UserProfile("Bob", "Male", "Female", 40.67, -73.94);
    bob.addInterest("Coding");
    bob.addInterest("Jazz");
    bob.addInterest("Cooking");

    // Initialize Engine with specific strategies
    MatchingEngine engine = new MatchingEngine(Arrays.asList(
        new InterestMatchingStrategy(),
        new LocationMatchingStrategy()
    ));

    double finalScore = engine.getFinalMatchPercentage(alice, bob);

    System.out.println("--- Match Result ---");
    System.out.printf("Match between %s and %s: %.2f%%%n", 
        alice.getName(), bob.getName(), finalScore);
  }







  /*
  The system design pattern used in this application is the Strategy Design Pattern.
   */
}