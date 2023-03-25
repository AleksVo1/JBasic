package main.java.oop.homeWork8.animals.fish;

public class Pike extends Fish implements Gender{

    private final String gender;
    private final int teethСount;

    public Pike(String color, String weight, int divingDepth, String gender, int teethСount) {

        super(color, weight, divingDepth);
        this.gender = gender;
        this.teethСount = teethСount;
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
    public int getDivingDepth() {

        return super.getDivingDepth();
    }

    @Override
    public String gender() {

        return gender;
    }

    public int getTeethСount() {

        return teethСount;
    }
}
