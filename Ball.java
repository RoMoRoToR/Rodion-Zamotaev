package ikbo2519pr1;
import java.lang.*;

public class Ball {
    private double Volume;
    private String color;

    public Ball(double volume, String color) {
        Volume = volume;
        this.color = color;
    }

    public Ball(String color) {
        this.color = color;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "Volume=" + Volume +
                ", color='" + color + '\'' +
                '}';
    }
}