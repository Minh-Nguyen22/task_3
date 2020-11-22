package encrypting_task_3;

public class Encrypting {

    public String encryptingMethod(String line) throws IllegalArgumentException {
        if (line.length()>10 || line.length() <= 0)
            throw new IllegalArgumentException();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            String result = "00 0 ";
            char firstWord = line.charAt(i);
            String binaryWord = Integer.toBinaryString(firstWord);
            for (int j = 0; j <= binaryWord.length(); j++) {
                String countOfNumbers = "";
                int count = 0;
                char firstChar = binaryWord.charAt(0);
                String nextLine = binaryWord.substring(1);
                j = 0;
                if (nextLine.length() > 0) {
                    while (firstChar == nextLine.charAt(count++)) {
                        j = count;
                        if (count + 1 >= binaryWord.length()) {
                            count++;
                            break;
                        }
                    }
                } else {
                    count = 1;
                    j = 0;
                }
                for (int m = 0; m < count; m++) {
                    countOfNumbers += "0";
                }
                j++;
                if (binaryWord.startsWith("0")) {
                    result += "00" + " " + countOfNumbers + " ";
                } else if (binaryWord.startsWith("1")) {
                    result += "0" + " " + countOfNumbers + " ";
                }
                binaryWord = binaryWord.substring(j);
                j = 0;
            }
            answer.append(result).append('\n');
        }
        return answer.toString();
    }
}
