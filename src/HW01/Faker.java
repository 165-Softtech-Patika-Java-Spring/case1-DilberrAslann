package HW01;

import java.util.ArrayList;
import java.util.Random;

public class Faker {
    private ArrayList<House> houseList;
    private ArrayList<Villa> villaList;
    private ArrayList<SummerHouse> summerHouseList;

    public Faker() {
        Random rnd = new Random();
        populateLists(3 + rnd.nextInt(10), 3 + rnd.nextInt(10), 3 + rnd.nextInt(10));
    }

    public Faker(int houseCount, int villaCount, int summerHouseCount) {
        if (houseCount < 3) houseCount = 3;
        if (villaCount < 3) villaCount = 3;
        if (summerHouseCount < 3) summerHouseCount = 3;
        populateLists(houseCount, villaCount, summerHouseCount);
    }

    private void populateLists(int houseCount, int villaCount, int summerHouseCount) {
        this.houseList = new ArrayList<>();
        for (int i = 0; i < houseCount; i++) {
            int[] values = generateValues();
            this.houseList.add(new House(values[0], values[1], values[2], values[3]));
        }

        this.villaList = new ArrayList<>();
        for (int i = 0; i < villaCount; i++) {
            int[] values = generateValues();
            this.villaList.add(new Villa(values[0], values[1], values[2], values[3]));
        }

        this.summerHouseList = new ArrayList<>();
        for (int i = 0; i < summerHouseCount; i++) {
            int[] values = generateValues();
            this.summerHouseList.add(new SummerHouse(values[0], values[1], values[2], values[3]));
        }
    }

    private int[] generateValues() {
        Random rnd = new Random();
        return new int[]{
                120000 + rnd.nextInt(2000000),
                1 + rnd.nextInt(4),
                rnd.nextInt(3),
                80 + rnd.nextInt(200)
        };
    }

    public ArrayList<House> getHouseList() {
        return this.houseList;
    }

    public ArrayList<Villa> getVillaList() {
        return this.villaList;
    }

    public ArrayList<SummerHouse> getSummerHouseList() {
        return this.summerHouseList;
    }
}
