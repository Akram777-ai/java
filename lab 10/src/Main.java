import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel {

    String text = "";
    int count = 0;
    int x = 50;
    Color color = Color.RED;

    public Main() {
        setLayout(new FlowLayout());

        JButton button = new JButton("Нажми");
        JTextField field = new JTextField(10);

        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        add(field);
        add(button);
        add(red);
        add(green);
        add(blue);

        // Кнопка
        button.addActionListener(e -> {
            text = "Привет, " + field.getText();
            count++;
            repaint();
        });

        // Цвета
        red.addActionListener(e -> { color = Color.RED; repaint(); });
        green.addActionListener(e -> { color = Color.GREEN; repaint(); });
        blue.addActionListener(e -> { color = Color.BLUE; repaint(); });

        // Анимация
        new Timer(50, e -> {
            x += 5;
            if (x > 400) x = 0;
            repaint();
        }).start();

        // Мышь
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Фигуры
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 100, 80);
        g.drawString("Прямоугольник", 50, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Круг", 200, 45);

        g.drawLine(50, 150, 200, 150);
        g.drawString("Линия", 50, 145);

        // Цветная фигура
        g.setColor(color);
        g.fillOval(x, 200, 50, 50);

        // Текст
        g.setColor(Color.BLUE);
        g.drawString("Hello Java", 50, 300);

        // Сообщение + счетчик
        g.setColor(Color.BLACK);
        g.drawString(text, 50, 330);
        g.drawString("Нажатий: " + count, 50, 360);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 10");
        frame.add(new Main());
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
