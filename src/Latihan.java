package Modul2Latihan;

import java.util.ArrayList;

public class Latihan {

    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("\nHewan : ");
        System.out.println(hewan);

        hewan.remove(1);
        hewan.remove(1);
        hewan.remove(1);

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("\nHewan yang dihapus");
        System.out.println(deleteHewan);

        System.out.println("\nOutput Hewan : ");
        System.out.println(hewan);
    }
}