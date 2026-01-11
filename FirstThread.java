class FirstThread extends Thread {
    public void run() {
        System.out.println("This is my first thread");
    }

    public static void main(String[] args) {
        FirstThread t = new FirstThread();
        t.start();
    }
}
