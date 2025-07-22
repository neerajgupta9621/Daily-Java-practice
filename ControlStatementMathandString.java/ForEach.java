class ForEach {
    public static void main(String[] args) {
        String[] str = new String[] {
                "Ram", "Shyam", "Geeta", "Mala", "Neeraj", "Monika" };
        forEach(str);
        // forEach1(str);

    }

    public static void forEach1(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    // For Each Loop
    public static void forEach(String[] str) {
        for (String string : str) {
            System.out.println(string);
        }
    }
}
