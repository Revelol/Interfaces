import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class ShortWordLister {
    public static void main(String[] args) {
        ArrayList<Object> wordsList = ShortWordLister.wordsReader();
       // System.out.println("size:" + wordsList.size());
        ShortWordFilter shortW = new ShortWordFilter();
        ArrayList<Object> filteredList = HelperUtils.collectAll(wordsList,shortW);
        for(Object o : filteredList){
            System.out.println(o);
        }


    }


    public static ArrayList<Object> wordsReader() {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        JFileChooser choose = new JFileChooser();

        ArrayList<Object> wordList = new ArrayList<Object>();
        try {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            //System.out.println("test");

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                BufferedReader br = new BufferedReader(new FileReader(selectedFile));
                String line = null;
                while ((line = br.readLine()) != null) {
                    wordList.add(line);
                    //bSystem.out.println(line);
                }
                br.close();
            }

        } catch (Exception e) {
            System.out.println("Exception occurred " + e.getMessage());


        }
        return wordList;

    }
}