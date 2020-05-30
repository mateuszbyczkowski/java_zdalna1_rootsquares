package pl.sda.html;

public class HtmlParser {

    //<h1>Witam serdecznie SUPER KURS!</h1><P>To jest PLIK tekstowy</p>
    public String lineHtmlToUpperCase(String line) {
        String[] split = line.split("");

        StringBuilder builder = new StringBuilder();
        boolean upperCaseMode = false;

        for (String letter : split) {
            if (letter.equals("<")) {
                upperCaseMode = true;
                builder.append('<');
            } else if (letter.equals(">")) {
                upperCaseMode = false;
                builder.append('>');
            } else {
                if (upperCaseMode) {
                    builder.append(letter.toUpperCase());
                } else {
                    builder.append(letter);
                }
            }
        }
        return builder.toString();
    }
}
