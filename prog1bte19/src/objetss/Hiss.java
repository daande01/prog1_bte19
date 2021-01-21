package objetss;

public class Hiss {

	private int våning;
	private int riktning;

	public Hiss() {

		våning = 0;
		riktning = 0;

		System.out.println("v:" + våning + " r:" + riktning);
	}

	public void moveTo() {

		våning = 10;
		System.out.println("v:" + våning + " r:" + riktning);
	}

	public void moveTo(int v)  {

		if (v >= 0 && v <= 20) {

			if (v > våning) {

				for (int i = våning; i < v; i++) {
					riktning=1;
					våning++;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();

					}
					System.out.println("v:" + våning + " r:" + riktning);

				}
				riktning=0;
			}

			if (v < våning) {

				for (int i = våning; i > v; i--) {
					riktning=-1;
					våning--;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();

					}
					System.out.println("v:" + våning + " r:" + riktning);

				}
				riktning=0;
			}







		}
		System.out.println("du är framme v:" + våning + " r:" + riktning);
	}

	public int getVåning() {
		return våning;
	}

	public int getRiktning() {
		return riktning;
	}

	public static void main(String[] args)  {

		Hiss h1 = new Hiss();
		// System.out.println(h1.getVåning());
		h1.moveTo(3);

		new Hiss();
		h1.moveTo(1);
	}

}
