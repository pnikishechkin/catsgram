package ru.nikishechkin.catsgram;

import ru.nikishechkin.catsgram.model.Image;

import java.util.Scanner;

public class CatsgramApp {
    public static void main(String[] args) {
//        final Gson gson = new Gson();
//        final Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите JSON => ");
//        final String input = scanner.nextLine();
//        try {
//            gson.fromJson(input, Map.class);
//            System.out.println("Был введён корректный JSON");
//        } catch (JsonSyntaxException exception) {
//            System.out.println("Был введён некорректный JSON");
//        }

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку => ");
        final String input = scanner.nextLine();
        final String encoded = org.apache.commons.codec.binary.Base64.encodeBase64String(
                input.getBytes()
        );
        System.out.println(encoded);

        Image hj = new Image();
        hj.setId(5L);
        hj.setFilePath("path");
        hj.setOriginalFileName("filename");
        System.out.println(hj.toString());

    }
}
