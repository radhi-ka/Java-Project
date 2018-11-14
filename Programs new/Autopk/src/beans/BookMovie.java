package beans;

public class BookMovie {

	private int id;
	private String Movie;
	private String ShowTime;
	private int SeatNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovie() {
		return Movie;
	}
	public void setMovie(String movie) {
		Movie = movie;
	}
	public String getShowTime() {
		return ShowTime;
	}
	public void setShowTime(String showTime) {
		ShowTime = showTime;
	}
	public int getSeatNo() {
		return SeatNo;
	}
	public void setSeatNo(int seatNo) {
		SeatNo = seatNo;
	}
}
