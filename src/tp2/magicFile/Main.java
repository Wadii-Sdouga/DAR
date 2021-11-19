package tp2.magicFile;

import java.io.File;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Give me your file name :)"); //try isi as an input ;)
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        printFileContent(fileName);
    }


    private static String getFileContent(String fileName) {
        File file = new File("src/tp2/magicFile/" + fileName);
   try {
			Scanner reader = new Scanner(file);
			String content = reader.nextLine();
	        return content;
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
        return null;
    }

    private static void printFileContent(String fileName) {
        String data = getFileContent(fileName);
        System.out.println(data);
    }
}
