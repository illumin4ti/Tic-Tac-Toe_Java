//put imports you need here
import java.util.*;

class Main {
    public static void main(String[] args) {
        try (// put your code here
             Scanner guests = new Scanner(System.in)) {
            ArrayList<String> guestList = new ArrayList<>(8);
            String[] doubleRoom = new String[2];
            for (int i = 0; i < doubleRoom.length; i++) {
                doubleRoom[i] = guests.next();
                guestList.add(doubleRoom[i]);
            }
            String[] oneRoom = new String[1];
            for (int i = 0; i < oneRoom.length; i++) {
                oneRoom[i] = guests.next();
                guestList.add(oneRoom[i]);
            }

            String[] threeRoom = new String[3];
            for (int i = 0; i < threeRoom.length; i++) {
                threeRoom[i] = guests.next();
                guestList.add(threeRoom[i]);
            }
            String[] double2Room = new String[2];
            for (int i = 0; i < double2Room.length; i++) {
                double2Room[i] = guests.next();
                guestList.add(double2Room[i]);
            }
            Collections.sort(guestList);
            for (int i = 0; i < guestList.size(); i++) {
                System.out.println(guestList.get(i));
            }
        }
    }
}