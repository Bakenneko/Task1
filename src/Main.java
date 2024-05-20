public class Main {
    public static void main(String[] args) {

        Main obj = new Main();
        int result = obj.k(6,6);
        System.out.println(result);

    }

    int k(int a, int b) {
        if (a < b) {
            if (b > 4) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (a > 4) {
                return 2;
            } else {
                return 3;
            }
        }
    }

}

//        int g (int a) {
//            if (a < 9) {
//                return 9;
//            } if (a < 7) {
//                return 7;
//            } if (a < 4) {
//                return 4;
//            }
//
//            return 0;
//        }
//    int func2(int w) {
//        return w * 3;
//    }
//
//    int func1(int a, int b) {
//        int n = a + b;
//        return 2 + func2(n);
//    }
//
//    int start() {
//        int z = 4;
//        return func1(z, 1) - 3;
//    }
//}

//        Main obj = new Main();
//        int result = obj.start();
//        System.out.println(result);

