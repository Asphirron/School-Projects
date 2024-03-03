package reviewer_requiem_v2;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//import java.util.ArrayList;

public class Utilities{
    static Scanner scan = new Scanner(System.in);

    //Print Methods
    static void print(String text){
        System.out.print(text);
    }
    static void println(String text){
        System.out.println(text);
    }

    static void printOrderedList(String listItems){
        String[] items = listItems.split(",");
        int order = 0;
        for(String item : items){
            order++;
            println(order + ". " + item );
        }
    }
    static void printOrderedList(String[] listItems){
        int order = 0;
        for(String item : listItems){
            order++;
            println(order + ". " + item );
        }
    }
    
    static void newLine(int lineSkips){
        for(int i = 0; i < lineSkips; i++){
            println("\n");
        }
    }
    
    //Text Methods
    

    public static String generateRandomString(int length) {
        StringBuilder randomString = new StringBuilder(length);
        final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final SecureRandom random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARACTERS.length());
            char randomChar = ALLOWED_CHARACTERS.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

    //Input Methods
    static String input(String message){
        print(message + ": ");
        String output = scan.nextLine();
        return output;
    }

    static int validateInt(String message){
        int output = 0; boolean loop = true;
        while(loop){
            print(message + ": ");
            String temp = scan.nextLine();
            try{
                output = Integer.parseInt(temp);
                loop = false;
            }catch(NumberFormatException e){
                println("Invalid input! Please try again.");
            }
        }
        return output;
    }

    //Math Methods

    static double getPercentage(double score, double limit){
        double result = score/limit * 100;
        return result;
    }
    static String shortenDecimal(double decimal){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(decimal);
        return result;
    }
    public static int generateRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    

    //Lists Manipulation
    public static <T> T[] randomizeArray(T[] array) {
        List<T> list = Arrays.asList(array);
        Collections.shuffle(list);
        return list.toArray(array.clone());
    }
    public static <T> ArrayList<T> randomizeArrayList(ArrayList<T> arrayList) {
        List<T> list = new ArrayList<>(arrayList);
        Collections.shuffle(list);
        return new ArrayList<>(list);
    }

    public static <T> ArrayList<T> copyArrayList(List<T> source) {
        return new ArrayList<>(source);
    }

    public static ArrayList<String> addRandomStrings(ArrayList<String> list, int numberOfStrings) {
        
        for (int i = 0; i < numberOfStrings; i++) {
            String randomString = generateRandomString(10);
            list.add(randomString);
        }

        return list;
    }


    //Date and Time
    public static String getDateAndTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDateTime.format(formatter);
    }
    public String formatDateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}