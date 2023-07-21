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

    public int getMonth() {
        int month = list[2] * 10 + list[3];
        return month;
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
        } else if (getMonth() > 12 || getMonth() < 1) {
            return false;
        }
        return true;
    }

    

    
}