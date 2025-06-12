package pl.pp;
import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = null;

        while (true) {
            System.out.print("Введите путь к входному файлу: ");
            String inputPath = scanner.nextLine();

            inputFile = new File(inputPath);
            if (!inputFile.exists()) {
                System.out.println("Файл не существует. Попробуйте снова.");
            } else {
                break;
            }
        }

        System.out.print("Введите путь к выходному файлу: ");
        String outputPath = scanner.nextLine();

        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Количество строк во входном файле: " + lineCount);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("Имя файла: " + inputFile.getName());
            writer.println("Количество строк: " + lineCount);
            System.out.println("Информация успешно записана в выходной файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в выходной файл.");
        }
    }
}
