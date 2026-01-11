class FirstThread extends Thread {
    public void run() {
        System.out.println("This is my first thread");
    }

    public static void main(String[] args) {
        SimpleThread t = new SimpleThread();
        t.start();
    }
}
