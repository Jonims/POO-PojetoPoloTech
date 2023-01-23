package br.com.projeto.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String name;

    private String cpf;

    private String email;

    private String cep;

    private String address;

    private String phone;

    private Set<Content> subscribedContents = new LinkedHashSet<>();// permite add elementos unicos = one to many

    private Set<Content> completedContents = new LinkedHashSet<>();

    public void registerProgram(Program program){
        this.subscribedContents.addAll(program.getContent());
        program.getDeveloperRegister().add(this); // contém todos os devs inscritos

    }

    public void progress(){
        Optional<Content> content = this.subscribedContents.stream().findFirst(); // o dev deve realizar os conteudos conforme foi adicionado na plataforma.
        if (content.isPresent()){
            this.completedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("You are not subscribed to any content! ");
        }
    }

    public double calculateTotalConclusion(){
        return this.completedContents
                .stream()
                .mapToDouble(Content::calculateConclusion)
                .sum();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(cpf, developer.cpf) && Objects.equals(email, developer.email) && Objects.equals(cep, developer.cep) && Objects.equals(address, developer.address) && Objects.equals(phone, developer.phone) && Objects.equals(subscribedContents, developer.subscribedContents) && Objects.equals(completedContents, developer.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, email, cep, address, phone, subscribedContents, completedContents);
    }
}
