package february.firstWeek.Sunday;

import java.util.Objects;

public class SoftDrink {

    String name;
    String company;
    double price;

    public SoftDrink(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftDrink drink = (SoftDrink) o;
        return Double.compare(drink.price, price) == 0 &&
                Objects.equals(name, drink.name) &&
                Objects.equals(company, drink.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, price);
    }

    @Override
    public String toString() {
        return "SoftDrink{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
