import java.util.Arrays;

public class BirthDetailsFromID {
    private String id;

    public BirthDetailsFromID(String id) {
        this.id = id;
    }

    public int[] getDetails() {
        int[] list = new int[6];
        for (int i = 0; i < 6; i++) {
            list[i] = Character.getNumericValue(this.id.charAt(i));
        }
        return list;
    }

    /* public boolean checkId() {
        // if (this.id != 13 || this.id);
        
    }

    public int getDate() {
        for (int i = 0; i < 2; i++) {
            // System.out.print(id[i]);
        }
    } */
}