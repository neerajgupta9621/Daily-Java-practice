package CollectionFramework;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {
    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("SriLanka", "Columbo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the country name:");
        String country = sc.next();
        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s ", country,
                    countryMap.get(country));
        } else {
            System.out.println("Sorry we don't know the capital:");
        }
    }
}