package gb.internship.view;

public enum TemplateType {
    DEMO("templates/demo.html");

    private final String templatePath;

    TemplateType(String templatePath) {
        this.templatePath = templatePath;
    }

    public String getTemplatePath() {
        return templatePath;
    }
}
