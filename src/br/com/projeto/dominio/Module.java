package br.com.projeto.dominio;

public class Module extends Content{

    private int workload;

    public Module() {

    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Module{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

    @Override
    public double calculateConclusion() {
        return CONCLUSION * workload;
    }
}
