public class EarthVolumeCalculator {
    public static void main(String[] args) {

        double radiusInKilometers = 6378;
        double pi = Math.PI;

        double volumeInKilometers =
                (4.0 / 3.0) * pi * Math.pow(radiusInKilometers, 3);

        double cubicKilometersPerCubicMile = 4.16818;

        double volumeInMiles = volumeInKilometers / cubicKilometersPerCubicMile;

        System.out.println("The volume of earth in cubic kilometers is "
                + volumeInKilometers +
                " and cubic miles is "
                + volumeInMiles);
    }
}