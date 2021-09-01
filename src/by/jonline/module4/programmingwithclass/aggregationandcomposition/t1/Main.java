package module4.programmingwithclass.aggregationandcomposition.t1;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Main {
    public static void main(String[] args) {
        Text text = new Text(new Sentence(' ', new Word("Грибы")),
                new Sentence(new Word("ребята"), new Word("пошли"), new Word("в"), new Word("лес"), new Word("за"), new Word("грибами")),
                new Sentence(new Word("Рома"), new Word("нашел"), new Word("под"), new Word("березой"), new Word("красивый"), new Word("подберезовик")),
                new Sentence(new Word("Валя"), new Word("увидела"), new Word("под"), new Word("сосной"), new Word("маленький"), new Word("масленок")),
                new Sentence(new Word("Сережа"), new Word("разглядел"), new Word("в"), new Word("траве"), new Word("огромный"), new Word("боровик")),
                new Sentence(new Word("в"), new Word("роще"), new Word("они"), new Word("набрали"), new Word("полные"), new Word("корзины"), new Word("разных"), new Word("грибов")));

        Printer printer = new Printer();

        //создаем предложение
        Sentence sentence = new Sentence(new Word("Ребята"), new Word("очень"), new Word("веселые"), new Word("вернулись"), new Word("домой"));
        printer.print(sentence);

        //удаляем слово из предложения
        sentence.remove(2);
        printer.print(sentence);

        //добавляем слова в предложение на указанные позиции
        sentence.add(3, new Word("и"));
        sentence.add(4, new Word("довольные"));
        printer.print(sentence);

        //добавляем предложение в текст
        text.add(sentence);

        printer.printTitle(text);
        printer.print(text);

    }
}
