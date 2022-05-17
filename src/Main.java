
class Main {
    public static void main(String[] args) {
        // test the database works (make sure test.txt exists)
        System.out.println(" ========== Database ==========");
        //Database myDatabase = new Database("D:\\Zjunk\\UsernamePassword", 10);
        Database myDatabase = new Database("\\\\bex-file-01\\studenthome$\\16\\16Syms_G\\Computer Science\\Year 12\\IAStuff\\UsernamePassword", 10);

        //System.out.println(myDatabase.getRecordCount());

        String[] userData = new String[myDatabase.getRecordCount()];
        Login myLogin = new Login();

        //creates a new account, adds to file
        //myLogin.createAccount("hello", "nononono");

        //checks if an entered user password combination is in the file
        if ((myLogin.authenticate("hello", "nononono").equals("-1"))){
            System.out.println("Invalid Login Details");
        } else {
            //opens the user's database of tasks
            String a = myLogin.authenticate("hello", "nononono");
            Display myDisplay = new Display(a);
            myDisplay.printDatabase();

        }
    }
}