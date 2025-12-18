Java Match: Dating Logic Engine
Hello! This is a simple Java application I built to show how a dating app matching system works. It uses professional coding standards (Google Java Style) and a solid software design pattern to make the code clean and easy to scale.

🛠 How the App Works
The app takes two user profiles and calculates a Compatibility Score (%).

User Input: It stores information like name, gender, and coordinates (Lat/Lon).

The Gatekeeper: First, the app checks if the users actually want to meet each other based on gender. If the preferences don't match, it returns 0% immediately.

The Logic: If they pass the gatekeeper, the app runs different "strategies" to see how much they have in common.

Final Result: It averages the scores from all the rules and shows a final percentage.

🏗 System Design: Strategy Pattern
I used the Strategy Design Pattern for this project. This is a "Behavioral" pattern that is very common in software engineering.

Why did I use it? I wanted to avoid a giant "Spaghetti Code" file with too many if-else statements. In this app, every matching rule (like Interests or Location) is its own separate class.

MatchingStrategy (Interface): This is the "contract." It ensures every new rule we add follows the same format.

Concrete Strategies: These are the actual rules like InterestMatchingStrategy and LocationMatchingStrategy.

MatchingEngine (Context): This is the brain. It doesn't care how the math works; it just asks each strategy for a score and puts them together.

🚀 Key Features
Encapsulation: All user data is private and protected.

Abstraction: The engine uses an interface so we can add new matching rules easily.

Clean Logic: Uses Java Streams to find common interests quickly and precisely.

Extensible: You can add an "Age Strategy" or "Zodiac Strategy" by just creating one new class and plugging it in!

📝 A Note on the Code
The code is writen with the "Open/Closed Principle" in mind. This means the app is Open for new features but Closed for changes to the core engine. This keeps things from breaking when you want to expand the app later.
