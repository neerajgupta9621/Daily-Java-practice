package in.kgcoding.enums;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Weekday" : "Weekend";
    }

    public static void main(String[] args) {
        System.out.println("Enhance the day and week day and weekend");
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n", day, day.getType());
        }
    }
}
