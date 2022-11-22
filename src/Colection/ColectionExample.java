package Colection;

import java.util.*;

public class ColectionExample {

    //Acest exemplu iti permite sa adaugi tipuri diferite de valori
 /*   public static void main(String[] args) {
        List myList = new ArrayList<>();
        myList.add("String");
        myList.add(5);
        myList.add(true);
        Set<> mySet = new HashSet<>();

       // for(String s : myList){   //se foloseste daca in lista se specifica clar ca lista e tip String

        //}
    }
}*/
//Exemplu de Set<()
    /*public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Neeki");
        names.add("Patrick");
        names.add("John");



        if(names.contains("John")){
            System.out.println("Element found");
        }
        for(String name : names){
            System.out.println(name);
        }
    }*/

    //Exemplu List<Float>
/* public static void main(String[] args) {
     List<Float> transfers = new ArrayList<>();
     transfers.add(120.0f);
     transfers.add(400.0f);
     transfers.add(5000.0f);

     transfers.remove(120.0f); //Aceste lini sterge o anumita pozitie
     transfers.remove(transfers.get(2));


     System.out.println(transfers.get(2));  //Aceasta linie se foloseste pt a primi o pozitie exacta

     for(Float transfer : transfers){
         System.out.println(transfer);
     }
 }*/

    //Acest exemplu ajuta ca o pozitie sa o retina pe cealalta
    // (nu va retine pozitiile adaugate, va trece prin toate pozitiile
  /*  public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
    }*/


/*    //Aceasta metoda citeste de la cap la coada lista
    public static void main(String[] args) {
        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Pikachu1");
        pokemons.offer("Pikachu2");
        pokemons.offer("Pikachu3");

        pokemons.poll();  //Aceasta linie te ajuta la stergerea pozitior de la inceput
                                    // in functie de cate linii .poll() avem

        System.out.println(pokemons.poll());
        System.out.println(pokemons.poll());

        // .peek() returneaza tot timpul prima pozitie

        for(String p : pokemons){
            System.out.println(p);
        }
    }*/

    public static void main(String[] args) {

        Map<String, Float> employees = new HashMap<>();

        employees.put("John Dool", 3000.0f); //adauga un float la string
        employees.put("Chao Di", 4500.0f);
        employees.put("Prasad D", 1000.0f);

        System.out.println(employees.get("John Dool")); //returneaza cheia alocata la acest element
        employees.remove("John Dool");  //sterge elementul

        //retrieving an element from the map with a given key
        System.out.println(employees.get("Prasad D"));
        for (String key : employees.keySet()) {
            System.out.println("Employee: " + key);
        }

        for (float value : employees.values()) {
            System.out.println("Payment: " + value);
        }

        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("Employee-payment " + pair);
        }
    }
}