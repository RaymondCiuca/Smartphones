public abstract class AndroidSystem implements Item {

    @Override
    public abstract String getName();

    @Override
    public abstract float getPrice();

    @Override
    public abstract String getMemory();

    public static void showAndroidSystem() {
        System.out.println();
        System.out.println("Existing Android phones:");
        System.out.println("Galaxy S10");
        System.out.println("Galaxy S9");
        System.out.println("Galaxy Note 10");
        System.out.println("Huawei P30");
        System.out.println("Google Pixel");
    }
}
