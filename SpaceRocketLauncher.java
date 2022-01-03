public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount > 100) {
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 || smallRocketCount > 100) {
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            System.out.println("Launch big rocket");
            bigRocketCount--;
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
            System.out.println("Launch small rocket");
            smallRocketCount--;
        }
    }

    public int getTotalPower() {
        return (bigRocketCount * 100 + smallRocketCount * 50);
    }
}
