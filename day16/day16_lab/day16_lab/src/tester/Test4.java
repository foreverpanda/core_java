package tester;

import java.util.ArrayList;
import java.util.List;

import fruits.Alphonso;
import fruits.Apple;
import fruits.Fruit;
import fruits.Kesar;
import fruits.Mango;
import fruits.Orange;
import static utils.Utils.*;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Fruit> fruits=new ArrayList<>(
				List.of(new Apple(), new Orange())
				);
		addMangoes(fruits, new Alphonso(),new Kesar(),new Mango());
		fruits.forEach(f -> System.out.println(f));
		

	}

}
