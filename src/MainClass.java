public class MainClass {
    /**
     * how to use another jar file as lib in project
     * 1. create lib folder and paste all jar files
     * Project structure > libraries > add the lib folder
     * done!
     *  @param args
     */
    public static void main(String[] args) {
        Connect cnn = new Connect();
        cnn.insert("new course", 11);
    }
}
