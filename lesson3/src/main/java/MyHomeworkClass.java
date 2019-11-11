import java.util.*;

public class MyHomeworkClass {

    public static int Qu_1(ArrayList<String> file){
        if(file.isEmpty()) {
            return 0;
        }
        HashSet<String> set = new HashSet<String>();
        for (int i=0;i<file.size();i++){
            String[] currentLine = file.get(i).replaceAll("[\\.]{1,}", "").replaceAll("[\\,]{1,}", "").replaceAll("[\\s]{2,}", " ").split(" ");
            for( int y=0;y<currentLine.length;y++){
                set.add(currentLine[y]);
            }
        }
        return set.size();
    }

    public static void Qu_2(ArrayList<String> file){
        if(file.isEmpty()) {
            System.out.println("File is empty");
            return;
        }
        ArrayList<String> map = new ArrayList<String>();
        int maxInt=0;
        for (int i=0;i<file.size();i++){
            String[] currentLine = file.get(i).replaceAll("[\\.]{1,}", "").replaceAll("[\\,]{1,}", "").replaceAll("[\\s]{2,}", " ").split(" ");
            for( int y=0;y<currentLine.length;y++){
               if(maxInt<currentLine[y].length()) maxInt = currentLine[y].length();
                map.add(currentLine[y]);
            }
        }
        for(int i=0;i<maxInt;i++){
            TreeSet<String> temp = new TreeSet<String>();
            for(int y=0;y<map.size();y++){
                if((i+1)==map.get(y).length()) temp.add(map.get(y));
            }
            Iterator iterator = temp.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            temp.clear();
        }
    }

    public static void Qu_3(ArrayList<String> file){
        if(file.isEmpty()) {
            System.out.println("File is empty");
            return;
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0;i<file.size();i++){
            String[] currentLine = file.get(i).replaceAll("[\\.]{1,}", "").replaceAll("[\\,]{1,}", "").replaceAll("[\\s]{2,}", " ").split(" ");
            for( int y=0;y<currentLine.length;y++){
                if(map.containsKey(currentLine[y])){
                    int temp = map.get(currentLine[y]);
                    map.remove(currentLine[y]);
                    map.put(currentLine[y],temp+1);
                } else{
                    map.put(currentLine[y],1);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " повторяется " + entry.getValue() + " раз");
        }
    }

    public static void Qu_4(ArrayList<String> file){
        if(file.isEmpty()) {
            System.out.println("File is empty");
            return;
        }
        for(int i = (file.size()-1);i>=0;i--){
            System.out.println(file.get(i));
        }
    }



    public static void Qu_6(ArrayList<String> file,int... number){
        if(file.isEmpty()) {
            System.out.println("File is empty");
            return;
        }
        for(int num:number){
            if(num>(file.size()-1)) {
                System.out.println("Your number is too big");
                continue;
            }
            if(num<1) {
                System.out.println("Your number is too small");
                continue;
            }
            System.out.println(file.get(num-1));
        }
    }
}
