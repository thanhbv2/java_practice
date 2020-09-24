package interfacedemo;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Player player = new Player("007", 10, 17, "test");
        System.out.println(player.toString());
        saveObject(player);

        player.setHiPoints(2222);
        System.out.println(player);
        player.setWeapon("thanh");
        saveObject(player);
        loadObject
                (player);
        System.out.println(player);
    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                    "1 to enter a string\n" +
                    "0 to quit"
                );
        while (!quit){
            System.out.println("choose an option");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return  values;
    }

    public  static void saveObject(ISaveable objToSave){
        for (int i = 0; i < objToSave.write().size(); i++) {
            System.out.println("Saving" + objToSave.write().get(i) + "to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
