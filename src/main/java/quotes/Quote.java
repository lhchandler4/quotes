package quotes;

public class Quote {
    private String author;
    private String quote;

    public Quote(String author, String quote){
        this.author = author;
        this.quote = quote;
    }

    public String toString(){
        return String.format("%s wrote, %s", this.author, this.quote);
    }

}
