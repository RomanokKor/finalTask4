package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String rightAnswer = "Заархивированный вирус";
        Scanner s = new Scanner(System.in);

        boolean gotRightAnswer = false;

        System.out.print("Загадка: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"\nВаш ответ: ");
        for (int i = 0; i < 3; i++) {
            String answer = s.nextLine();
            if (answer.equalsIgnoreCase("подсказка")) {
                if (i == 0) {
                    System.out.print("Это не лук!\nВаш ответ: ");
                    String answerWithHelp = s.nextLine();
                    if (answerWithHelp.equalsIgnoreCase(rightAnswer)) {
                        System.out.print("Правильно!");
                        gotRightAnswer = true;
                    } break;
                } else {
                    System.out.print("подсказка уже недоступна\nВаш ответ: ");
                    answer = s.nextLine();
                }
            }

            if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Правильно!");
                gotRightAnswer = true;
                break;
            } else
            if (i < 2) {
                System.out.print("Подумай еще!\nВаш ответ: ");
            }
        }
        if (!gotRightAnswer) {
            System.out.print("Обидно, приходи в другой раз.");
        }
    }
}
