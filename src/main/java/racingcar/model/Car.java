package racingcar.model;

public class Car {

    private int position = 0;
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public void move(int number) {
        if (number >= 4 && number <= 9) {
            position = position + 1;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
