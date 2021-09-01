package module4.programmingwithclass.aggregationandcomposition.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Text {
    private List<Sentence> sentences;
    private String text;
    private Sentence title;

    public Text(Sentence title, ArrayList<Sentence> sentences) {
        this.title = title;
        this.sentences = sentences;
        makeText();
    }

    public Text(Sentence title, Sentence... sentences) {
        this.title = title;
        this.sentences = new ArrayList<Sentence>(Arrays.asList(sentences));
    }

    private void makeText() {
        StringBuilder t = new StringBuilder();
        for (Sentence sentence : sentences) {
            t.append(sentence.getSentence()).append(' ');
        }
        this.text = new String(t);
    }

    public void add(Sentence sentence) {
        sentences.add(sentence);
    }

    public void add(int position, Sentence sentence) {
        sentences.add(position - 1, sentence);
    }

    public void remove(int position) {
        sentences.remove(position - 1);
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public Sentence getTitle() {
        return title;
    }

    public void setTitle(Sentence title) {
        this.title = title;
    }

    public String getText() {
        makeText();
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + sentences +
                ", text='" + text + '\'' +
                ", title=" + title +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(sentences, text1.sentences) &&
                Objects.equals(text, text1.text) &&
                Objects.equals(title, text1.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences, text, title);
    }
}
