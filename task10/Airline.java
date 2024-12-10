package by.it_academy.task10;

import java.util.Objects;

public class Airline {

	private String destination;
	private String flightNumber;
	private String airplaneType;
	private String departureTime;
	private String dayOfWeek;

	public Airline(String destination, String flightNumber, String airplaneType, String departureTime,
			String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Airline{" + "Destination = '" + destination + '\'' + ", FlightNumber = '" + flightNumber + '\''
				+ ", AirplaneType = '" + airplaneType + '\'' + ", DepartureTime = '" + departureTime + '\''
				+ ", DayOfWeek = '" + dayOfWeek + '\'' + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(airplaneType, dayOfWeek, departureTime, destination, flightNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(airplaneType, other.airplaneType) && Objects.equals(dayOfWeek, other.dayOfWeek)
				&& Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& Objects.equals(flightNumber, other.flightNumber);
	}
}
