public class Main {

    public static void main(String[] args) {

        SmartphonesType SmartphonesType = new SmartphonesType();

        SmartPhoneInfo officeSmartphone = SmartphonesType.OfficeSmartphone();
        System.out.println("Office Smartphone");
        officeSmartphone.showItems();
        System.out.println("Total Cost: " + officeSmartphone.getCost());

        SmartPhoneInfo homeSmartphone = SmartphonesType.HomeSmartphone();
        System.out.println("Home Smartphone");
        homeSmartphone.showItems();
        System.out.println("Total Cost: " + homeSmartphone.getCost());

        SmartPhoneInfo chooseSmartphone = SmartphonesType.ChooseSmartphone();
        System.out.println("Custom Smartphone");
        chooseSmartphone.showItems();
        System.out.println("Total Cost: " + chooseSmartphone.getCost());

    }


}
