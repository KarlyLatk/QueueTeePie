package org.example;

public class QueueTees {
    private Cutie[] cuties;
    private int maxSize = 4;

    public QueueTees() {
        cuties = new Cutie[maxSize];
    }
    public int size() {
        int i = 0;
        for(Cutie c : cuties){
            if(c != null){
                i++;
            }
        }
        return i;
    }

    public boolean isEmpty() {
        return size()==0;
    }

    // Checks if queue is full
    public boolean isFull() {
        return size()==maxSize;
    }

    // Adds elements to a queue
    public boolean enqueue(Cutie c){
       if(isFull()){
           System.out.println("Queue full, cannot enqueue");
           return false;
       }
       for(int i = size()-1; i >= 0; i--){
           cuties[i+1] = cuties[i];
       }
       cuties[0] = c;
       return true;
    }

    // Remove elements from the queue
    public Cutie dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty, cannot dequeue");
            return null;
        }
        Cutie c = cuties[size()-1];
        cuties[size()-1] = null;
        return c;
    }

    public void clear(){
        for(int i = 0; i < maxSize; i++){
            cuties[i] = null;
        }
    }

}
