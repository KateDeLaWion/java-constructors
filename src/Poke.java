public class Poke {

    public static class Pokemon{
        String type;
        String name;

        //constructor
        public Pokemon(String another, String name){
            //this.type = type;    if the above is type instead of another
            //this.type = another;
            type = another; // this.type is optional because type and another are different enough
            this.name = name;
        }

    }


    public static void main(String[] args) {

        //access a class by
        Pokemon animal = new Pokemon( "energy", "Pikachu" );

        // . notation access only variableValue/keyValue and method, not the class
        System.out.println("This type is  " + animal.type);
        System.out.println("This name is " + animal.name);
    }



}

