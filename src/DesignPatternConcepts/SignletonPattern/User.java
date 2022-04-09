package DesignPatternConcepts.SignletonPattern;

public class User {
    public static void main(String[] args) {

        Github github = Github.getGithubRepository();
        github.showProviderName();
        github.showRootCompanyName();
    }
}
