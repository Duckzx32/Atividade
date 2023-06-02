import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BubbleSortInterface extends JFrame {
    private JTextArea textArea;

    public BubbleSortInterface() {
        setTitle("Bubble Sort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton sortButton = new JButton("Ordenar");
        sortButton.addActionListener(new ActionListener() {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void actionPerformed(ActionEvent e) {
                bubbleSort();
            }
        });

        JPanel panel = new JPanel();
        panel.add(sortButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void bubbleSort() {
        String input = textArea.getText();
        String[] numbers = input.split("\\s+");

        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                array[i] = Integer.parseInt(numbers[i]);
            } catch (NumberFormatException e) {
                textArea.append("Entrada inválida: " + numbers[i] + "\n");
                return;
            }
        }

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        textArea.append("\nArray ordenado:\n");
        for (int i = 0; i < n; i++) {
            textArea.append(array[i] + " ");
        }
        textArea.append("\n");
    }

    public static void main(String[] args) {
        BubbleSortInterface bubbleSortInterface = new BubbleSortInterface();
        bubbleSortInterface.setVisible(true);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

