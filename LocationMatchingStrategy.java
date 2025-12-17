/**
 * Strategy that matches users based on physical proximity.
 */
public class LocationMatchingStrategy implements MatchingStrategy {
  private static final double MAX_DISTANCE_KM = 100.0;

  @Override
  public double calculateCompatibility(UserProfile u1, UserProfile u2) {
    double distance = calculateDistance(
        u1.getLatitude(), u1.getLongitude(), 
        u2.getLatitude(), u2.getLongitude());

    if (distance >= MAX_DISTANCE_KM) {
      return 0.0;
    }

    // Closer distance results in a score closer to 1.0
    return 1.0 - (distance / MAX_DISTANCE_KM);
  }

  private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
    // Simple Euclidean distance for flat-plane approximation
    double latDiff = lat2 - lat1;
    double lonDiff = lon2 - lon1;
    return Math.sqrt(latDiff * latDiff + lonDiff * lonDiff) * 111.0; 
  }
}