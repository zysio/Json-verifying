package org.example;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/data.json";
        json_verifying j = new json_verifying(path);
        System.out.println(j.verify());
    }
}