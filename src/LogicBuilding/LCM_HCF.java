package LogicBuilding;

public class LCM_HCF {
	public static void main(String[] args) {
		int x = 6;
		int y = 10;
		int small, big;
		if (x > y) {
			small = y;
			big = x;
		} else {
			small = x;
			big = y;
		}
		int lcm = 1;

		for (int i = big; i > 1; i--) {

			if ((big % i == 0) && (small % i == 0)) {
				lcm = lcm * i;
				small = small / i;
				big = big / i;
			}
			lcm = lcm * big * small;
			System.out.println(lcm);
			int hcf = (x * y) / lcm;
			System.out.println(hcf);
		}
	}

}
