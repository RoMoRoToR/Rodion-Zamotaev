package ikbo2519pr1;
import java.lang.String.*;
public class Book {
    private String name;
    private double numberofpages;

    public Book(String name, double numberofpages) {
        this.name = name;
        this.numberofpages = numberofpages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberofpages() {
        return numberofpages;
    }

    public void setNumberofpages(double numberofpages) {
        this.numberofpages = numberofpages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name=" + name +
                ", number_of_pages=" + numberofpages +
                '}';
    }
}
