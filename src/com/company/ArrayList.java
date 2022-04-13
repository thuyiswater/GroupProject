package com.company;

public class ArrayList {
    private Customer[] arr;
    private int size = 0;

    public ArrayList() {
        arr = new Customer[10];
    }

    public boolean add(Customer newCus){
        arr[size] = newCus;
        size++;

        if (arr.length == size) {
            Customer newArr[] = new Customer[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        return true;
    }

    public void update(String ID) {

    }



    public int getSize() {
        return size;
    }

    public Customer get(int index) {
        return arr[index];
    }
}
