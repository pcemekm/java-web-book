package pl.pcemekm.webBook.tasks;

public class StringReverser {

    public static String reverse(String input){
        StringBuilder answer = new StringBuilder();

        char[] inputCharArray = input.toCharArray();

        for(int i = input.length()-1;i>=0;i--){
            answer.append(inputCharArray[i]);
        }
        return answer.toString();
    }
}
