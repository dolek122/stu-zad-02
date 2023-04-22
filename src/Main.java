public class Main {
    public static void main(String[] args) {
        //Klasa reprezentująca konto użytkownika
        userAccount user = new userAccount("janek12", "haslo13", "Jan", "Kowalski", "Kwiatowa 14", "01/01/1999");
        System.out.println("Twoje dane " + user);

        //Klasa reprezentująca liczby zespolone
        complexNumber z1 = new complexNumber(2, 3);
        complexNumber z2 = new complexNumber(4, 5);

        complexNumber sum = z1.add(z2);
        System.out.println("Wynik z1: " + z1.toString());
        System.out.println("Wynik z2: " + z2.toString());
        System.out.println("Suma: " + sum.toString());

        //Klasa implementująca stos liczb w oparciu o wektor
        VectorStack stack = new VectorStack(5);
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
    }

}