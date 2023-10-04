package fibonacci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonacciGUI extends JFrame {
    private JTextField textField;
    private JTextArea textArea;

    public FibonacciGUI() {
        setTitle("Fibonacci 계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("피보나치수열 몇 항 까지 계산할까요?");
        panel.add(label, BorderLayout.NORTH);

        textField = new JTextField();
        panel.add(textField, BorderLayout.CENTER);

        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFibonacci();
            }
        });
        
      panel.add(button, BorderLayout.SOUTH);

      textArea = new JTextArea();
      textArea.setEditable(false);
      JScrollPane scrollPane = new JScrollPane(textArea);
      panel.add(scrollPane, BorderLayout.EAST);

      add(panel);
   }

   private void calculateFibonacci() {
       int n = Integer.parseInt(textField.getText());

       int[] fibonacci = new int[n];
       fibonacci[0] = 0;
       fibonacci[1] = 1;

       for (int i = 2; i < n; i++) {
           fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
       }

       StringBuilder sb = new StringBuilder();
       for (int i : fibonacci) {
           sb.append(i).append(" ");
       }

       textArea.setText(sb.toString());
   }

   public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               FibonacciGUI frame= new FibonacciGUI();
               frame.setVisible(true);
           }
       });
   }
}
