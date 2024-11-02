import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        String tmp = localDate.getDayOfWeek().toString().toLowerCase();
        return (tmp.charAt(0) + "").toUpperCase() + tmp.substring(1);
    }
}