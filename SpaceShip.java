public class SpaceShip {
    private String name;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (!serialNumber.substring(0,2).equals("SN") || serialNumber.length() != 8) {
            return;
        }
        this.serialNumber = serialNumber;
    }

    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name is " + getName() + ", serial number is " + getSerialNumber());

    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }

}