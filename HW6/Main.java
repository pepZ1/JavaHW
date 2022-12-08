package HW6;

import java.util.List;
import java.util.Scanner;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем HHD или SSD
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 */
public class Main {
    public static List<Notebook> notebooks = List.of(
            new Notebook(64, 200, HardDisk.HHD, OS.IOS, Color.RED),
            new Notebook(32, 300, HardDisk.SSD, OS.LINUX, Color.BLACK),
            new Notebook(64, 400, HardDisk.HHD, OS.WINDOWS, Color.GREEN),
            new Notebook(32, 500, HardDisk.SSD, OS.IOS, Color.WHITE),
            new Notebook(64, 600, HardDisk.HHD, OS.IOS, Color.RED),
            new Notebook(32, 700, HardDisk.SSD, OS.WINDOWS, Color.BLACK));

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Выберите критерий по которому хотите отфильтровать:
                    1 - RAM
                    2 - Объём жёсткого диска
                    3 - Тип жёсткого диска
                    4 - Цвет
                    5 - Выход""");
            switch (filterCriterion()) {
                case "1" -> printRam();
                case "2" -> printHardDriveShaft();
                case "3" -> printTypeHardDisk();
                case "4" -> printColor();
                case "5" -> {
                    return;
                }
            }
        }
    }

    private static String filterCriterion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        return scanner.nextLine();
    }

    private static void printRam() {
        System.out.println("""
                1. RAM: 32
                2. RAM: 64""");
        if (filterCriterion().equals("1")) {
            for (Notebook notebook : notebooks) {
                if (notebook.ram == 32) {
                    System.out.println(notebook);
                }
            }
        } else {
            for (Notebook notebook : notebooks) {
                if (notebook.ram == 64) {
                    System.out.println(notebook);
                }
            }
        }
    }

    private static void printHardDriveShaft() {
        System.out.println("Введите объём жёсткого диска: ");
        String hardDriveShaft = filterCriterion();
        for (Notebook notebook : notebooks) {
            if (notebook.hardDriveShaft == Integer.parseInt(hardDriveShaft)) {
                System.out.println(notebook);
            }
        }
    }

    private static void printTypeHardDisk() {
        System.out.println("""
                1. HHD
                2. SSD""");
        if (filterCriterion().equals("1")) {
            for (Notebook notebook : notebooks) {
                if (notebook.hardDisk == HardDisk.HHD) {
                    System.out.println(notebook);
                }
            }
        } else {
            for (Notebook notebook : notebooks) {
                if (notebook.hardDisk == HardDisk.SSD) {
                    System.out.println(notebook);
                }
            }
        }
    }

    private static void printColor() {
        System.out.println("""
                1. Red
                2. Black
                3. White
                4. Green""");
        Color color = filterCriterion().equals("1") ? Color.RED
                : filterCriterion().equals("2") ? Color.BLACK
                        : filterCriterion().equals("3") ? Color.WHITE
                                : filterCriterion().equals("4") ? Color.GREEN
                                        : null;
        for (Notebook notebook : notebooks) {
            if (notebook.color == color) {
                System.out.println(notebook);
            }
        }
    }
}