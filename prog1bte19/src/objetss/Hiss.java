package objetss;

public class Hiss {

	private int v�ning;
	private int riktning;

	public Hiss() {

		v�ning = 0;
		riktning = 0;

		System.out.println("v:" + v�ning + " r:" + riktning);
	}

	public void moveTo() {

		v�ning = 10;
		System.out.println("v:" + v�ning + " r:" + riktning);
	}

	public void moveTo(int v)  {

		if (v >= 0 && v <= 20) {

			if (v > v�ning) {

				for (int i = v�ning; i < v; i++) {
					riktning=1;
					v�ning++;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();

					}
					System.out.println("v:" + v�ning + " r:" + riktning);

				}
				riktning=0;
			}

			if (v < v�ning) {

				for (int i = v�ning; i > v; i--) {
					riktning=-1;
					v�ning--;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();

					}
					System.out.println("v:" + v�ning + " r:" + riktning);

				}
				riktning=0;
			}







		}
		System.out.println("du �r framme v:" + v�ning + " r:" + riktning);
	}

	public int getV�ning() {
		return v�ning;
	}

	public int getRiktning() {
		return riktning;
	}

	public static void main(String[] args)  {

		Hiss h1 = new Hiss();
		// System.out.println(h1.getV�ning());
		h1.moveTo(3);

		new Hiss();
		h1.moveTo(1);
	}

}
