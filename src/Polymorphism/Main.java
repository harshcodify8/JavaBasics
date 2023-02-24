package Polymorphism;
class Movie{
    private String name;
    public Movie (String name) {
        this.name=name;
    }
        public String plot() {
        return "no plot here";
    }
}
class Jaws extends Movie {
    public Jaws(String name) {
        super(name);
    }

    public String plot() {
        return "movie is good";
    }
}

class Dhoom extends Movie {
    public Dhoom(String name) {
        super(name);
    }

    public String plot() {
        return "dhommm againn";
    }
}
public class Main {
    public static void main(String[] args) {

        for(int i = 1 ; i < 11 ;i++)
        {
            Movie movie = randomMovie();
            System.out.println(movie.plot());
        }

    }

    public static Movie randomMovie() {
        int random =(int)(Math.random()*5+1);
        switch (random) {
            case 1:
                return new Dhoom("Dhoom1");
            case 2:
                return new Jaws("Sharkshe");
            /*default:
                return null;*/
        }
        return null;
    }
}


