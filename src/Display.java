
public class Display {
    String filename;
    public Display(String username) {
        //filename = "D:\\Zjunk\\"+username+"Database";
        filename = "\\\\bex-file-01\\studenthome$\\16\\16Syms_G\\Computer Science\\Year 12\\IAStuff\\\\UsernamePassword";
    }

    public void printDatabase(){
        Database myDatabase = new Database((filename), 42);
        System.out.println(myDatabase.getRecordCount());
        //reads the line and places it into line[]
        String[] line = new String[myDatabase.getRecordCount()];
        for (int i = 0; i < myDatabase.getRecordCount(); i++) {
            System.out.print(i + " = ");
            line[i] = myDatabase.getRecord(i).replaceAll("x", "");
            System.out.println(line[i]);
        }

    }
}
