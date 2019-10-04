public class Main {

    public static void main(String[] args)
    {
        //созданиее элементов Стек
        Stack theStack = new Stack(200);
        theStack.addElementToStack(100);
        theStack.addElementToStack(89);
        theStack.addElementToStack(69);
        theStack.addElementToStack(45);
        theStack.addElementToStack(20);
        //создание элементов Очередь
        Queue myQueue = new Queue(5);
        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);
        myQueue.insert(50);
        //Удаление из очереди
        myQueue.remove();
        while (!myQueue.isEmpty()){
            int n = myQueue.remove();
            System.out.println("Elem:" + n);


        }

        theStack.deleteElementFromStack();
        //System.out.println("Stack:");
        while (!theStack.isEmpty())
        {
            int value = theStack.deleteElementFromStack();
            System.out.println("Stack:" + value);
            System.out.print(" ");
        }


    }
}
