package HW01;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Faker fake = new Faker();

        System.out.println("Sum of house prices: " + service.getSumOfHousePrices(fake.getHouseList()));
        System.out.println("Sum of villa prices: " + service.getSumOfVillaPrices(fake.getVillaList()));
        System.out.println("Sum of summer house prices: " + service.getSumOfSummerHousePrices(fake.getSummerHouseList()));
        System.out.println("Sum of all housing prices: " + service.getPriceSumOfAllHousings(fake.getHouseList(), fake.getVillaList(), fake.getSummerHouseList()));

        System.out.println();
        System.out.println();

        System.out.println("Average of house areas: " + service.getAverageOfHouseAreas(fake.getHouseList()));
        System.out.println("Average of villa areas: " + service.getAverageOfVillaAreas(fake.getVillaList()));
        System.out.println("Average of summer house ares: " + service.getAverageOfSummerHouseAreas(fake.getSummerHouseList()));
        System.out.println("Average of all housing areas: " + service.getAverageOfAllHousingAreas(fake.getHouseList(), fake.getVillaList(), fake.getSummerHouseList()));

        System.out.println();
        System.out.println();

        int roomCount = 3, salonCount = 1;

        ArrayList<Housing> filtered = service.filterAllHousing(fake.getHouseList(), fake.getVillaList(), fake.getSummerHouseList(), roomCount, salonCount);
        if(filtered.isEmpty()) {
            System.out.println("There is no " + roomCount + "+" + salonCount + " housing.");
        }
        for(Housing housing : filtered) {
            System.out.println(housing);
        }
    }
}
