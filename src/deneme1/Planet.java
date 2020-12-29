package deneme1;

public enum Planet {

	MERKUR(3.30e23, 2_440_000), 
	VENUS(4.87e24, 6_051_000), 
	ERDE(5.97e24, 6_378_000), 
	MARS(6.42e23, 3_397_000),
	JUPITER(1.90e27, 71_492_000), 
	SATURN(5.69e26, 60_268_000), 
	URANUS(8.66e25, 25_559_000), 
	NEPTUN(1.03e26, 24_764_000),
	PLUTO(1.31e22, 1_160_000);

	private final double masse;
	private final long radius;

	private Planet(double masse, long radius) {
		this.masse = masse;
		this.radius = radius;
	}

	public double getMasse() {
		return masse;
	}

	public long getRadius() {
		return radius;
	}
	
	public static void closerToSun(Planet p) {
		
	}
	
	

}
