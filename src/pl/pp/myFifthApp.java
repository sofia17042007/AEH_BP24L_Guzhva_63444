public class myFifthApp {
    public static void main(String[] args) {
        printCharBlock('*', 5, 3); // пример вызова
    }

    static void printCharBlock(char symbol, int countPerLine, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < countPerLine; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

