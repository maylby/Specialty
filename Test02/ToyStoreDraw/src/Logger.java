/*
Промежуточная контрольная работа по блоку специализация
Урок 2. "Магазин игрушек" (Java)
https://gb.ru/lessons/432766/homework

 */
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    FileWriter fileWriter;

    try {
        fileWriter = new FileWriter("log.txt", true);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    public void getLogger(Toy toy) throws IOException {
        if (toy != null) {
            fileWriter.write(toy.toString() + "\n");
        } else {
            fileWriter.write("ToyStore is empty" + "\n");
        }
        fileWriter.flush();
    }
}


