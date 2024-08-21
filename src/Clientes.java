public class Clientes {
    // criando nossos atributos
    // private - public - protect
    String firstName; // private String firstName - bloqueia a String, não deixando ser utilizada fora do Clientes.java

    int age;

    int valor;

    Clientes(){
        valor = 50; // este atributo será inicializado com este valor
    }

    //Criando nosso comportamento (métodos)
    void newAccount(){
        System.out.println(firstName + " Parabéns, sua conta foi criada");
        System.out.println("Você tem " + age + " anos");
        System.out.println("Você ganhou R$ " + valor + " de Cashback");
        System.out.println();
    }
}
