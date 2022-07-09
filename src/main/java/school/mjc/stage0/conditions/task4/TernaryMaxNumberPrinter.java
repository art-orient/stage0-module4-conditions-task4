package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first >= second && first >= third ? first : second;
        result = second >= third ? result : third;
        System.out.println(result);
    }
}
