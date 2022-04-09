package DesignPatternConcepts.SignletonPattern;

public class Github {

    private static Github githubRepository = new Github();

    public Github() {
    }

    public static Github getGithubRepository(){
        return githubRepository;
    }

    public void showProviderName(){
        System.out.println("Github Inc.");
    }

    public void showRootCompanyName(){
        System.out.println("Microsoft Inc.");
    }
}
