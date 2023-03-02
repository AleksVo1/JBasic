package oop.homeWork8.animals.fish;

public class CatFish extends Fish implements Gender{

    private final String gender;
    private final int mustacheLength;

    public CatFish(String color, String weight, int divingDepth, String gender, int mustacheLength) {

        super(color, weight, divingDepth);
        this.gender = gender;
        this.mustacheLength = mustacheLength;
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

    public int mustacheLength() {

        return mustacheLength;
    }
}
