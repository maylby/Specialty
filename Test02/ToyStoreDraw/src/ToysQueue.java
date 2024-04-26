/*
Промежуточная контрольная работа по блоку специализация
Урок 2. "Магазин игрушек" (Java)
https://gb.ru/lessons/432766/homework

 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToysQueue {
    private final PriorityQueue<ArrayList<Toy>> queue;

    public ToysQueue() {
        queue = new PriorityQueue<>((t1, t2) -> t2.getFirst().getWeight() - t1.getFirst().getWeight());
    }

    public void put(ArrayList<Toy> toys) {
        this.queue.add(toys);
    }
    public Queue<ArrayList<Toy>> getQueue(){
        return queue;
    }

    public Toy getToy() throws IOException {
        if (!getQueue().isEmpty()) {
            Random random = new Random();
            Toy randomToy;
            randomToy = getQueue().element().remove(random.nextInt(getQueue().poll().size()));
            Logger logger = new Logger();
            logger.getLogger(randomToy);
            return randomToy;
        } 
        return null;
    }
    
    public void FileWriter(Toy ToyStore) throws IOException {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write("writer" + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The toy is: " + getToy().getWeight());
    }
}
