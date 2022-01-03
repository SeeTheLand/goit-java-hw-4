public class Stars {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        String result = "";
        int midVar = count;
        int counter = midVar/1000;
        midVar = midVar%1000;
        while (counter > 0) {
            result += "X";
            counter--;
        }
        counter = midVar/100;
        midVar = midVar%100;
        while (counter > 0) {
            result += "Y";
            counter--;
        }
        counter = midVar/10;
        midVar = midVar%10;
        while (counter > 0) {
            result += "Z";
            counter--;
        }
        counter = midVar;
        while (counter > 0) {
            result += "*";
            counter--;
        }

        return result;
    }
}
