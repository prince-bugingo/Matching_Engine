import java.util.List;

/*
 * The core matiching engin,  engine that aggregates multiple strategies to find a final match score.
 */
public class MatchingEngine {
  private final List<MatchingStrategy> strategies;

  public MatchingEngine(List<MatchingStrategy> strategies) {
    this.strategies = strategies;
  }

  public double getFinalMatchPercentage(UserProfile u1, UserProfile u2) {
    // 1. Mandatoryy Requirement: thE Gendar Prefelences must match
    if (!isGenderCompatible(u1, u2)) {
      return 0.0;
    }

    // 2. Aggregate scores from all active strategies
    double totalCompatibility = 0.0;
    for (MatchingStrategy strategy : strategies) {
      totalCompatibility += strategy.calculateCompatibility(u1, u2);
    }

    return (totalCompatibility / strategies.size()) * 100;
  }

  private boolean isGenderCompatible(UserProfile u1, UserProfile u2) {
    return u1.getGenderPreference().equalsIgnoreCase(u2.getGender()) &&
           u2.getGenderPreference().equalsIgnoreCase(u1.getGender());
  }
}