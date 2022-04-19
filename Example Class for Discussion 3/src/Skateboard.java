public class Skateboard {

    // this would probably be pulled from some outside source
    public static double avgPrice = 160.87;


    // private instance fields
    private String wheelBrand;
    private int wheelDurability;
    private int wheelSize;
    private String deckBrand;
    private int deckPlyNum;
    private double turnRadius = 8;
    private String truckBrand;
    private int truckHeight;
    private int truckWidth;
    private String bearingBrand;
    private String gripTapeBrand;
    private double bearingRating;

    // getters and setters
    public static void setAvgPrice(double avgPrice) {
        Skateboard.avgPrice = avgPrice;
    }

    public void setWheelBrand(String wheelBrand) {
        this.wheelBrand = wheelBrand;
    }

    public void setWheelDurability(int wheelDurability) {
        this.wheelDurability = wheelDurability;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setDeckBrand(String deckBrand) {
        this.deckBrand = deckBrand;
    }

    public void setDeckPlyNum(int deckPlyNum) {
        this.deckPlyNum = deckPlyNum;
    }

    public void setTurnRadius(double turnRadius) {
        this.turnRadius = turnRadius;
    }

    public void setTruckBrand(String truckBrand) {
        this.truckBrand = truckBrand;
    }

    public void setTruckHeight(int truckHeight) {
        this.truckHeight = truckHeight;
    }

    public void setTruckWidth(int truckWidth) {
        this.truckWidth = truckWidth;
    }

    public void setBearingBrand(String bearingBrand) {
        this.bearingBrand = bearingBrand;
    }

    public void setBearingRating(double bearingRating) {
        this.bearingRating = bearingRating;
    }

    public void setGripTapeBrand(String gripTapeBrand) {
        this.gripTapeBrand = gripTapeBrand;
    }

    public static double getAvgPrice() {
        return avgPrice;
    }

    public String getWheelBrand() {
        return wheelBrand;
    }

    public int getWheelDurability() {
        return wheelDurability;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getDeckBrand() {
        return deckBrand;
    }

    public int getDeckPlyNum() {
        return deckPlyNum;
    }

    public double getTurnRadius() {
        return turnRadius;
    }

    public String getTruckBrand() {
        return truckBrand;
    }

    public int getTruckHeight() {
        return truckHeight;
    }

    public int getTruckWidth() {
        return truckWidth;
    }

    public String getBearingBrand() {
        return bearingBrand;
    }

    public double getBearingRating() {
        return bearingRating;
    }

    public String getGripTapeBrand() {
        return gripTapeBrand;
    }


    public Skateboard() {

    }

    // for creating a board with the default stats of a certain brand
    public Skateboard(String db, String tb, String wb, String bb, String gtb) {
        this.deckBrand = db;
        this.truckBrand = tb;
        this.wheelBrand = wb;
        this.bearingBrand = bb;
        this.gripTapeBrand = gtb;
    }

    // for when a board's configuration stats are known but the brands aren't
    public Skateboard(int tr, int br, int wd, int ws) {
        this.turnRadius = tr;
        this.bearingRating = br;
        this.wheelDurability = wd;
        this.wheelSize = ws;
    }

    // methods

    // n equals the number of half rotations on the truck tightening bolt
    public void tightenTrucks(int n) {
        for (int i = 0; i < n; ++i) {
            this.turnRadius += .15;
        }
    }

    public void loosenTrucks(int n) {
        for (int i = 0; i < n; ++i) {
            this.turnRadius -= .15;
        }
    }





}
