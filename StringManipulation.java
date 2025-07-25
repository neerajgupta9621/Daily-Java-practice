class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Neeraj";
        String lastName = "Gupta";
        String fullname1=firstName+lastName;
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println("Your Name is " + fullName.toUpperCase());
        System.out.println(firstName==firstName);
        System.out.println(fullName.toLowerCase());
        System.out.println(firstName.equalsIgnoreCase(firstName));
        System.out.println(fullName.length());
        System.out.println(fullName.substring(0, 9));
        System.out.println(fullName.indexOf(lastName));
        System.out.println(fullName.replace(lastName, firstName));
        System.out.println(firstName.equals(firstName));
    }
}
