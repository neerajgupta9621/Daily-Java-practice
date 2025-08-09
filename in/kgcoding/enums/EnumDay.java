package in.kgcoding.enums;

public enum EnumDay {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Main {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week:\n");
        for (EnumDay EnumDay : EnumDay.values()) {
            System.out.println(EnumDay);
        }
    }
}