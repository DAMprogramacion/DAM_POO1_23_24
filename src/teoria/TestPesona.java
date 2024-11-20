package teoria;

public class TestPesona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setAltura(1.80F);
        persona1.setEdad(25);
        persona1.setPeso(75.5F);
        persona1.setNombreCompleto("Javier García García");
        System.out.printf("Nombre: %S%n", persona1.getNombreCompleto());
        System.out.printf("Edad: %d%n", persona1.getEdad());
        System.out.printf("Peso: %.2f%n", persona1.getPeso());
        System.out.printf("Altura: %.2f%n", persona1.getAltura());
        System.out.println("=======================================");
        Persona persona2 = new Persona("Belen Martínez", 1.75f, 65.3f, 26);
        System.out.println(persona2);
        System.out.println("=======================================");
        Person person = new Person("Luis Abolafia Gómez", 88.2f, 1.95f, 55);
        System.out.printf("Nombre: %S%n", person.fullName());
        System.out.printf("Edad: %d%n", person.age());
        System.out.printf("Peso: %.2f%n", person.weight());
        System.out.printf("Altura: %.2f%n", person.height());
        System.out.println("=======================================");
        System.out.println(person);
    }
}
