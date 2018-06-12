package ImutableExample;

import java.util.Date;

public final class ImutableClass {
	
	private final int number;
	private final Date date;
	
	ImutableClass(int number, Date date){
		this.date = date;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

}
