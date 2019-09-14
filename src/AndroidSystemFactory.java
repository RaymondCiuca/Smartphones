public class AndroidSystemFactory {
    public static AndroidSystem getAndroidSystemType(String androidsystemType){
        switch(androidsystemType) {
            case "GalaxyS10":
                return new GalaxyS10();
            case "GalaxyS9":
                return new GalaxyS9();
            case "GalaxyNote10":
                return new GalaxyNote10();
            case "HuaweiP30":
                return new HuaweiP30();
            case "GooglePixel":
                return new GooglePixel();
            default:
                return null;
        }
    }
}
