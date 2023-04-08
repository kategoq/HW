package HW3;

public class Car {
    public String number;

    public String owner;

    public String brand;

    public Car (String brand) {
        this.brand = brand;
    }

    public Car (String brand, String owner) {
        this(brand);
        this.owner = owner;
    }

    public Car (String brand, String owner, String number) {
        this(brand, owner);
        this.number = number;
    }
    public String getInfo () {
        String result = this.number+ " "+ this.owner + " "+ this.brand;
        return result;
    }


}

