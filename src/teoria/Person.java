package teoria;

public record Person(String fullName, float weight, float height, int age) {
    @Override
    public String toString() {
        return String.format("Name: %S%nAge: %d%nWeight: %.2f%nHeight: %.2f",
                fullName, age, weight, height);
    }
}
