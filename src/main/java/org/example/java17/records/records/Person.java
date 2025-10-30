package org.example.java17.records.records;

public record Person(int age, String name) {

  /*  public Person{
        this.age = 10;  // ne compile pas puis que le contructeur compact ne peux pas modifier les parametres du constructeur
    }*/


    // classe static interne ou imbriquée
    public static class Addres {
        private final String city;
        public Addres(final String city) {
            this.city = city;
        }

        public String city(){

            return  this.city;
        }
    }

    // Classe interne (non static)
    public class Greeting {


        public String sayHello(){
            return  "Bonjour , je m'appelle " + name  + " et j'ai " + age + " ans.";
        }
    }

    public static void main(String[] args) {
        Person.Addres addres = new Person.Addres("Paris");
        Person p= new Person(18, "François");

        Person.Greeting greeting=  p.new Greeting();
        System.out.println(greeting.sayHello());
    }
}
