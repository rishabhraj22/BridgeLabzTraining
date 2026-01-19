package com.BagnBallOrganizer;
class Ball implements Storable {

    private String id;
    private String color;
    private String size; // small / medium / large

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    @Override
    public void showInfo() {
        System.out.println("Ball ID: " + id +
                " | Color: " + color +
                " | Size: " + size);
    }
}
