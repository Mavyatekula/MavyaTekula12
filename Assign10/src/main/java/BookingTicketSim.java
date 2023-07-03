import java.util.concurrent.locks.ReentrantLock;

class BookingTicket {
    private int availTickets;
    private final ReentrantLock lock;

    public BookingTicket(int totalTickets) {
        this.availTickets = totalTickets;
        this.lock = new ReentrantLock();
    }

    public void bookTickets(int numTickets) {
        lock.lock();
        try {
            if (availTickets >= numTickets) {
                System.out.println(Thread.currentThread().getName() + " is booking " + numTickets + " tickets.");
                availTickets -= numTickets;
                System.out.println(Thread.currentThread().getName() + " successfully booked " + numTickets + " tickets.");
            } else {
                System.out.println(Thread.currentThread().getName() + " cannot book " + numTickets + " tickets. Available tickets: " + availTickets);
            }
        } finally {
            lock.unlock();
        }
    }
}

public class BookingTicketSim {
    public static void main(String[] args) {
        BookingTicket bookingTicket = new BookingTicket(10);
        int numThreads = 5;

        Runnable bookingTask = () -> {
            for (int i = 1; i <= 3; i++) {
                bookingTicket.bookTickets(i);
                try {
                    Thread.sleep(100); // Introducing a delay to simulate some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 1; i <= numThreads; i++) {
            Thread thread = new Thread(bookingTask, "Thread " + i);
            thread.start();
        }
    }
}
