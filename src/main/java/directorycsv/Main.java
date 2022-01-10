package directorycsv;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            DirUtils.createDirectory("output");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            DirUtils.createFileInDirectory("result.csv", "output");
        } catch (Exception e) {
            e.printStackTrace();
        }
        FileWriter writer = new FileWriter("C:\\Users\\vlady\\IdeaProjects\\HomeWork18\\output\\result.csv", false);
        try {
            List<People> peopleList = List.of(
                    new People("Vasyl", 16, Sex.MAN),
                    new People("Petro", 23, Sex.MAN),
                    new People("Elena", 42, Sex.WOMAN),
                    new People("Hanna", 50, Sex.WOMAN),
                    new People("Oleh", 34, Sex.MAN),
                    new People("Kateryna", 63, Sex.WOMAN),
                    new People("Vladislav", 26, Sex.MAN),
                    new People("Lyudmyla", 60, Sex.WOMAN)
            );
            writer.write("NAME,AGE,SEX"+"\n");
            for (People people:peopleList) {
                writer.write(people.getName()+","+people.getAge()+","+people.getSex()+"\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }

    }
}
