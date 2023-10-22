import java.util.Arrays;

public class Container<Type> {
    private Object[] elements;
    private int size;

    public Container() {
        elements = new Object[10];
        size = 0;
    }
    public Container(int AmountOfElements) {
        elements = new Object[AmountOfElements];
        size = 0;
    }

    /**
     * Добавление элемента в контейнер
     * @param item Элемент для добавления
     */
    public void add(Type item) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = item;
        size++;
    }

    /**
     * Получение э-та по индексу
     * @param index Индекс получаемого э-та
     * @return Получаемый элемент
     * @throws IndexOutOfBoundsException Ошибка, если индекс за пределами.
     */
    public Type get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами!");
        }
        return (Type) elements[index];
    }

    /**
     * Удаление э-та
     * @param index Индекс удаляемого э-та
     * @throws IndexOutOfBoundsException Ошибка, если индекс за пределами.
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами!");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements[size] = null;
    }

    /**
     * Вывод контейнера на экран
     * @return True при выводе одного и больше э-тов. False если контейнер пуст.
     */
    public  boolean ShowContainer(){
        if(this.IsEmpty()){System.out.println("Контейнер пуст");return false;}
        for(int i=0; i<size;i++){
            System.out.println("Элемент с индексом "+i+" : " + elements[i]);
        }
        return true;
    }

    /**
     * Вывод контейнера на экран
     * @param  StartIndex элемента, с которого должен начинаться вывод
     * @throws IndexOutOfBoundsException Ошибка, если индекс за пределами.
     * @return True при выводе одного и больше э-тов. False если контейнер пуст.
     */
    public  boolean ShowContainer(int StartIndex){
        if(this.IsEmpty()){System.out.println("Контейнер пуст");return false;}
        if (StartIndex < 0 || StartIndex >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами!");
        }
        for(int i=StartIndex; i<size;i++){
            System.out.println("Элемент с индексом "+i+" : " + elements[i]);
        }
        return true;
    }
    /**
     * Вывод контейнера на экран
     * @param StartIndex Индекс элемента, с которого должен начинаться вывод
     * @param StopIndex Индекс элемента, на котором надо закончить
     * @throws IndexOutOfBoundsException Ошибка, если индексы за пределами или некорректны.
     * @return True при выводе одного и больше э-тов. False если контейнер пуст или возникает ошибка.
     */
    public  boolean ShowContainer(int StartIndex, int StopIndex){
        if(this.IsEmpty()){System.out.println("Контейнер пуст");return false;}
        if (StartIndex < 0 || StartIndex >= size || StopIndex<=StartIndex || StopIndex >= size || StopIndex<0) {
            throw new IndexOutOfBoundsException("Индекс за пределами!");
        }
        for(int i=StartIndex; i<=StopIndex;i++){
            System.out.println("Элемент с индексом "+i+" : " + elements[i]);
        }
        return true;
    }
    /**
     * Получение размера контейнера
     * @return Размер контейнера
     */
    public int size() {
        return size;
    }
    /**
     * Проверка на пустоту
     * @return Статус пустоты контейнера
     */
    public boolean IsEmpty(){
        return size == 0;
    }
}