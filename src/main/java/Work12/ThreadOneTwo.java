package Work12;

public class ThreadOneTwo extends Thread {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    void testMethod1() {
        long a = System.currentTimeMillis();
        float[] arr = new float[SIZE];
        calculate(arr);
        System.currentTimeMillis();
        System.out.println("Время работы у первого метода " + (System.currentTimeMillis() - a));
    }

    void testMethod2() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        long a = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            float[] a1 = calculate(arr1);
            System.arraycopy(a1, 0, arr1, 0, a1.length);
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(() -> {
            float[] a2 = calculate(arr2);
            System.arraycopy(a2, 0, arr2, 0, a2.length);
        });

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.out.println("Время работы у второго метода: " + (System.currentTimeMillis() - a));
    }

    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    @Override
    public void run() {
        testMethod1();
        testMethod2();

    }
}


