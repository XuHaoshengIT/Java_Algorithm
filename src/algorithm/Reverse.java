package algorithm;

public class Reverse {
    public static int reverse(int x) {
//        // The first solution: Using stack
//        long tmp = 0;
//
//        while(x != 0) {
//            tmp = tmp * 10 + x % 10;
//            x /= 10;
//        }
//
//        if(tmp >= Integer.MIN_VALUE && tmp <= Integer.MAX_VALUE) {
//            return (int)tmp;
//        } else {
//            return 0;
//        }

//        // The Second solution: Using the ternary operation
//        long tmp = 0;
//
//        while(x != 0) {
//            tmp = tmp * 10 + x % 10;
//            x /= 10;
//        }
//
//        return (int)tmp == tmp? (int)tmp: 0;
//    }

        // The Third solution: Using int type
//        int result = 0;
//        int tmp = 0;
//
//        while(x != 0) {
//            tmp = result;
//
//            result = result * 10 + x % 10;
//            x /= 10;
//
//            if(result / 10 != tmp) return 0;
//        }
//
//        return result;

        // The official solution:Using int type
        int tmp = 0;
        int pop = 0;

        while(x != 0) {
            pop = x % 10;
            x /= 10;

            if(tmp > Integer.MAX_VALUE / 10 || tmp == Integer.MAX_VALUE / 10 && pop > 7) return  0;
                if(tmp < Integer.MIN_VALUE /10 || tmp == Integer.MIN_VALUE / 10 && pop < -8) return 0;

            tmp = tmp * 10 + pop;
        }

        return tmp;
    }
}
