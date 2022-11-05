package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numberList.add(0 + (int) (Math.random() * 10));
		}

		System.out.println(numberList);
		numberList.remove(0);
		numberList.remove(0);
		numberList.remove(numberList.size() - 1);
		System.out.println(numberList);

	}
}
