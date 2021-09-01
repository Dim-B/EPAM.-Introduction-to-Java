package module4.programmingwithclass.aggregationandcomposition.t1;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Printer {
    public void print(Text text) {
        System.out.println(text.getText());
    }

    public void print(Sentence sentence) {
        System.out.println(sentence.getSentence());
    }

    public void print(Word word) {
        System.out.println(word.getWord());
    }

    public void printTitle(Text text) {
        print(text.getTitle());
    }

    @Override
    public String toString() {
        return "Printer{}";
    }
}
