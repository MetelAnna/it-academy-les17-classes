package by.it_academy.task10;

import java.util.ArrayList;
import java.util.List;

public class AirlineAggregated {
	private List<Airline> airlines;

	public AirlineAggregated() {
		airlines = new ArrayList<>();
	}

	public void addAirline(Airline airline) {
		airlines.add(airline);
	}

	// a
	public List<Airline> getFlightsByDestination(String destination) {
		List<Airline> result = new ArrayList<>();
		for (Airline airline : airlines) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				result.add(airline);
			}
		}
		return result;
	}

	// b
	public List<Airline> getFlightsByDayOfWeek(String dayOfWeek) {
		List<Airline> result = new ArrayList<>();
		for (Airline airline : airlines) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				result.add(airline);
			}
		}
		return result;
	}

	// c
	public List<Airline> getFlightsByDayAndTime(String dayOfWeek, String time) {
		List<Airline> result = new ArrayList<>();
		for (Airline airline : airlines) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek) && airline.getDepartureTime().compareTo(time) > 0) {
				result.add(airline);
			}
		}
		return result;
	}
}
