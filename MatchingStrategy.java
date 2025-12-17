/**
 * Defines a strategy for calculating a compatibility score between two user profiles.
 */
public interface MatchingStrategy {
  /**
   * Calculates a compatibility score between 0.0 (no match) and 1.0 (perfect match).
   *
   * @param u1 The first user profile.
   * @param u2 The second user profile.
   * @return A double between 0.0 and 1.0.
   */
  double calculateCompatibility(UserProfile u1, UserProfile u2);
}