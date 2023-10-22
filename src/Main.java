public class Main {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();

        container.add(101);
        container.add(102);
        container.add(301);

        System.out.println("Размер контейнера: " + container.size());

        container.ShowContainer();

        container.remove(1);

        System.out.println("Новый размер контейнера: " + container.size());

        Container<Boolean> container2 = new Container<>();

        System.out.println("Пуст ли контейнер: " + container2.IsEmpty());
        container2.ShowContainer();

        container2.add(false);
        container2.add(false);
        container2.add(false);
        container2.add(true);

        container2.ShowContainer();
    }
}
