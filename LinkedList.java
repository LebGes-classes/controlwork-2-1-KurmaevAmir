public class LinkedList<T> implements CollectionsList<T> {
    private Node<T> head = null;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> iteration = head;
            while(iteration.next != null) {
                iteration = iteration.next;
            }
            iteration.next = newNode;
        }
    }
    @Override
    public void add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> iteration = head;
            for (int i = 0; i < index - 1; i++) {
                if (iteration == null) {
                    throw new IndexOutOfBoundsException("Позиция не входит в диапазон");
                }
                iteration = iteration.next;
            }
            newNode.next = iteration.next;
            iteration.next = newNode;
        }
    }
    @Override
    public T remove(int index) {
        try {
            T element = find(index);
        } catch (IndexOutOfBoundsException e){
            return null;
        }
        T element = find(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> iteration = head;
            for (int i = 0; i < index - 1; i++) {
                if (iteration.next == null) {
                    return null;
                }
                iteration = iteration.next;
            }
            if (iteration.next == null) {
                return null;
            }
            iteration.next = iteration.next.next;
        }
        return element;
    }

    public void removeByElement(T element) {
        if (element == head) {
            head = head.next;
        } else {
            Node<T> iteration = head;
            while(iteration != null) {
                if (iteration.next.data == element) {
                    iteration.next = iteration.next.next;
                    break;
                }
                iteration = iteration.next;
            }
            if(iteration == null) {
                throw new IndexOutOfBoundsException("Позиция не входит в диапазон");
            }
        }
    }
    @Override
    public void clear() {
        head = null;
    }
    @Override
    public T find(int index) {
        Node<T> iteration = head;
        int count = 0;
        while(iteration != null) {
            if (count == index) {
                return iteration.data;
            }
            count++;
            iteration = iteration.next;
        }
        throw new IndexOutOfBoundsException("Позиция не входит в диапазон");
    }

    @Override
    public int findByElement(T element) {
        Node<T> iteration = head;
        int count = 0;
        while(iteration != null) {
            if (iteration.data == element) {
                return count;
            }
            count++;
            iteration = iteration.next;
        }
        throw new IndexOutOfBoundsException("Позиция не входит в диапазон");
    }
}
