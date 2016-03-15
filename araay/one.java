package araay;

import java.util.Random;

public class one {
	public static void main(String args[]) {
		Random rand = new Random();
		int freq[] = new int[7];
		float totalpercentage = 0;
		int totalface = 0;
		for (int roll = 1; roll <= 1000; roll++) {
			++freq[1 + rand.nextInt(6)];
		}
		System.out.println("face\tvalue\tpercentage");
		for (int face = 1; face <= 6; face++) {
			System.out.println(face + "\t" + freq[face] + "\t" + (100 * (float) (freq[face]) / 1000));
			totalface = totalface + freq[face];
			totalpercentage = totalpercentage + (100 * (float) (freq[face]) / 1000);
		}
		System.out.println("Total\t" + totalface + "\t" + totalpercentage);
	}

}