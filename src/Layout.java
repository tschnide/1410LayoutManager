import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layout extends JFrame {
	static boolean tof = true;
	static JLabel  HI;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout frame = new Layout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Layout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1));
		
		// Label1 Label
		JLabel lblLabel = new JLabel("Label1");
		newlblLabel(lblLabel);
		contentPane.add(lblLabel);
	
		// ClickMe Button
	
		JButton ClickMe = new JButton("Click Me");
		newClickMeButton(ClickMe);
		contentPane.add(ClickMe);
		
		// HI Label
		//JLabel HI = new JLabel("HI");
		//newlblHi(HI);
		//contentPane.add(HI);
		HI = new JLabel("HI");
		HI.setOpaque(true);
		HI.setBackground(Color.RED);
		HI.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		HI.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(HI);
		
		JButton Button = new JButton("Button");
		newButton(Button);
		contentPane.add(Button);
	}

	//  Button
	private void newButton(JButton Button) {
		Button.setOpaque(true);
		Button.setForeground(Color.WHITE);
		Button.setBackground(Color.BLUE);
		Button.setBorderPainted(false);
		Button.setFont(new Font("Lucida Grande", Font.ITALIC, 22));
	}
	
	//  HI
	//private void newlblHi(JLabel HI) {

		//}

	//  ClickMe
	private void newClickMeButton(JButton ClickMe) {

		ClickMe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

			HI.setBackground(Color.YELLOW);
				if(tof == true){
				ClickMe.setBackground(Color.GREEN);
				tof = false;
			}
				else{
				ClickMe.setBackground(Color.BLUE);
				tof = true;
				}
			}
			
		});
		newButton(ClickMe);
	}

	//  Label1
	private void newlblLabel(JLabel lblLabel) {
		lblLabel.setOpaque(true);
		lblLabel.setBackground(Color.RED);
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
	}

}
