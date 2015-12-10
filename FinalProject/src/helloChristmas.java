import java.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class helloChristmas {

	public helloChristmas() {
		
		String nameInput = JOptionPane.showInputDialog(null, "Type in your first name: ");
		
		
		JOptionPane.showMessageDialog(null, "I dont think, " + nameInput + "is your name. Try again");
		
		
		JOptionPane.showMessageDialog(null, "Merry Christmas, " + nameInput);
		JOptionPane.showMessageDialog(null, "<html>An <strong>Advent Calendar</strong> is a calendar that represents the days until Christmas. <br> In the 19th and 20th century Advent Calendars were first <br> used by German Lutherns. Although today they have become a tradition <br>through Christian Denominations.</html>");

		Date currentTime = new Date();
		DateFormat.getDateInstance().format(currentTime);
	}



}
