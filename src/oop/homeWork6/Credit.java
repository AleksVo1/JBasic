package oop.homeWork6;

public class Credit {

    private int creditTerm;
    private double percent;
    private double creditAmount;
    private double downPayment;

    public Credit(int creditTerm, double percent, double creditAmount, double downPayment) {
        this.creditTerm = creditTerm;
        this.percent = percent;
        this.creditAmount = creditAmount;
        this.downPayment = downPayment;
    }

    public int getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(int creditTerm) {
        this.creditTerm = creditTerm;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

}
