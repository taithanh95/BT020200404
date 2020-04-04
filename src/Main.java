import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

import javax.sound.midi.Soundbank;

public class Main {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");

		System.out.println("Thời gian hiện tại sau khi định dạng là: " + sdf.format(date));

		System.out.println("Ngày hiện tại là: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.print("Tháng hiện tại là: ");
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println("Năm hiện tại là: " + cal.get(Calendar.YEAR));
		System.out.println("Hôm nay là thứ: " + cal.get(Calendar.DAY_OF_WEEK));

		YearMonth ym = YearMonth.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1);
		System.out.println("Ngày đầu tiên của tháng hiện tại là: " + ym.atDay(1));
		System.out.println("Ngày cuối cùng của tháng hiện tại là: " + ym.atEndOfMonth());

		YearMonth ym1 = YearMonth.of(cal.get(Calendar.YEAR) - 1, 12);
		System.out.println("Thứ của ngày cuối cùng trong năm ngoái là :" + ym1.atEndOfMonth().getDayOfWeek().name());

		System.out.println("Số phút tính đến thời điểm hiện tại kể từ 00h00p: " + cal.get(Calendar.HOUR_OF_DAY) * 60
				+ cal.get(Calendar.MINUTE) + " phút");
	}
}
