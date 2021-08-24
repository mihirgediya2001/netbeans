
package switchCase;

import java.util.Objects;
import java.util.Scanner;

class Country {

    // Fields
    int populationSize;
    double area;
    String name;
    String capital;
    String currency;
    String abbreviation;

    // Constructors
    public Country() {
    }

    public Country(int populationSize, double area, String name, String capital, String currency, String abbreviation) {
        this.populationSize = populationSize;
        this.area = area;
        this.name = name;
        this.capital = capital;
        this.currency = currency;
        this.abbreviation = abbreviation;
    }

    public Country(int populationSize, double area, String name, String capital, String currency) {
        this.populationSize = populationSize;
        this.area = area;
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public Country(int populationSize, double area, String capital, String currency) {
        this.populationSize = populationSize;
        this.area = area;
        this.capital = capital;
        this.currency = currency;
    }

    // Getter methods
    public int getPopulationSize() {
        return populationSize;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    // Setter Methods
    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    // toString() method
    @Override
    public String toString() {
        return "Country: " + "name=" + name + ", populationSize=" + populationSize + ", area=" + area + ", capital=" + capital + ", currency=" + currency + ", abbreviation=" + abbreviation + '.';
    }

    // equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;

        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of Countries: ");
        n = input.nextInt();
        Country[] countries = new Country[n];

        int populationSize;
        double area;
        String name, currency, abbr , capital;

        input.nextLine();
        for (int i = 0; i < n; i++) {
            abbr="";
            System.out.println("Enter Details for Country " + (i + 1));
            System.out.print("Enter the name: ");
            name = input.nextLine();

            System.out.print("Enter the area(km*km): ");
            area = input.nextDouble();

            System.out.print("Enter the population: ");
            populationSize = input.nextInt();

            System.out.print("Enter the Capital: ");
            input.nextLine();
            capital = input.nextLine();

            System.out.print("Enter the Currency: ");
            currency = input.nextLine();
            abbr += name.toUpperCase().charAt(0);
            abbr += name.toUpperCase().charAt(name.length() - 2);

            for (int j = 0; j < i; j++) {
                if (countries[j].abbreviation == null ? false : countries[j].abbreviation.equals(abbr)) {
                    abbr += name.toUpperCase().charAt(name.length() - 1);
                }
            }

            countries[i] = new Country(populationSize, area, name, capital, currency, abbr);
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Country " + (i + 1));
            System.out.println(countries[i]);
        }

        if (n>=2 && countries[0].equals(countries[1])) {
            System.out.println("\nCountry 1 and country 2 is same.");
        } else {
            System.out.println("\nCountry 1 and country 2 is not same.");
        }
    }
}
