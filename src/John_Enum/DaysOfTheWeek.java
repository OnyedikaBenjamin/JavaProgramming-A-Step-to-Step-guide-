package John_Enum;

public enum DaysOfTheWeek {
    SUNDAY(4),
    MONDAY(5),
    TUESDAY(7),
    WEDNESDAY(2),
    THURSDAY(1),
    FRIDAY(3),
    SATURDAY(6);
    final int preferredDayRating;   // We make this field final because we don't want it to be modified.

    DaysOfTheWeek(int preferredDayRating) {           //creating a constructor in Enum, we use the default Access Modifier.
        this.preferredDayRating = preferredDayRating;
    }
}
