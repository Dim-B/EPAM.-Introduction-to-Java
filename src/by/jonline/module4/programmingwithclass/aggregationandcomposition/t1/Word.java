package module4.programmingwithclass.aggregationandcomposition.t1;

import java.util.Objects;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Word {
    private String word;

    public Word(String value) {
        this.word = value;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "value='" + word + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(this.word, word.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
