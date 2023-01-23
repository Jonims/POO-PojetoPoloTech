package br.com.projeto.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Program {

    private String name;

    private String description;

    private final LocalDate dateBegin = LocalDate.now();

    private final LocalDate dateFinal = dateBegin.plusMonths(5);

    private Set<Developer> developerRegister = new HashSet<>();

    private Set<Content> content = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateBegin() {
        return dateBegin;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public Set<Developer> getDeveloperRegister() {
        return developerRegister;
    }

    public void setDeveloperRegister(Set<Developer> developerRegister) {
        this.developerRegister = developerRegister;
    }

    public Set<Content> getContent() {
        return content;
    }

    public void setContent(Set<Content> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return Objects.equals(name, program.name) && Objects.equals(description, program.description) && Objects.equals(dateBegin, program.dateBegin) && Objects.equals(dateFinal, program.dateFinal) && Objects.equals(developerRegister, program.developerRegister) && Objects.equals(content, program.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateBegin, dateFinal, developerRegister, content);
    }
}
