package ex_time_1_8;

public class Time {
	int hour, minute, second;

	private void correctTime(int hour, int minute, int second) {
		minute += second / 60;
		second = second % 60;
		if (second < 0) {
			second += 60;
			minute--;
		}
		hour += minute / 60;
		minute = minute % 60;
		if (minute < 0) {
			minute += 60;
			hour--;
		}
		hour = ((hour % 24) + 24) % 24;
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	public Time(int hour, int minute, int second) {
		correctTime(hour, minute, second);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		correctTime(hour, this.minute, this.second);
	}

	public void setMinute(int minute) {
		correctTime(this.hour, minute, this.second);
	}

	public void setSecond(int second) {
		correctTime(this.hour, this.minute, second);
	}

	public void setTime(int hour, int minute, int second) {
		correctTime(hour, minute, second);
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public Time nextSecond() {
		correctTime(this.hour, this.minute, this.second + 1);
		return this;
	}

	public Time previousSecond() {
		correctTime(this.hour, this.minute, this.second - 1);
		return this;
	}
}
