class Continent 
{
    String continent;
    Continent(String continent) 
	{
        this.continent = continent;
		System.out.println("Continent : " + continent);
    }
}
class Country extends Continent 
{
    String country;
    Country(String continent, String country) 
	{
        super(continent);
        this.country = country;
		System.out.println("Country   : " + country);
    }
}
class State extends Country 
{
    String state;
    String place;
    State(String continent, String country, String state, String place) 
	{
        super(continent, country);
        this.state = state;
        this.place = place;
		System.out.println("Place     : " + place);
        System.out.println("State     : " + state);
    }
}

class MultilevelInheritance 
	{
    public static void main(String[] args) 
	{
        State s = new State("Asia", "India", "Maharashtra", "Pune");
    }
}
