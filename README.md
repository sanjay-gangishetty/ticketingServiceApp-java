# ABC Travels Ticketing System

ABC Travels Ticketing System is a simple Java-based application for managing user registrations, logins, and journey planning. Users can register as new administrators and become super admin, log in, plan journeys by selecting routes and seats, calculate fares, and even reschedule their trips.

## Features

- **New Admin User Registration**: Users can register as new administrators by providing necessary information.
- **Existing User Login**: Registered users can log in using their email and password.
- **Lock Account**: Accounts are locked automatically after 5 failed login attempts.
- **Become Super Admin**: Existing users can become Super Admins by entering a special key.
- **Display All Users**: Super Admins can view a list of all registered users.
- **Display All Tickets**: Super Admins can view a list of all booked tickets.
- **Journey Planning**: Users can plan their journey by selecting routes and seats.
- **Fare Calculation**: The system calculates fares based on the selected route, number of passengers, and day of the week.If travel days are weekends, surges the price by 200 and applies gst on it.
- **Bill Printing**: After planning a journey, the system prints a detailed bill including trip details, fare, and GST.
- **Rescheduling**: Users have the option to reschedule their journey by selecting reschedule date.
- **Exception Handling**: The code includes input validation using exception handling.
- **Exit**: Users can exit the application at any time.

## Project Structure

- `com.ABCTravels` : Main package containing all application logic.
- `DisplayLogo.java` : Class to display the ABC Travels logo.
- `ExitMethod.java` : Class for handling the exit process.
- `FareCalculator.java` : Class for calculating the fare and calling the bill printer.
- `FetchBookings.java` : Class for fetching and displaying all bookings.
- `JourneyPlanner.java` : Class for planning the journey and selecting seats.
- `LoginAndRegistration.java` : Class for handling user login and registration.
- `RescheduleJourney.java` : Class for rescheduling the journey date.
- `SuperAdmin.java` : Class for Super Admin actions.
- `TicketBooking.java` :  Class representing a booked ticket.
- `TicketingServiceApp.java` : Main class to run the application.
- `TravelDataMethods.java` : Class for managing travel data and tickets.
- `UserActions.java` : Class for handling user actions and navigation.
- `UsersData.java` : Class representing user data.
- `UsersMethods.java` : Class for managing user data and actions.
- `DateMethods.java` : Class for date-related methods.

## Usage

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/sanjay-gangishetty/ticketingServiceApp-java.git
    ```

2. Compile and run the `TicketingServiceApp` class to launch the application.

3. Follow the on-screen prompts to register, log in, and plan your journey.

## `UsersMethods` Class

- The `UsersData` class serves as a data structure to store user information in the ABC Travels Ticketing System. 

- This class is utilized to manage user data within the ABC Travels Ticketing System application.

## `TravelDataMethods` Class

- The `TravelDataMethods` class serves as a data structure to store travel information in the ABC Travels Ticketing System. 

- This class is utilized to manage travel data within the ABC Travels Ticketing System application.

## Dependencies

- Java 8 or higher

## Contributing

Contributions are welcome! If you have any improvements or suggestions, feel free to open an issue or submit a pull request.


Feel free to explore ABC Travels Ticketing System!

