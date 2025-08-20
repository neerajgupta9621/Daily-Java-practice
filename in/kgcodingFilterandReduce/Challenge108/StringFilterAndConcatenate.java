package in.kgcodingFilterandReduce.Challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Prashant Jain", "bad", "is teaching java", "ghatiya", "ganda", "on kG Coding",
                "Best Youtube Programming Problem", "bakwas");
        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce(" ", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
