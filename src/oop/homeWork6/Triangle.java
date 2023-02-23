package oop.homeWork6;

public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

        public Triangle() {

            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        }

        public double getFirstSide() {
            return firstSide;
        }

        public double getSecondSide() {
            return secondSide;
        }

        public double getThirdSide() {
            return thirdSide;
        }

        public void setFirstSide(double firstSide) {
            this.firstSide = firstSide;
        }

        public void setSecondSide(double secondSide) {
            this.secondSide = secondSide;
        }

        public void setThirdSide(double thirdSide) {
            this.thirdSide = thirdSide;
        }

        public void getInfo() {
            System.out.println("First side: " + firstSide);
            System.out.println("Second side: " + secondSide);
            System.out.println("Third side: " + thirdSide);
        }

        public void trianglePerimeter(double trianglePerimeter) {

            trianglePerimeter = firstSide + secondSide + thirdSide;
            System.out.println("Периметр трикутника: " + trianglePerimeter);

        }


        public void triangleArea() {

            double semiPerimeter = (firstSide + secondSide + thirdSide)/2;
            double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide)
            * (semiPerimeter - thirdSide));

            System.out.println("Площа трикутника: " + triangleArea);

        }


}