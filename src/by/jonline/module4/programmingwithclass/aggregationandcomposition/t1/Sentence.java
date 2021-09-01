package module4.programmingwithclass.aggregationandcomposition.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Sentence {
    private List<Word> words;
    private String sentence;
    private char punctuationMarkEnd = '.';

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }

    public Sentence(ArrayList<Word> words, char punctuationMarkEnd) {
        this.words = words;
        this.punctuationMarkEnd = punctuationMarkEnd;
    }

    public Sentence(Word... words) {
        this.words = new ArrayList<>(Arrays.asList(words));
    }

    public Sentence(char punctuationMarkEnd, Word... words) {
        this.words = Arrays.asList(words);
        this.punctuationMarkEnd = punctuationMarkEnd;
    }

    private void makeSentence() {
        StringBuilder s = new StringBuilder();
        for (Word word : words) {
            s.append(word.getWord()).append(' ');
        }
        this.sentence = (s.substring(0, 1).toUpperCase() + s.substring(1)).trim() + punctuationMarkEnd;
    }

    public void add(Word word) {
        words.add(word);
    }

    public void add(int position, Word word) {
        words.add(position - 1, word);
    }

    public void remove(int position) {
        words.remove(position - 1);
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public char getPunctuationMarkEnd() {
        return punctuationMarkEnd;
    }

    public void setPunctuationMarkEnd(char punctuationMarkEnd) {
        this.punctuationMarkEnd = punctuationMarkEnd;
    }

    public String getSentence() {
        makeSentence();
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return punctuationMarkEnd == sentence1.punctuationMarkEnd &&
                Objects.equals(words, sentence1.words) &&
                Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, sentence, punctuationMarkEnd);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                ", sentence='" + sentence + '\'' +
                ", punctuationMarkEnd=" + punctuationMarkEnd +
                '}';
    }
}
