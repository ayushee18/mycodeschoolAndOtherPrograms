package ImutableExample;

import java.util.Date;

public class ImutableObjectCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		ImutableClass imutableClass = new ImutableClass(10, date);
		System.out.println(imutableClass.getDate());
		date = new Date(1994,07,18);
		System.out.println(imutableClass.getDate());
	}

}
