public class QueueUsingArray {

  int [] arr;
  int maxSize;
  int front;
  int rear;
  public QueueUsingArray(int size) {
    this.maxSize = size;
    this.arr = new int[size];
    this.front = 0;
    this.rear = -1;
  }

  public void enqueue(int data) {
    arr[++rear] = data;
  }

  public int dequeue() {
    return arr[front++];
  }

  public boolean isEmpty() {
    return (rear == -1 || front == (maxSize));
  }

  public boolean isFull() {
    return (rear == (maxSize - 1));
  }


  public static void main(String[] args) {

    QueueUsingArray queue = new QueueUsingArray(5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    while(!queue.isEmpty()) {
      System.out.println(queue.dequeue());
    }
  }
}
