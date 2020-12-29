package betulOdev;

import java.util.Random;

public class scheinaufgabe7 {
	public static void main(String[] args) {

		GoLGrid grid = new GoLGrid(30);

		int[][] data = grid.createRandom(0.3);
		grid.setData(data);

		GoLGrid grid2 = new GoLGrid(30);

		while (true) {
			for (int i = 0; i < data[0].length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					int nachbarn = grid.getNumberOfNeighbors(i, j);
					if (data[i][j] == 0 && nachbarn == 3) {
						data[i][j] = 1;
					} else if (data[i][j] == 1 && nachbarn < 2) {
						data[i][j] = 0;
					} else if (data[i][j] == 1 && nachbarn > 3) {
						data[i][j] = 0;
					} else {
						data[i][j] = 0;
					}
				}

			}
			grid.sleep(400);
			grid2.setData(data);

		}

	}

}
