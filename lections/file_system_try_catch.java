package lections;

import java.io.File;

public class file_system_try_catch {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f = new File(pathFile);
            if (f.createNewFile()) {
                System.out.println("Created file");
            }
            else {
                System.out.println("Existed file");
            }

            System.out.println("Try block");
        } catch (Exception e) {
            System.out.println("Catch block");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
