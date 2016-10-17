
// GraphicsLab05st.java
// This is the student, starting file of Lab10GRFX05 which draws 3 flags.
// Students need to create 10 more flags.  They will not know which flags these are ahead of time.
// Each of flag will be worth 10 points.  There will also be 2 bonus flags worth 5 points each.

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class marianagraphicslab05 extends Applet {
	static int numDots;
	static Random rand;

	public void init() {
		numDots = 1000000; // number of dots drawn for each flag
		rand = new Random();
	}

	public void paint(Graphics g) {
		titlePage(g, "Maiana Martinez", 5);
		flagOfLibya(g, numDots);
		flagOfMonaco(g, numDots);
		flagOfItaly(g, numDots);
		flagOfIreland(g, numDots);
		flagOfFrance(g, numDots);
		flagOfRomania(g, numDots);
		flagOfBelguim(g, numDots);
		flagOfHolland(g, numDots);
		flagOfHungary(g, numDots);
		flagOfGermany(g, numDots);
		flagOfRussia(g, numDots);
		flagOfSerbia(g, numDots);
		flagOfEstonia(g, numDots);
		flagOfLithuania(g, numDots);
		flagOfAustria(g, numDots);
		flagOfTexas(g, numDots);
		flagOfUSA(g, numDots);
	}

	public static void titlePage(Graphics g, String name, int period) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, 1000, 650);
		g.setColor(Color.white);
		g.fillRect(100, 100, 800, 450);
		g.setColor(Color.red);
		Font title = new Font("Algerian", Font.BOLD, 48);
		g.setFont(title);
		g.drawString("Flags of the World", 225, 240);
		g.setColor(Color.blue);
		g.drawString("by: " + name, 225, 340);
		g.setColor(Color.green);
		g.drawString("Period: " + period, 225, 440);
		delay(3000); // Wait 3 second before showing first flag.
	}

	public static void showName(Graphics g, String name) {
		g.setColor(Color.white);
		g.fillRect(25, 50, 30 * (name.length() + 3), 70);
		g.setColor(Color.black);
		Font countryName = new Font("Algerian", Font.BOLD, 48);
		g.setFont(countryName);
		g.drawString(name, 50, 100);
		delay(2000); // Wait 2 second before showing next flag.
	}

	public static void delay(int n) {
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();
	}

	public static void flagOfLibya(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			g.setColor(Color.green); // The Libyan flag is the simplest in the
										// world.
										// It is a solid green rectangle.
			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Libya");
	}

	public static void flagOfMonaco(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 325) // top stripe
				g.setColor(Color.red);
			else // bottom stripe
				g.setColor(Color.white);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Monaco");
	}

	public static void flagOfItaly(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (x < 333) // left stripe \
				g.setColor(Color.green);
			if (x >= 333 && x < 667) // middle stripe requires compound
										// condition
				g.setColor(Color.white);

			if (x >= 667) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Italy");
	}

	public static void flagOfIreland(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (x < 333) // left stripe \
				g.setColor(Color.green);
			if (x >= 333 && x < 667) // middle stripe requires compound
										// condition
				g.setColor(Color.white);

			if (x >= 667) // right stripe
				g.setColor(Color.orange);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Ireland");
	}

	public static void flagOfFrance(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (x < 333) // left stripe \
				g.setColor(Color.blue);
			if (x >= 333 && x < 667) // middle stripe requires compound
										// condition
				g.setColor(Color.white);

			if (x >= 667) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "France");

	}

	public static void flagOfRomania(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (x < 333) // left stripe \
				g.setColor(Color.blue);
			if (x >= 333 && x < 667) // middle stripe requires compound
										// condition
				g.setColor(Color.yellow);

			if (x >= 667) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Romania");

	}

	public static void flagOfBelguim(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (x < 333) // left stripe \
				g.setColor(Color.black);
			if (x >= 333 && x < 667) // middle stripe requires compound
										// condition
				g.setColor(Color.yellow);

			if (x >= 667) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Belguim");
	}

	public static void flagOfHolland(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.red);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.white);

			if (y >= 433) // right stripe
				g.setColor(Color.blue);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Holland");
	}

	public static void flagOfHungary(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.red);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.white);

			if (y >= 433) // right stripe
				g.setColor(Color.green);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Hungary");
	}

	public static void flagOfGermany(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.black);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.red);

			if (y >= 433) // right stripe
				g.setColor(Color.yellow);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Germany");
	}

	public static void flagOfRussia(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.white);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.blue);

			if (y >= 433) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Russia");
	}

	public static void flagOfSerbia(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.blue);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.white);

			if (y >= 433) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Serbia");
	}

	public static void flagOfEstonia(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.blue);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.black);

			if (y >= 433) // right stripe
				g.setColor(Color.white);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Estonia");
	}

	public static void flagOfLithuania(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.yellow);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.green);

			if (y >= 433) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Lithuania");
	}

	public static void flagOfAustria(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 217) // left stripe \
				g.setColor(Color.red);
			if (y >= 217 && y < 433) // middle stripe requires compound
										// condition
				g.setColor(Color.white);

			if (y >= 433) // right stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "Austria");
	}

	public static void flagOfTexas(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 325) // top stripe
				g.setColor(Color.white);
			else // bottom stripe
				g.setColor(Color.red);

			if (x < 333) // left stripe \
				g.setColor(Color.blue);

				g.fillRect(x, y, 3, 3);
		}
		showName(g, "Texas");
		
	}public static void flagOfUSA(Graphics g, int numDots) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 650);
		for (int d = 1; d <= numDots; d++) {
			int x = rand.nextInt(1000); // random x value of each dot
			int y = rand.nextInt(650); // random y value of each dot

			if (y < 50) // top stripe \
				g.setColor(Color.red);
			if (y >= 50 && y < 100) 
				g.setColor(Color.white);
			if (y >= 100 && y < 150) 
				g.setColor(Color.red);
			if (y >= 150 && y < 200) 
				g.setColor(Color.white);
			if (y >= 200 && y < 250) 
				g.setColor(Color.red);
			if (y >= 250 && y < 300) 
				g.setColor(Color.white);
			if (y >= 300 && y < 350) 
				g.setColor(Color.red);
			if (x < 333) // left stripe \
				g.setColor(Color.blue);
			if (y >= 350 && y < 400) 
				g.setColor(Color.white);
			if (y >= 400 && y < 450) 
				g.setColor(Color.red);
			if (y >= 450 && y < 500) 
				g.setColor(Color.white);
			if (y >= 500 && y < 550) 
				g.setColor(Color.red);
			if (y >= 550 && y < 600) 
				g.setColor(Color.white);
			if (y >= 600) // bottom stripe
				g.setColor(Color.red);

			g.fillRect(x, y, 3, 3);
		}
		showName(g, "USA");
	}	
}
