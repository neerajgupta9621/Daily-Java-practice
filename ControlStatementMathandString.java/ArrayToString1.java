class ArraytoString {
    public static void main(String[] args) {
        String[] arr = new String[] { "This",
                "is", "the", "best", "and", "most",
                "detailed", "course", "on", "java",
                "on", "the", "interne." };
        StringBuilder sb = new StringBuilder();
        //for each loop
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
