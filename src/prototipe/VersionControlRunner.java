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
public class VersionControlRunner {

   
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode= new SourceCode();");
        
        System.out.println(master);
        
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        
        System.out.println("\n=========================================================\n");
        System.out.println(masterClone);


    }
    
}
