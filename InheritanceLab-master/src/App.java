public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");
       

        Wizard Ryota = new Wizard("Ryota");
        Warlock Killua = new Warlock("Killua");

        Ryota.fireStorm(Killua);
        Ryota.displayDetails();
        Killua.displayDetails();

        Killua.VoidBlast(Ryota);
        Ryota.displayDetails();
        Killua.displayDetails();

        Ryota.Windblade(Killua);
        Ryota.displayDetails();
        Killua.displayDetails();
    }
}
