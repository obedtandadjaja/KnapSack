public class DynamicAlgorithm {
	
	static int temp = 0;
	static final int MAX_WEIGHT = 22;
	
	public static void main(String[] args) {
		int[][] options = {{7,145}, {3,70}, {2,5}}; // sample input, modify to your needs
		int[] bag = new int[2]; // 0 for weight, 1 for value
		dynamic(options, bag);
		System.out.println("Max value: "+temp);
	}
	
	public static void dynamic(int[][] options, int[] bag) {
		for(int i = 0; i < options.length; i++) {
			if((options[i][0]+bag[0]) <= MAX_WEIGHT) {
				int[] temp_bag = new int[2];
				temp_bag[0] = bag[0]+options[i][0];
				temp_bag[1] = bag[1]+options[i][1];
				if(temp_bag[1] > temp) {
					temp = temp_bag[1];
				}
				dynamic(options, temp_bag);
			}
		}
	}
}
