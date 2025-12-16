package extracurriculer;

import academics.Students;

public class Sport extends Students {
    private int nofomatchplayed;
    Students Students[];

    public Sport(String name, int rollNo, int matchesPlayed) {
        super(name, rollNo);
        this.nofomatchplayed = nofomatchplayed;
    }

    public void displayDetails() {
        displayStudent();
        System.out.println("Matches Played : " + nofomatchplayed);
    }
}

