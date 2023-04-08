package oop.homeWork13.quadraticEquations;

public class Root {

    private final double x1;
    private final double x2;


    public Root(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Root(double x) {
        this.x1 = x;
        this.x2 = Double.NaN;
    }

    public Root() {
        this.x1 = Double.NaN;
        this.x2 = Double.NaN;
    }

    public boolean isEmpty(){

        return Double.isNaN(x1) && Double.isNaN(x2);
    }

    public int getCount(){
        if (Double.isNaN(x1) && Double.isNaN(x2)){
            return 0;
        }
        else if (Double.isNaN(x1)) {
            return 1;

        }

        else {
            return 2;
        }
    }

    @Override
    public String toString() {
        if (Double.isNaN(x1) && Double.isNaN(x2)) {
            return "Рівняння не має коренів.";
        } else if (Double.isNaN(x2)) {
            return "Рівняння ax^2 + bx + c = 0 має корені: x = " + x1;
        } else {
            return "Рівняння ax^2 + bx + c = 0 має корені: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    public boolean contains(double x){

        return x == x1 || x == x2;
    }

}
