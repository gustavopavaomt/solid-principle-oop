public class InterfaceSegregationPrinciple {
//É melhor ter várias interfaces específicas do que uma interface única e abrangente.

    interface CanFly {
        void fly();
    }

    interface CanSwim {
        void swim();
    }

    class Duck implements CanFly, CanSwim {
        @Override
        public void fly() {
            System.out.println("Duck flying");
        }

        @Override
        public void swim() {
            System.out.println("Duck swimming");
        }
    }

    class Fish implements CanSwim {
        @Override
        public void swim() {
            System.out.println("Fish swimming");
        }
    }

}
