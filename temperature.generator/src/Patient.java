import java.util.Random;

public class Patient {
    Random r = new Random();
    double min = 32;
    double max = 40;
    String name;
    double temp;
    double randomtemp = min + (max - min) * r.nextDouble();

}
