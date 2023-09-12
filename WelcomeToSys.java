public class WelcomeToSys extends Welcome {
    @Override
    public void displayWelcomeMessage() {
        System.out.println();
        String asciiArt =
                 ".  .   .\n" +
                 "|  | _ | _. _ ._ _  _\n" +
                 "|/\\|(/,|(_.(_)[ | )(/,";
    System.out.print(asciiArt);
    System.out.println();
    }
    
}
