public enum Weekday {
    MON, TUE, WED, THU,
    FRI, SAT, SUN;
    public boolean isWeekend() {
        return (this == SAT || 
                    this == SUN);
    }
}