import java.util.LinkedList;
//В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
//
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
//getElements() - возвращает все элементы в очереди
public class MyQueue<Object>{

        private LinkedList<Object> list = new LinkedList<>();
        private int size = 0;

        public void enqueue(Object element) {
            list.addLast(element);
            size++;

        }

        public Object dequeue() {
            Object temp = list.getFirst();
            list.removeFirst();
            size--;
            return temp;
        }

        public Object first() {
            return list.getFirst();
        }

        public LinkedList<Object> getElements() {
            return list;
        }
}
