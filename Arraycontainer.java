class ArrayContainer {
    private int[] dataArray;

    // Constructor that accepts an array
    public ArrayContainer(int[] array) {
        this.dataArray = array;
    }

    public void printArray() {
        for (int value : dataArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 };

        // Create an instance of ArrayContainer by passing the array to the constructor
        ArrayContainer container = new ArrayContainer(values);

        // Call the printArray method to display the array values
        container.printArray();
    }
}