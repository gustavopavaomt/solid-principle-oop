public class LiskovSubstitutionPrinciple {
//As subclasses devem ser substituíveis por suas
// classes base sem alterar a corretude do programa.

    class Bird {
        void fly() {
            System.out.println("Flying");
        }
    }

    class Sparrow extends Bird {
        @Override
        void fly() {
            System.out.println("Sparrow flying");
        }
    }

    class Ostrich extends Bird {
        @Override
        void fly() {
            throw new UnsupportedOperationException("Ostriches can't fly");
        }
    }

// O uso da classe Ostrich aqui quebra o princípio de Liskov

}
