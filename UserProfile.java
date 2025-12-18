import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * This class Represents a user's identity, preferences, and location data.
 */
public class UserProfile {
  private final String name;
  private final String gender;
  private final String genderPreference;
  private final Set<String> interests;
  private final double latitude;
  private final double longitude;

  public UserProfile(String name, String gender, String genderPreference, 
                     double latitude, double longitude) {
    this.name = name;
    this.gender = gender;
    this.genderPreference = genderPreference;
    this.latitude = latitude;
    this.longitude = longitude;
    this.interests = new HashSet<>();
  }

  public void addInterest(String interest) {
    if (interest != null && !interest.isBlank()) {
      this.interests.add(interest.trim().toLowerCase());
    }
  }

  // Getters 
  public String getName() { return name; }
  public String getGender() { return gender; }
  public String getGenderPreference() { return genderPreference; }
  public double getLatitude() { return latitude; }
  public double getLongitude() { return longitude; }
  public Set<String> getInterests() { return Collections.unmodifiableSet(interests); }
}