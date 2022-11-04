package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numList.add(0 + (int) (Math.random() * 10));
		}

		System.out.println(numList);
		numList.remove(0);
		numList.remove(0);
		numList.remove(numList.size() - 1);
		System.out.println(numList);

	}
}
