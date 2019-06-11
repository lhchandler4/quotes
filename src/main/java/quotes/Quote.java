package quotes;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Quote {
    private String author;
    public String text;
    private String likes;
    private ArrayList<String> tags;

    public Quote(String author, String text, String likes){
        this.author = author;
        this.text = text;
        this.likes = likes;
    }

    public Quote(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
    public String toString(){
//        return String.format("%s", this.text);
        return String.format("%s wrote, %s The quote got %s", this.author, this.text, this.likes);
    }

    public String toStringRon(){
        return String.format("Ron Swanson once said, %s", this.text);
    }

}
