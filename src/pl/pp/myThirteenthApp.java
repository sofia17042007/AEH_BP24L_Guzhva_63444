import java.io.*;
import java.util.*;

public class myThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile;

        // Запрос корректного пути к входному файлу
        while (true) {
            System.out.print("Введите путь к входному файлу: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);
            if (!inputFile.exists()) {
                System.out.println("Файл не найден. Попробуйте еще раз.");
            } else {
                break;
            }
        }

        System.out.print("Введите путь к выходному файлу: ");
        String outputPath = scanner.nextLine();

        Map<String, Integer> wordCountMap = new HashMap<>();
        int totalWords = 0;

        // Чтение файла и подсчет слов
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку на слова по пробелам и знакам препинания
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (word.isEmpty()) continue;
                    totalWords++;
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
            return;
        }

        // Вывод результатов в консоль
        System.out.println("Имя файла: " + inputFile.getName());
        System.out.println("Общее количество слов: " + totalWords);
        System.out.println("Статистика по словам:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Запись результатов в выходной файл
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("Имя файла: " + inputFile.getName());
            writer.println("Общее количество слов: " + totalWords);
            writer.println("Статистика по словам:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Результаты успешно записаны в файл: " + outputPath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в выходной файл.");
        }
    }
}
