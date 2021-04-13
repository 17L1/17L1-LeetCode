package Algorithm.MaxHeap;

public class MaxHeap {
    private int[] data;
    private int capacity;
    private int size;
    public MaxHeap(int capacity){
        data = new int[capacity + 1];
        size = 0;
        this.capacity = capacity;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int peek(){
        if (isEmpty()){
            throw new IllegalArgumentException("优先队列/堆为空");
        }
        return data[1];
    }
    public void offer(int item){
        if (size +1 > capacity){
            throw new IllegalArgumentException("优先队列已满，无法插入");
        }
        data[++size] = item;
        siftUp(size);

    }
    public int poll(){
        while (size == 0){
            throw new IllegalArgumentException("堆为空，无法弹出");
        }
        int tmp = data[1];
        data[1] = data[size];
        size--;
        sink(data,1,size);
        return tmp;

    }

    private void sink(int[] data, int k, int size) {
        while (2 * k <= size){
            int i = 2 * k;
            if (i + 1 <= size && data[i+1] > data[i]){
                i = i + 1;
            }
            if (data[i] > data[k]){
                swap(data,i,k);
            }else {
                break;
            }
             k = i;
        }
    }

    private void siftUp(int k) {
        while ( k > 1 && data[k/2] < data[k]){
            swap(data,k/2,k);
            k = k / 2;
        }
    }

    private void swap(int[] data, int i, int k) {
        int tmp = data[i];
        data[i] = data[k];
        data[k] = tmp;
    }
}
