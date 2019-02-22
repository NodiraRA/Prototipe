/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipe;

/**
 *
 * @author nodira
 */
public class Project implements Copyable{
    private int id;
    private String projectName;
    private String sourceCode;
    
    public Project(int id, String projectName, String sourceCode){
        this.id=id;
        this.projectName=projectName;
        this.sourceCode=sourceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    @Override
    public Object copy() {
     
        Project copy = new Project(id, projectName, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", projectName=" + projectName + ", sourceCode=" + sourceCode + '}';
    }
    
    
    
    
    
}
