public class Queue {
    private int [] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void insert(int elem){
        if(rear == maxSize -1 ){ //Циклический перенос
            rear = -1;
        }
        queue [++rear] = elem; //увеличиваем rear и вставка
        nElem++;               //увеличиваем количество елементов в очереди
    }
    //Создаем get для проверки очереди переполнение и если пусто
    public int getFront(){
        return  queue[front];
    }
    public int getRear() {
        return queue[rear];
    }

    public boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }

    public int remove() {
        int temp = queue[front++]; //достаем первый элемент из очереди
        if(front == maxSize){     // циклический перенос
            front = 0;
        }
        nElem--;                  //уменьшаем количество элементов в очереди
        return temp;
    }
}
