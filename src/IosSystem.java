public abstract class IosSystem implements Item {

    @Override
    public abstract float getPrice();

    @Override
    public abstract String getName();

    @Override
    public abstract String getMemory();

    public static void showIosSystem() {
        System.out.println();
        System.out.println("Existing IOS phones:");
        System.out.println("Iphone X");
        System.out.println("Iphone 11");
    }


}
