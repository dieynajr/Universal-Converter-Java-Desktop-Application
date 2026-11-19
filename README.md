# Universal Converter – Java Desktop Application

Desktop application that converts units and currencies. University team project (team of 4).

## Features
- Unit conversions: mass, volume, distance and area
- Currency conversion using live exchange rates from the [Frankfurter API](https://www.frankfurter.app/) (free, no API key required)

## Technologies
Java 21, JavaFX, CSS, Maven, Frankfurter exchange rate API

## My Contribution
- Developed the distance and area conversion modules
- Designed and styled the user interface with CSS
- Wrote tests to check the conversions
- Debugged issues related to the currency exchange API

## How to Run
Requirements: Java 21 and Maven.

1. Clone the repository
2. Open a terminal in the project folder (the one containing `pom.xml`)
3. Run `mvn clean javafx:run`

An internet connection is required for currency conversion.

## Screenshots

<img width="764" height="353" alt="image" src="https://github.com/user-attachments/assets/993c1784-3105-4e3e-b763-bcd5c297c20c" />
<img width="760" height="350" alt="image" src="https://github.com/user-attachments/assets/fbd29ac2-e412-4ce5-9c81-7c89632482fd" />

*Distance and area conversion*

<img width="935" height="449" alt="image" src="https://github.com/user-attachments/assets/d72b54e7-7769-4418-bedf-3241bd23b4ba" />

**Error handling: the app displays a message when no internet connection is available.*

