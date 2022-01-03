public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        while (n > 0) {
            result += n;
            n--;
        }
        return result;
    }

}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        if (n == 0) return 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        if (n == 0) return 1;
        while (n > 0) {
            if (n%2 != 0) result *= n;
            n--;
        }
        return result;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        while (n > 0) {
            if (n % 3 == 0 ^ n % 5 == 0) result += n;
            n--;
        }
        return result;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        while (n > 0) {
            if (n % 2 == 0) result += n;
            n--;
        }
        return result/2;
    }
}

