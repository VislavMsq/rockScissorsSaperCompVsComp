import java.util.Random;
import java.util.Scanner;

public class CompVsComp {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Напишите Start для начала игры!");
            String start = sc.nextLine();
            String compStep = makeCompStep();
            String comp2Step = makeComp2Step();
            String winner = checkWinner(comp2Step, compStep);
            System.out.println("Ход Компьютера №1: " + compStep + " " +
                    "Ход компьютера №2: " + comp2Step + " " + winner);
        }


    }

    public static String checkWinner(String comp1, String comp2) {
        String res = "";
        if (comp1.equals("Ножницы") && comp2.equals("Бумага")) {         // проверяем результат и записыаем его в переменную res
            res = "Победа компьютера №1!";                                 // охвращаем результат
        } else if (comp1.equals("Ножницы") && comp2.equals("Камень")) {
            res = "Победа компьютера №2!";
        } else if (comp1.equals("Бумага") && comp2.equals("Камень")) {
            res = "Победа компьютера №1!";
        } else if (comp1.equals("Бумага") && comp2.equals("Ножницы")) {
            res = "Победа компьютера №2!";
        } else if (comp1.equals("Камень") && comp2.equals("Ножницы")) {
            res = "Победа компьютера №1!";
        } else if (comp1.equals("Камень") && comp2.equals("Бумага")) {
            res = "Победа компьютера №2!";
        } else {
            res = "Ничья!";
        }
        return res;
    }

    public static String makeCompStep() {
        int rend = random.nextInt();
        String response = "";
        if (rend == 1) {
            response = "Камень";
        } else if (rend == 2) {
            response = "Бумага";
        } else {
            response = "Ножницы";
        }
        return response;
    }

    public static String makeComp2Step() {
        int rend2 = random.nextInt(3) + 1;
        String response2 = "";
        if (rend2 == 1) {
            response2 = "Камень";
        } else if (rend2 == 2) {
            response2 = "Бумага";
        } else {
            response2 = "Ножницы";
        }
        return response2;
    }
}

