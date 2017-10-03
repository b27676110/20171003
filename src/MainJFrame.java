import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MainJFrame extends JFrame{
    private Container cp;
    private int count = 0;
    private JButton jbtn1 = new JButton("Add");
    private JButton jbtn2 = new JButton("Sub");
    private JButton jbtn3 = new JButton();
    private JButton jbtn4 = new JButton("Exit");
    private JLabel jlb1 = new JLabel("0");
    public MainJFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();

        cp.setLayout(new GridLayout(5,1,3,3));

        jlb1.setHorizontalAlignment(JLabel.CENTER);

        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb1.setText(Integer.toString(count++));
            }
        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb1.setText(Integer.toString(count--));
            }
        });
        jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jlb1);
        this.add(jbtn3);
        this.add(jbtn4);



    }
}
