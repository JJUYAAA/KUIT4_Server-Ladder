package ladder;

public class GreaterThanOne {

    private final int number;

    public GreaterThanOne(int number) {
        validate(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static GreaterThanOne from(int number) {
        return new GreaterThanOne(number);
    }

    private void validate(int number) {
        if (!isGreaterThanOne(number)) {
            throw new IllegalArgumentException("2 이상의 수가 아닙니다.");
        }
    }

    private static boolean isGreaterThanOne(int number) {
        return number > 1;
    }
}