package main.java.oop.homeWork9;

public enum Size {

    XS("Extra Small", 1, 1),
    S("Small", 2, 2),
    M("Medium", 3, 3),
    L("Large", 4, 4),
    XL("Extra Large", 5, 5),
    XXL("Extra Extra Large", 6, 6);

    private final String size;
    private final int width;
    private final int length;

    Size(String size, int width, int length) {

        this.size = size;
        this.width = width;
        this.length = length;
    }

    public String getSize() {

        return size;
    }

    public int getWidth() {

        return width;
    }

    public int getLength() {

        return length;
    }
}
