package br.com.projeto.dominio;

public abstract class Content {

    protected static final double CONCLUSION = 20d;

    private String title;

    private String description;

    public abstract double calculateConclusion();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
