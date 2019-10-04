public class Stack {   //создаем структуру данных Стек
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void addElementToStack(int element) { //Увеличиваем Индекс массива и добавляем на указанную позицию предидущий елемент
        stackArray[++top] = element;
    }

    public int deleteElementFromStack() { // удаляет елемент с топ позиции
        return stackArray[top--];
    }
    public boolean isEmpty() {  // проверяет не пустой ли стек
        return (top == -1);
    }
}