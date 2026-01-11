class SimpleThread extends Thread {
    public void run() {
        System.out.println("This is a thread");
    }

    public static void main(String[] args) {
        SimpleThread t = new SimpleThread();
        t.start();
    }
}
