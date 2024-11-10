import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //כתבו פונקציה המקבלת מחרוזת ומחזירה מערך של מספרים, שמספר איבריו הוא כמספר המילים במחרוזת
        // וערכי איבריו הוא מספר התווים בכל מילה. ניתן להניח שיש בדיוק רווח אחד בין כל מילה למילה.

        String text = "Hi I am Karina Kiryanov and who are you?";
        int[] howManyWords = countStrings(text);
        System.out.println(Arrays.toString(howManyWords));

    }

        public static int[] countStrings(String text){
            int countWords = 0;
            String[] words = text.split(" ");
                for (int i = 0; i < words.length; i++) {
                countWords++;
                }
            int[] howManyWords = new int[countWords];
                for (int i = 0; i < words.length; i++) {
                howManyWords[i] = words[i].length();
                }
            return howManyWords;
        }

}


