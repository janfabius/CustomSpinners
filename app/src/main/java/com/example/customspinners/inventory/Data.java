package com.example.customspinners.inventory;
import com.example.customspinners.R;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Fruit> getFruitList() {
        List<Fruit> fruitList = new ArrayList<>();

        Fruit Avocado = new Fruit();
        Avocado.setName("Avocado");
        Avocado.setTitolo("Listino 1");
        Avocado.setImage(R.drawable.avocado);
        fruitList.add(Avocado);

        Fruit Banana = new Fruit();
        Banana.setTitolo("Listino 2");
        Banana.setName("Banana");
        Banana.setImage(R.drawable.banana);
        fruitList.add(Banana);

        Fruit Coconut = new Fruit();
        Coconut.setTitolo("Listino 3");
        Coconut.setName("Coconut");
        Coconut.setImage(R.drawable.coconut);
        fruitList.add(Coconut);

        Fruit Guava = new Fruit();
        Guava.setTitolo("Listino 4");
        Guava.setName("Guava");
        Guava.setImage(R.drawable.guava);
        fruitList.add(Guava);

        Fruit Lemon = new Fruit();
        Lemon.setTitolo("Listino 5");
        Lemon.setName("Lemon");
        Lemon.setImage(R.drawable.lemon);
        fruitList.add(Lemon);

        Fruit Mango = new Fruit();
        Mango.setTitolo("Listino 6");
        Mango.setName("Mango");
        Mango.setImage(R.drawable.mango);
        fruitList.add(Mango);

        Fruit Orange = new Fruit();
        Orange.setTitolo("Listino 7");
        Orange.setName("Orange");
        Orange.setImage(R.drawable.orange);
        fruitList.add(Orange);

        return fruitList;
    }

}
