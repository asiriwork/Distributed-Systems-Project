import java.util.ArrayList;

/**
 * Created by Tharindu Wijewardane on 2015-03-05.
 */
public class Util {

    public static final String IP = "10.8.108.128"; // my ip address
    public static final int PORT = 9902; // my port
    public static final String USERNAME = "abc"; // my username

    public static final String BS_IP = "10.8.108.128";
    public static final int BS_PORT = 9900;

    static ArrayList<String> allFiles = new ArrayList<String>();

    static {
        allFiles.add("Adventures of Tintin");
        allFiles.add("Jack and Jill");
        allFiles.add("Glee");
        allFiles.add("The Vampire Diarie");
        allFiles.add("King Arthur");
        allFiles.add("Windows XP");
        allFiles.add("Harry Potter");
        allFiles.add("Kung Fu Panda");
        allFiles.add("Lady Gaga");
        allFiles.add("Twilight");
        allFiles.add("Windows 8");
        allFiles.add("Mission Impossible");
        allFiles.add("Turn Up The Music");
        allFiles.add("Super Mario");
        allFiles.add("American Pickers");
        allFiles.add("Microsoft Office 2010");
        allFiles.add("Happy Feet");
        allFiles.add("Modern Family");
        allFiles.add("American Idol");
        allFiles.add("Hacking for Dummies");
    }

    /**
     * add the length value to the beginning of the message
     *
     * @param msg
     * @return
     */
    public static String formMessage(String msg) {
        String msgLength = String.format("%04d", msg.length() + 5);
        return msgLength + " " + msg;
    }

    /**
     * thread safely adding a neighbour
     *
     * @param n
     */
    public static synchronized void addNeighbour(Neighbour n) {
        Node.neighbours.add(n);
    }

    /**
     * thread safely deleting a neighbour
     *
     * @param n
     */
    public static synchronized void removeNeighbour(Neighbour n) {
        Node.neighbours.remove(n);
    }

}
