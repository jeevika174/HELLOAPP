package org.example;
public class User_class_6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String result = "";
            if (nameBuilder.length() > 0) {
                result = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            System.out.println("Hello, " + result + "!");
        }
    }
}