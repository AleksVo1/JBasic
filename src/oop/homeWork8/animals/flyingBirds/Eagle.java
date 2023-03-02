package oop.homeWork8.animals.flyingBirds;

public class Eagle extends FlyingBirds implements Speed {

    private final double socketWeight;
    private final double speed;

    public Eagle(String color, int weight, double flightAltitude, double flightLength,
                 double socketWeight, double speed) {

        super(color, weight, flightAltitude, flightLength);
        this.socketWeight = socketWeight;
        this.speed = speed;
    }

    @Override
    public void color() {

        super.color();
    }

    @Override
    public void weight() {

        super.weight();
    }

    @Override
    public double getFlightAltitude() {

        return super.getFlightAltitude();
    }

    @Override
    public double getFlightLength() {

        return super.getFlightLength();
    }

    @Override
    public double speed() {

        return speed;
    }

    public double getSocketWeight() {

        return socketWeight;
    }
}
