public class IosSystemFactory {
    public static IosSystem getIosSystemType(String iossystemType){
        switch(iossystemType) {
            case "IphoneX":
                return new IphoneX();
            case "Iphone11":
                return new Iphone11();
            default:
                return null;
        }
    }
}
