    public class Date {
        private final int minYear = 1;
        private final int maxYear = 9999;
        private int day;
        private int year;
        private int month;
        private final String[] months = {"farvardin", "ordibehesht", "khordad", "tir", "mordad", "shahrivar"
                , "mehr", "aban", "azar", "dey", "bahman", "esfand"};

        public Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public Date() {

        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public boolean isValidDate(int year, int month, int day) {
            if (year < minYear || year > maxYear) {
                return false;
            }
            if (month < 1 || month > 12) {
                return false;
            }
            int totalDay = getMonthLastDay(month);

            if (day < 1 || totalDay > 31) {
                return false;
            }
            return true;
        }

        public int getMonthLastDay(int month) {
            if (month >= 1 && month <= 6) {
                return 31;
            } else
                return 30;
        }

    }