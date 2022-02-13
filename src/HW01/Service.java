package HW01;

import java.util.ArrayList;

public class Service {
    public int getSumOfHousePrices(ArrayList<House> houseList) {
        int sum = 0;
        for(House house : houseList) {
            sum += house.price;
        }
        return sum;
    }

    public int getSumOfVillaPrices(ArrayList<Villa> villaList) {
        int sum = 0;
        for(Villa villa : villaList) {
            sum += villa.price;
        }
        return sum;
    }

    public int getSumOfSummerHousePrices(ArrayList<SummerHouse> summerHouseList) {
        int sum = 0;
        for(SummerHouse summerHouse : summerHouseList) {
            sum += summerHouse.price;
        }
        return sum;
    }

    public int getPriceSumOfAllHousings(ArrayList<House> houseList, ArrayList<Villa> villaList, ArrayList<SummerHouse> summerHouseList) {
        return getSumOfHousePrices(houseList) + getSumOfVillaPrices(villaList) + getSumOfSummerHousePrices(summerHouseList);
    }

    public double getAverageOfHouseAreas(ArrayList<House> houseList) {
        if(houseList.isEmpty()) return 0;

        double result = 0;

        for(House house : houseList) {
            result += house.area;
        }

        return result / houseList.size();
    }

    public double getAverageOfVillaAreas(ArrayList<Villa> villaList) {
        if(villaList.isEmpty()) return 0;

        double result = 0;

        for(Villa villa : villaList) {
            result += villa.area;
        }

        return result / villaList.size();
    }

    public double getAverageOfSummerHouseAreas(ArrayList<SummerHouse> summerHouseList) {
        if(summerHouseList.isEmpty()) return 0;

        double result = 0;

        for(SummerHouse summerHouse : summerHouseList) {
            result += summerHouse.area;
        }

        return result / summerHouseList.size();
    }

    public double getAverageOfAllHousingAreas(ArrayList<House> houseList, ArrayList<Villa> villaList, ArrayList<SummerHouse> summerHouseList) {
        double sum = 0, divider = 0;

        if(!houseList.isEmpty()) {
            sum += getAverageOfHouseAreas(houseList);
            divider++;
        }

        if(!villaList.isEmpty()) {
            sum += getAverageOfVillaAreas(villaList);
            divider++;
        }

        if(!summerHouseList.isEmpty()) {
            sum += getAverageOfSummerHouseAreas(summerHouseList);
            divider++;
        }

        return divider == 0 ? 0 : sum / divider;
    }

    public ArrayList<Housing> filterAllHousing(ArrayList<House> houseList, ArrayList<Villa> villaList, ArrayList<SummerHouse> summerHouseList, int roomCount, int salonCount) {
        ArrayList<Housing> filteredList = new ArrayList<>();
        for(Housing housing : houseList) {
            if(housing.getRoomCount() == roomCount && housing.getSalonCount() == salonCount) {
                filteredList.add(housing);
            }
        }
        for(Housing housing : villaList) {
            if(housing.getRoomCount() == roomCount && housing.getSalonCount() == salonCount) {
                filteredList.add(housing);
            }
        }
        for(Housing housing : summerHouseList) {
            if(housing.getRoomCount() == roomCount && housing.getSalonCount() == salonCount) {
                filteredList.add(housing);
            }
        }
        return filteredList;
    }
}
