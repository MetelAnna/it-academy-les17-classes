package by.it_academy.task10;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		AirlineAggregated aggregate = new AirlineAggregated();

		aggregate.addAirline(new Airline("Cairo", "CA312", "Boeing", "9:50", "Saturday"));
		aggregate.addAirline(new Airline("Abu Dhabi", "AD780", "Airbus A320", "12:35", "Wednesday"));
		aggregate.addAirline(new Airline("Cairo", "CA350", "Boeing", "10:10", "Tuesday"));
		aggregate.addAirline(new Airline("Milano", "MI35", "Airbus A330", "19:15", "Thursday"));
		aggregate.addAirline(new Airline("Dubai", "DU506", "Boeing", "2:40", "Saturday"));
		aggregate.addAirline(new Airline("Cairo", "CA312", "Airbus A380", "14:00", "Sunday"));

		// a
		System.out.println("Flights to Cairo:");
		List<Airline> flightsToCairo = aggregate.getFlightsByDestination("Cairo");
		for (Airline airline : flightsToCairo) {
			System.out.println(airline);
		}

		// b
		System.out.println("\nFlights on Saturday:");
		List<Airline> flightsOnSaturday = aggregate.getFlightsByDayOfWeek("Saturday");
		for (Airline airline : flightsOnSaturday) {
			System.out.println(airline);
		}

		// c
		System.out.println("\nFlights on Saturday after 9:00:");
		List<Airline> flightsOnSaturdayAfter9 = aggregate.getFlightsByDayAndTime("Saturday", "9:00");
		for (Airline airline : flightsOnSaturdayAfter9) {
			System.out.println(airline);
		}
	}
}
