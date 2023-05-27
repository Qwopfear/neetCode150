package Stack.Medium;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int answer = 0;
        int digit = 0;
        int sign = 0;

        while (digit < tokens.length && sign < tokens.length) {
            if (isDigit(tokens[digit]) && isSign(tokens[sign]) ) {
                answer = perform(answer,tokens[sign],tokens[digit]);
                if (sign - 1 == digit) {
                    sign++;
                }
                digit++;

            } else {
                if (!isSign(tokens[sign])) {
                    sign++;
                } else {
                    digit++;
                }

            }
        }
        return answer;
    }

     boolean isSign(String sign){
        return sign.equals("/") || sign.equals("*") || sign.equals("-") || sign.equals("+");
    }
    boolean isDigit(String sign){
        return !sign.equals("/") && !sign.equals("*") && !sign.equals("-") && !sign.equals("+");
    }

    int perform(int before, String sign, String digit) {
        if (sign.equals("+")) return before + Integer.parseInt(digit);
        if (sign.equals("-")) return before - Integer.parseInt(digit);
        if (sign.equals("*")) return before * Integer.parseInt(digit);
        else return before / Integer.parseInt(digit);
    }

    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        System.out.println(reversePolishNotation.evalRPN(new String[]{"2","1","+","3","*"}));
    }
}
