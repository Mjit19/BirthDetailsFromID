import java.util.Arrays;

public class BirthDetailsFromID {
    private String id;
    private int[] list;

    public BirthDetailsFromID(String id) {
        this.id = id;
        this.list = new int[this.id.length()];
    }

    public int[] getDetails() {
        for (int i = 0; i < this.id.length(); i++) {
            this.list[i] = Character.getNumericValue(this.id.charAt(i));
        }
        return this.list;
    }

    public boolean checkIfDigit() {
        for (int i = 0; i < this.id.length(); i++) {
            if (!Character.isDigit(this.id.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public int getDate() {
        int date = list[0] * 10 + list[1];
        return date;
    }

    public String getMonth() {
        int month = list[2] * 10 + list[3];
        switch (month) {
            case 1:
            return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    public String getYear() {
        int year = list[4] * 10 + list[5];
        if (year > 9 && year <= 23) {
            return "20" + year;
        } else if (year >= 0 && year <= 9) {
            return "200" + year;
        }
        return "19" + year;
    }

    public boolean checkId() {
        if (this.id.length() != 13 || !checkIfDigit()) {          
            return false;
        } else if (getDate() > 31 || getDate() < 1) {
            return false;
        } else if (getMonth().equals("Invalid month")) {
            return false;
        }
        return true;
    }

    

    
}