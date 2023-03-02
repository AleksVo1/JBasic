package oop.homeWork8.animals.fish;

public class Carp extends Fish implements Gender{

    private final String gender;
    private final int jumpHeight;

    public Carp(String color, String weight, int divingDepth, String gender, int jumpHeight) {

        super(color, weight, divingDepth);
        this.gender = gender;
        this.jumpHeight = jumpHeight;
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

    public int jumpHeight() {

        return jumpHeight;
    }
}
