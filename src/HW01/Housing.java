package HW01;

public class Housing {
    static private int counter = 1;

    protected int id;

    protected int price;
    protected int roomCount;
    protected int salonCount;
    protected int area;

    public Housing(int price, int roomCount, int salonCount, int area) {
        this.price = price;
        this.roomCount = roomCount;
        this.salonCount = salonCount;
        this.area = area;

        this.id = counter++;
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public int getRoomCount() {
        return this.roomCount;
    }

    public int getSalonCount() {
        return this.salonCount;
    }

    public int getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.roomCount + "+" + this.salonCount + ", " + this.area + " m^2, " + this.price + "$";
    }
}
