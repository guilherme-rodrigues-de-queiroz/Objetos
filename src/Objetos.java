public class Objetos {
    public static void main(String[] args){
        // criando objetos
        Clientes c001 = new Clientes();
        c001.firstName = "Luiz";
        c001.age = 44;

        c001.newAccount();

        Clientes c002 = new Clientes();
        c002.firstName = "Larry";
        c002.age = 30;

        c002.newAccount();
    }
}
