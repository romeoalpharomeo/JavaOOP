
public class Project {
    private String name = "OOP Project";
    private String description = "This is an OOP project.";

    public String returnNameAndDescription() {
        return name + "; " + description;
    }
    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}