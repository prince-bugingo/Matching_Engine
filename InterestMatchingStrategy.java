import java.util.Set;

/**
 * Strategy that matches users based on the number of shared interests.
 */
public class InterestMatchingStrategy implements MatchingStrategy {
  @Override
  public double calculateCompatibility(UserProfile u1, UserProfile u2) {
    Set<String> interests1 = u1.getInterests();
    Set<String> interests2 = u2.getInterests();

    if (interests1.isEmpty() || interests2.isEmpty()) {
      return 0.0;
    }

    long commonCount = interests1.stream()
        .filter(interests2::contains)
        .count();

    // Score is the ratio of shared interests to the larger interest set
    return (double) commonCount / Math.max(interests1.size(), interests2.size());
  }
}

/*
LocationMatchingStrategyIntent: Ensure the match is realistic.The Logic: It uses a simplified version of the distance 
formula:$$d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$$
The Why: Even if two people love the same 50 hobbies, a match is less likely to work if they live 5,000 miles apart. This strategy penalizes the score based on distance.


*/