package module3.string.stringandstringbuilder;

/*
10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */
public class T10CountSentence {
    public static void main(String[] args) {
        String str = "Предполагается, что интерфейс предоставляет своего рода «шлюз» к нескольким альтернативным реализациям. Типичным способом получения объектов, соответствующих интерфейсу, является паттерн «фабрика». Вместо того, чтобы вызывать конструктор напрямую, вы вызываете метод объекта-фабрики, который предоставляет реализацию интерфейса — в этом случае программный код теоретически отделяется от реализации интерфейса, благодаря чему становится возможной совершенно прозрачная замена реализации.";

        System.out.println("Количество предложений в строке: " + countSentence(str));
    }

    private static int countSentence(String str) {
        int count = 0;
        int posStart;
        int posDot;
        int posExclamation;
        int posQuestion;

        posDot = str.indexOf(".");
        posExclamation = str.indexOf("!");
        posQuestion = str.indexOf("?");

        while (posDot != -1) {
            count++;
            posStart = posDot + 1;
            posDot = str.indexOf(".", posStart);
        }

        while (posExclamation != -1) {
            count++;
            posStart = posExclamation + 1;
            posExclamation = str.indexOf("!", posStart);
        }

        while (posQuestion != -1) {
            count++;
            posStart = posQuestion + 1;
            posQuestion = str.indexOf("?", posStart);
        }

        return count;
    }
}
