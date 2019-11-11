import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> Info = FileReader.ReadFromFile("lesson3/src/main/resources/File.txt");
            ArrayList<String> EmptyInfo = FileReader.ReadFromFile("lesson3/src/main/resources/EmptyFile.txt");

            System.out.println("Задание 1. Тест непустого документа");
            System.out.println(MyHomeworkClass.Qu_1(Info));
            System.out.println("Задание 1. Тест пустого документа");
            System.out.println(MyHomeworkClass.Qu_1(EmptyInfo));
            System.out.println();System.out.println();System.out.println();

            System.out.println("Задание 2. Тест непустого документа");
            MyHomeworkClass.Qu_2(Info);
            System.out.println("Задание 2. Тест пустого документа");
            MyHomeworkClass.Qu_2(EmptyInfo);
            System.out.println();System.out.println();System.out.println();

            System.out.println("Задание 3. Тест непустого документа");
            MyHomeworkClass.Qu_3(Info);
            System.out.println("Задание 3. Тест пустого документа");
            MyHomeworkClass.Qu_3(EmptyInfo);
            System.out.println();System.out.println();System.out.println();

            System.out.println("Задание 4. Тест непустого документа");
            MyHomeworkClass.Qu_4(Info);
            System.out.println("Задание 4. Тест пустого документа");
            MyHomeworkClass.Qu_4(EmptyInfo);
            System.out.println();System.out.println();System.out.println();

            System.out.println("Задание 6. Тест непустого документа");
            MyHomeworkClass.Qu_6(Info,0,1,2,3,6);
            System.out.println("Задание 6. Тест пустого документа");
            MyHomeworkClass.Qu_6(EmptyInfo,0,6,8);
            System.out.println();System.out.println();System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find file シ");
        }
    }
}
