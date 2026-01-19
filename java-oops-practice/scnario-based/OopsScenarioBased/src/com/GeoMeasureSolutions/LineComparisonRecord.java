package com.GeoMeasureSolutions;
class LineComparisonRecord {

    private Line line1;
    private Line line2;

    public LineComparisonRecord(Line line1, Line line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    public void compare() {
        double len1 = line1.calculateLength();
        double len2 = line2.calculateLength();

        line1.showLine();
        System.out.println("Length = " + len1);

        line2.showLine();
        System.out.println("Length = " + len2);

        if (len1 == len2) {
            System.out.println("✅ Both lines are equal in length");
        } else if (len1 > len2) {
            System.out.println("📏 Line 1 is longer");
        } else {
            System.out.println("📏 Line 2 is longer");
        }

        System.out.println("--------------------------------");
    }
}
