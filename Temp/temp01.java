import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Дано:
 * "select * from students where "
 * "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
 * Получить:
 * "select * from students where name='Ivanov' and country='Russia' and city='Moscow'"
 */
public class temp01 {

    public static void main(String[] args) {
        String QUERY = "select * from students where";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < PARAMS.length(); i++) {
            if(PARAMS.charAt(i) != '{' & PARAMS.charAt(i) != '}' & PARAMS.charAt(i) != '"' & PARAMS.charAt(i) != ','){
                if(PARAMS.charAt(i)==':')
                    sb.append('=');
                else    
                    sb.append(PARAMS.charAt(i));
            }
        }
        String temStringOne = sb.toString();


        String[] words = temStringOne.split(" ");
        sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) == '=')
                    if (words[i].charAt(j+1)=='n' & words[i].charAt(j+2)=='u' & words[i].charAt(j+3)=='l' & words[i].charAt(j+4)=='l')
                        count += 1;
         
            }
            if(count == 0)
                sb.append(words[i]).append(" ");
            count = 0;
        }
        // sb.delete(sb.length()-5, sb.length());
        String temStringTwo = sb.toString();
        System.out.println(temStringTwo);


        sb = new StringBuilder();
        String[] wordsTwo = temStringTwo.split(" ");
        for (int i = 0; i < wordsTwo.length; i++) {
            for (int j = 0; j < wordsTwo[i].length(); j++) {
                if(wordsTwo[i].charAt(j) != '=' && wordsTwo[i].charAt(j) != ' ')
                    sb.append(wordsTwo[i].charAt(j));
                else    
                sb.append(wordsTwo[i].charAt(j)).append("'");
            }
            sb.append("' ");    
        } 
        String tempStringThree = sb.toString();
        System.out.println(tempStringThree);

        sb = new StringBuilder();
        for (int i = 0; i < tempStringThree.length(); i++) {
            if(tempStringThree.charAt(i)==' ')
                sb.append(" and ");
            else sb.append(tempStringThree.charAt(i));    
        }
        sb.delete(sb.length()-5, sb.length());
        String termStringFour = sb.toString();
        System.out.println(termStringFour);

        sb = new StringBuilder();
        sb.append(QUERY).append(termStringFour);
        System.out.println(sb.toString());
    }
}