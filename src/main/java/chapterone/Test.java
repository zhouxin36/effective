package chapterone;

/**
 * 枚举单例
 */
public class Test {

    public static void main(String[] args) {

//        LAndl();
//        lAndl();
//        LAndL();
//        lAndL();
    }

    private static void LAndl() {
        //6816
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(sum);
    }

    private static void lAndl() {
        //738
        long start = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(sum);
    }

    private static void LAndL() {
        //13064
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(sum);
    }

    private static void lAndL() {
        //6663
        long start = System.currentTimeMillis();
        long sum = 0;
        for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(sum);
    }

}
