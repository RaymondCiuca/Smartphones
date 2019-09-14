import java.util.Scanner;

 class SmartphonesType {
    
    public SmartPhoneInfo OfficeSmartphone() {
    	SmartPhoneInfo smartphone = new SmartPhoneInfo();
        smartphone.addItem(new GalaxyNote10());
        smartphone.addItem(new Iphone11());
        return smartphone;
    }

    public SmartPhoneInfo HomeSmartphone() {
    	SmartPhoneInfo smartphone = new SmartPhoneInfo();
        smartphone.addItem(new GalaxyS9());
        smartphone.addItem(new HuaweiP30());
        return smartphone;
    }

    public SmartPhoneInfo ChooseSmartphone(){
    	SmartPhoneInfo smartphone= new SmartPhoneInfo();
        AndroidSystem.showAndroidSystem();
        System.out.println("Choose Android Smartphone: ");
        Scanner scanner = new Scanner(System.in);
        String androidsystemType = scanner.next();
        AndroidSystem phones = AndroidSystemFactory.getAndroidSystemType(androidsystemType);
        if(phones != null) {
            smartphone.addItem(phones);
        }

        IosSystem.showIosSystem();
        System.out.println("Choose IOS Smartphone: ");
        String iossystemType = scanner.next();
        IosSystem phone1 = IosSystemFactory.getIosSystemType(iossystemType);
        if(phone1 != null) {
            smartphone.addItem(phone1);
        }

        return smartphone;
    }

}
