package guiPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingConstants;

public class GameTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameTable frame = new GameTable();
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
	public GameTable() {
		setResizable(false);
		setTitle("Texas Hold'em");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 593);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel dealerPanel = new JPanel();
		dealerPanel.setBackground(new Color(0, 100, 0));
		dealerPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JPanel drawPanel = new JPanel();
		drawPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		drawPanel.setBackground(new Color(0, 100, 0));
		
		JPanel playerPanel = new JPanel();
		playerPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 200, 0), new Color(255, 200, 0), Color.ORANGE, Color.ORANGE));
		playerPanel.setBackground(new Color(0, 100, 0));
		
		JPanel ai1Panel = new JPanel();
		ai1Panel.setBackground(new Color(0, 100, 0));
		ai1Panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JPanel ai2Panel = new JPanel();
		ai2Panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		ai2Panel.setBackground(new Color(0, 100, 0));
		SpringLayout sl_ai2Panel = new SpringLayout();
		ai2Panel.setLayout(sl_ai2Panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addComponent(dealerPanel, GroupLayout.PREFERRED_SIZE, 825, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(ai1Panel, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
								.addComponent(ai2Panel, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(playerPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(drawPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(dealerPanel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(drawPanel, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
							.addComponent(playerPanel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(ai1Panel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(ai2Panel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(14)))
					.addContainerGap())
		);
		
		JLabel lblAiName2 = new JLabel("A.I. 2");
		sl_ai2Panel.putConstraint(SpringLayout.NORTH, lblAiName2, 10, SpringLayout.NORTH, ai2Panel);
		sl_ai2Panel.putConstraint(SpringLayout.WEST, lblAiName2, 10, SpringLayout.WEST, ai2Panel);
		lblAiName2.setForeground(Color.WHITE);
		lblAiName2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		ai2Panel.add(lblAiName2);
		
		JLabel lblAi2Funds = new JLabel("Funds:");
		sl_ai2Panel.putConstraint(SpringLayout.WEST, lblAi2Funds, 0, SpringLayout.WEST, lblAiName2);
		sl_ai2Panel.putConstraint(SpringLayout.SOUTH, lblAi2Funds, -10, SpringLayout.SOUTH, ai2Panel);
		lblAi2Funds.setForeground(Color.WHITE);
		lblAi2Funds.setFont(new Font("Tahoma", Font.PLAIN, 22));
		ai2Panel.add(lblAi2Funds);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_ai2Panel.putConstraint(SpringLayout.NORTH, label_4, -102, SpringLayout.NORTH, lblAi2Funds);
		sl_ai2Panel.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, lblAiName2);
		sl_ai2Panel.putConstraint(SpringLayout.SOUTH, label_4, -6, SpringLayout.NORTH, lblAi2Funds);
		sl_ai2Panel.putConstraint(SpringLayout.EAST, label_4, 72, SpringLayout.WEST, lblAiName2);
		label_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		ai2Panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_ai2Panel.putConstraint(SpringLayout.NORTH, label_5, 0, SpringLayout.NORTH, label_4);
		sl_ai2Panel.putConstraint(SpringLayout.WEST, label_5, 27, SpringLayout.EAST, label_4);
		sl_ai2Panel.putConstraint(SpringLayout.SOUTH, label_5, 96, SpringLayout.NORTH, label_4);
		sl_ai2Panel.putConstraint(SpringLayout.EAST, label_5, 99, SpringLayout.EAST, label_4);
		label_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		ai2Panel.add(label_5);
		
		JLabel lblAi2FundsTotal = new JLabel("$500");
		sl_ai2Panel.putConstraint(SpringLayout.NORTH, lblAi2FundsTotal, 0, SpringLayout.NORTH, lblAi2Funds);
		sl_ai2Panel.putConstraint(SpringLayout.WEST, lblAi2FundsTotal, 0, SpringLayout.WEST, label_5);
		sl_ai2Panel.putConstraint(SpringLayout.EAST, lblAi2FundsTotal, 0, SpringLayout.EAST, label_5);
		lblAi2FundsTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblAi2FundsTotal.setForeground(Color.ORANGE);
		lblAi2FundsTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAi2FundsTotal.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ai2Panel.add(lblAi2FundsTotal);
		
		JLabel lblAi2Status = new JLabel("Check");
		sl_ai2Panel.putConstraint(SpringLayout.NORTH, lblAi2Status, -2, SpringLayout.NORTH, lblAiName2);
		sl_ai2Panel.putConstraint(SpringLayout.WEST, lblAi2Status, 0, SpringLayout.WEST, label_5);
		sl_ai2Panel.putConstraint(SpringLayout.EAST, lblAi2Status, 0, SpringLayout.EAST, label_5);
		lblAi2Status.setHorizontalAlignment(SwingConstants.CENTER);
		lblAi2Status.setForeground(Color.WHITE);
		lblAi2Status.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAi2Status.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ai2Panel.add(lblAi2Status);
		SpringLayout sl_ai1Panel = new SpringLayout();
		ai1Panel.setLayout(sl_ai1Panel);
		
		JLabel lblAiName1 = new JLabel("A.I. 1");
		sl_ai1Panel.putConstraint(SpringLayout.NORTH, lblAiName1, 10, SpringLayout.NORTH, ai1Panel);
		sl_ai1Panel.putConstraint(SpringLayout.WEST, lblAiName1, 10, SpringLayout.WEST, ai1Panel);
		lblAiName1.setForeground(Color.WHITE);
		lblAiName1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		ai1Panel.add(lblAiName1);
		
		JLabel lblAi1Card1 = new JLabel("");
		lblAi1Card1.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_ai1Panel.putConstraint(SpringLayout.NORTH, lblAi1Card1, 6, SpringLayout.SOUTH, lblAiName1);
		sl_ai1Panel.putConstraint(SpringLayout.WEST, lblAi1Card1, 0, SpringLayout.WEST, lblAiName1);
		sl_ai1Panel.putConstraint(SpringLayout.SOUTH, lblAi1Card1, -51, SpringLayout.SOUTH, ai1Panel);
		sl_ai1Panel.putConstraint(SpringLayout.EAST, lblAi1Card1, 72, SpringLayout.WEST, lblAiName1);
		lblAi1Card1.setBorder(new LineBorder(new Color(0, 0, 0)));
		ai1Panel.add(lblAi1Card1);
		
		JLabel lblAi1Card2 = new JLabel("");
		lblAi1Card2.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_ai1Panel.putConstraint(SpringLayout.NORTH, lblAi1Card2, 43, SpringLayout.NORTH, ai1Panel);
		sl_ai1Panel.putConstraint(SpringLayout.WEST, lblAi1Card2, -82, SpringLayout.EAST, ai1Panel);
		sl_ai1Panel.putConstraint(SpringLayout.SOUTH, lblAi1Card2, -51, SpringLayout.SOUTH, ai1Panel);
		sl_ai1Panel.putConstraint(SpringLayout.EAST, lblAi1Card2, -10, SpringLayout.EAST, ai1Panel);
		lblAi1Card2.setBorder(new LineBorder(new Color(0, 0, 0)));
		ai1Panel.add(lblAi1Card2);
		
		JLabel lblAi1Status = new JLabel("Check");
		sl_ai1Panel.putConstraint(SpringLayout.WEST, lblAi1Status, 0, SpringLayout.WEST, lblAi1Card2);
		sl_ai1Panel.putConstraint(SpringLayout.SOUTH, lblAi1Status, 0, SpringLayout.SOUTH, lblAiName1);
		sl_ai1Panel.putConstraint(SpringLayout.EAST, lblAi1Status, 0, SpringLayout.EAST, lblAi1Card2);
		lblAi1Status.setHorizontalAlignment(SwingConstants.CENTER);
		lblAi1Status.setForeground(Color.WHITE);
		lblAi1Status.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAi1Status.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ai1Panel.add(lblAi1Status);
		
		JLabel lblAi1Funds = new JLabel("Funds:");
		sl_ai1Panel.putConstraint(SpringLayout.WEST, lblAi1Funds, 0, SpringLayout.WEST, lblAiName1);
		sl_ai1Panel.putConstraint(SpringLayout.SOUTH, lblAi1Funds, -10, SpringLayout.SOUTH, ai1Panel);
		lblAi1Funds.setForeground(Color.WHITE);
		lblAi1Funds.setFont(new Font("Tahoma", Font.PLAIN, 22));
		ai1Panel.add(lblAi1Funds);
		
		JLabel lblAi1FundsTotal = new JLabel("$500");
		lblAi1FundsTotal.setHorizontalAlignment(SwingConstants.CENTER);
		sl_ai1Panel.putConstraint(SpringLayout.NORTH, lblAi1FundsTotal, -2, SpringLayout.NORTH, lblAi1Funds);
		sl_ai1Panel.putConstraint(SpringLayout.WEST, lblAi1FundsTotal, 0, SpringLayout.WEST, lblAi1Card2);
		sl_ai1Panel.putConstraint(SpringLayout.EAST, lblAi1FundsTotal, 0, SpringLayout.EAST, lblAi1Card2);
		lblAi1FundsTotal.setForeground(Color.ORANGE);
		lblAi1FundsTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAi1FundsTotal.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ai1Panel.add(lblAi1FundsTotal);
		SpringLayout sl_playerPanel = new SpringLayout();
		playerPanel.setLayout(sl_playerPanel);
		
		JLabel lblPlayerCard1 = new JLabel("");
		sl_playerPanel.putConstraint(SpringLayout.NORTH, lblPlayerCard1, 29, SpringLayout.NORTH, playerPanel);
		sl_playerPanel.putConstraint(SpringLayout.WEST, lblPlayerCard1, 128, SpringLayout.WEST, playerPanel);
		sl_playerPanel.putConstraint(SpringLayout.SOUTH, lblPlayerCard1, -29, SpringLayout.SOUTH, playerPanel);
		sl_playerPanel.putConstraint(SpringLayout.EAST, lblPlayerCard1, -272, SpringLayout.EAST, playerPanel);
		lblPlayerCard1.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		lblPlayerCard1.setBorder(new LineBorder(new Color(0, 0, 0)));
		playerPanel.add(lblPlayerCard1);
		
		JLabel lblPlayerCard2 = new JLabel("");
		lblPlayerCard2.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_playerPanel.putConstraint(SpringLayout.NORTH, lblPlayerCard2, 0, SpringLayout.NORTH, lblPlayerCard1);
		sl_playerPanel.putConstraint(SpringLayout.WEST, lblPlayerCard2, 72, SpringLayout.EAST, lblPlayerCard1);
		sl_playerPanel.putConstraint(SpringLayout.SOUTH, lblPlayerCard2, -29, SpringLayout.SOUTH, playerPanel);
		sl_playerPanel.putConstraint(SpringLayout.EAST, lblPlayerCard2, -128, SpringLayout.EAST, playerPanel);
		lblPlayerCard2.setBorder(new LineBorder(new Color(0, 0, 0)));
		playerPanel.add(lblPlayerCard2);
		
		JLabel lblPlayerName = new JLabel("Player");
		sl_playerPanel.putConstraint(SpringLayout.NORTH, lblPlayerName, 10, SpringLayout.NORTH, playerPanel);
		sl_playerPanel.putConstraint(SpringLayout.WEST, lblPlayerName, 10, SpringLayout.WEST, playerPanel);
		lblPlayerName.setForeground(Color.WHITE);
		lblPlayerName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		playerPanel.add(lblPlayerName);
		
		JLabel lblPlayerFunds = new JLabel("Funds:");
		sl_playerPanel.putConstraint(SpringLayout.NORTH, lblPlayerFunds, 0, SpringLayout.NORTH, lblPlayerName);
		sl_playerPanel.putConstraint(SpringLayout.EAST, lblPlayerFunds, -29, SpringLayout.EAST, playerPanel);
		lblPlayerFunds.setForeground(Color.WHITE);
		lblPlayerFunds.setFont(new Font("Tahoma", Font.PLAIN, 22));
		playerPanel.add(lblPlayerFunds);
		
		JLabel lblPlayerFundsTotal = new JLabel("$500");
		lblPlayerFundsTotal.setHorizontalAlignment(SwingConstants.CENTER);
		sl_playerPanel.putConstraint(SpringLayout.NORTH, lblPlayerFundsTotal, 9, SpringLayout.SOUTH, lblPlayerFunds);
		sl_playerPanel.putConstraint(SpringLayout.WEST, lblPlayerFundsTotal, 0, SpringLayout.WEST, lblPlayerFunds);
		sl_playerPanel.putConstraint(SpringLayout.EAST, lblPlayerFundsTotal, 0, SpringLayout.EAST, lblPlayerFunds);
		lblPlayerFundsTotal.setForeground(Color.ORANGE);
		lblPlayerFundsTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPlayerFundsTotal.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		playerPanel.add(lblPlayerFundsTotal);
		
		JLabel lblPlayerStatus = new JLabel("Call");
		lblPlayerStatus.setHorizontalAlignment(SwingConstants.CENTER);
		sl_playerPanel.putConstraint(SpringLayout.NORTH, lblPlayerStatus, 29, SpringLayout.SOUTH, lblPlayerName);
		sl_playerPanel.putConstraint(SpringLayout.WEST, lblPlayerStatus, 0, SpringLayout.WEST, lblPlayerName);
		sl_playerPanel.putConstraint(SpringLayout.EAST, lblPlayerStatus, 0, SpringLayout.EAST, lblPlayerName);
		lblPlayerStatus.setForeground(new Color(255, 255, 255));
		lblPlayerStatus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPlayerStatus.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		playerPanel.add(lblPlayerStatus);
		SpringLayout sl_drawPanel = new SpringLayout();
		drawPanel.setLayout(sl_drawPanel);
		
		JLabel lblCardDraw1 = new JLabel("");
		lblCardDraw1.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_drawPanel.putConstraint(SpringLayout.NORTH, lblCardDraw1, 10, SpringLayout.NORTH, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.WEST, lblCardDraw1, 10, SpringLayout.WEST, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, lblCardDraw1, 106, SpringLayout.NORTH, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.EAST, lblCardDraw1, 82, SpringLayout.WEST, drawPanel);
		lblCardDraw1.setBorder(new LineBorder(new Color(0, 0, 0)));
		drawPanel.add(lblCardDraw1);
		
		JLabel lblCardDraw2 = new JLabel("");
		lblCardDraw2.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_drawPanel.putConstraint(SpringLayout.NORTH, lblCardDraw2, 0, SpringLayout.NORTH, lblCardDraw1);
		sl_drawPanel.putConstraint(SpringLayout.WEST, lblCardDraw2, 25, SpringLayout.EAST, lblCardDraw1);
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, lblCardDraw2, 0, SpringLayout.SOUTH, lblCardDraw1);
		lblCardDraw2.setBorder(new LineBorder(new Color(0, 0, 0)));
		drawPanel.add(lblCardDraw2);
		
		JLabel lblCardDraw3 = new JLabel("");
		lblCardDraw3.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_drawPanel.putConstraint(SpringLayout.WEST, lblCardDraw3, 200, SpringLayout.WEST, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.EAST, lblCardDraw3, -200, SpringLayout.EAST, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.EAST, lblCardDraw2, -21, SpringLayout.WEST, lblCardDraw3);
		sl_drawPanel.putConstraint(SpringLayout.NORTH, lblCardDraw3, 10, SpringLayout.NORTH, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, lblCardDraw3, 96, SpringLayout.NORTH, lblCardDraw1);
		lblCardDraw3.setBorder(new LineBorder(new Color(0, 0, 0)));
		drawPanel.add(lblCardDraw3);
		
		JLabel lblCardDrawTurn = new JLabel("");
		lblCardDrawTurn.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_drawPanel.putConstraint(SpringLayout.NORTH, lblCardDrawTurn, 0, SpringLayout.NORTH, lblCardDraw1);
		sl_drawPanel.putConstraint(SpringLayout.WEST, lblCardDrawTurn, 25, SpringLayout.EAST, lblCardDraw3);
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, lblCardDrawTurn, 96, SpringLayout.NORTH, lblCardDraw1);
		lblCardDrawTurn.setBorder(new LineBorder(new Color(0, 0, 0)));
		drawPanel.add(lblCardDrawTurn);
		
		JLabel lblCardDrawRiver = new JLabel("");
		lblCardDrawRiver.setIcon(new ImageIcon(GameTable.class.getResource("/resources/b2fv.png")));
		sl_drawPanel.putConstraint(SpringLayout.EAST, lblCardDrawTurn, -21, SpringLayout.WEST, lblCardDrawRiver);
		sl_drawPanel.putConstraint(SpringLayout.NORTH, lblCardDrawRiver, 0, SpringLayout.NORTH, lblCardDraw1);
		sl_drawPanel.putConstraint(SpringLayout.WEST, lblCardDrawRiver, -82, SpringLayout.EAST, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, lblCardDrawRiver, 96, SpringLayout.NORTH, lblCardDraw1);
		sl_drawPanel.putConstraint(SpringLayout.EAST, lblCardDrawRiver, -10, SpringLayout.EAST, drawPanel);
		lblCardDrawRiver.setBorder(new LineBorder(new Color(0, 0, 0)));
		drawPanel.add(lblCardDrawRiver);
		
		JButton btnRaise = new JButton("Raise");
		btnRaise.setFont(new Font("Tahoma", Font.PLAIN, 22));
		drawPanel.add(btnRaise);
		
		JButton btnFold = new JButton("Fold");
		sl_drawPanel.putConstraint(SpringLayout.WEST, btnFold, 0, SpringLayout.WEST, lblCardDraw3);
		btnFold.setFont(new Font("Tahoma", Font.PLAIN, 22));
		drawPanel.add(btnFold);
		
		JButton btnCheck = new JButton("Check");
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, btnCheck, -26, SpringLayout.SOUTH, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.NORTH, btnFold, 0, SpringLayout.NORTH, btnCheck);
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, btnRaise, -33, SpringLayout.NORTH, btnCheck);
		sl_drawPanel.putConstraint(SpringLayout.EAST, btnCheck, 0, SpringLayout.EAST, lblCardDraw2);
		btnCheck.setFont(new Font("Tahoma", Font.PLAIN, 22));
		drawPanel.add(btnCheck);
		
		JSpinner spinner = new JSpinner();
		sl_drawPanel.putConstraint(SpringLayout.NORTH, spinner, 47, SpringLayout.SOUTH, lblCardDraw3);
		sl_drawPanel.putConstraint(SpringLayout.WEST, spinner, 259, SpringLayout.WEST, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.SOUTH, spinner, -34, SpringLayout.NORTH, btnFold);
		sl_drawPanel.putConstraint(SpringLayout.EAST, spinner, -142, SpringLayout.EAST, drawPanel);
		sl_drawPanel.putConstraint(SpringLayout.EAST, btnRaise, -43, SpringLayout.WEST, spinner);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 22));
		drawPanel.add(spinner);
		
		JButton btnCall = new JButton("Call");
		sl_drawPanel.putConstraint(SpringLayout.NORTH, btnCall, 0, SpringLayout.NORTH, btnFold);
		sl_drawPanel.putConstraint(SpringLayout.WEST, btnCall, 0, SpringLayout.WEST, lblCardDrawTurn);
		btnCall.setFont(new Font("Tahoma", Font.PLAIN, 22));
		drawPanel.add(btnCall);
		SpringLayout sl_dealerPanel = new SpringLayout();
		dealerPanel.setLayout(sl_dealerPanel);
		
		JLabel lblCurrentPot = new JLabel("Current Pot: ");
		sl_dealerPanel.putConstraint(SpringLayout.NORTH, lblCurrentPot, 10, SpringLayout.NORTH, dealerPanel);
		sl_dealerPanel.putConstraint(SpringLayout.WEST, lblCurrentPot, 10, SpringLayout.WEST, dealerPanel);
		lblCurrentPot.setForeground(new Color(255, 255, 255));
		lblCurrentPot.setFont(new Font("Tahoma", Font.PLAIN, 22));
		dealerPanel.add(lblCurrentPot);
		
		JLabel lblCurrentBet = new JLabel(":Current Bet");
		sl_dealerPanel.putConstraint(SpringLayout.NORTH, lblCurrentBet, 0, SpringLayout.NORTH, lblCurrentPot);
		sl_dealerPanel.putConstraint(SpringLayout.EAST, lblCurrentBet, -10, SpringLayout.EAST, dealerPanel);
		lblCurrentBet.setForeground(new Color(255, 255, 255));
		lblCurrentBet.setFont(new Font("Tahoma", Font.PLAIN, 22));
		dealerPanel.add(lblCurrentBet);
		
		JButton btnNewButton = new JButton("Deal");
		sl_dealerPanel.putConstraint(SpringLayout.EAST, btnNewButton, -372, SpringLayout.EAST, dealerPanel);
		sl_dealerPanel.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.NORTH, dealerPanel);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		dealerPanel.add(btnNewButton);
		
		JLabel lblCurrentPotTotal = new JLabel("$500");
		lblCurrentPotTotal.setHorizontalAlignment(SwingConstants.CENTER);
		sl_dealerPanel.putConstraint(SpringLayout.NORTH, lblCurrentPotTotal, -2, SpringLayout.NORTH, lblCurrentPot);
		sl_dealerPanel.putConstraint(SpringLayout.WEST, lblCurrentPotTotal, 6, SpringLayout.EAST, lblCurrentPot);
		sl_dealerPanel.putConstraint(SpringLayout.EAST, lblCurrentPotTotal, -119, SpringLayout.WEST, btnNewButton);
		lblCurrentPotTotal.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblCurrentPotTotal.setForeground(Color.ORANGE);
		lblCurrentPotTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		dealerPanel.add(lblCurrentPotTotal);
		
		JLabel lblCurrentBetTotal = new JLabel("$500");
		sl_dealerPanel.putConstraint(SpringLayout.NORTH, lblCurrentBetTotal, -2, SpringLayout.NORTH, lblCurrentPot);
		sl_dealerPanel.putConstraint(SpringLayout.WEST, lblCurrentBetTotal, 125, SpringLayout.EAST, btnNewButton);
		sl_dealerPanel.putConstraint(SpringLayout.EAST, lblCurrentBetTotal, -6, SpringLayout.WEST, lblCurrentBet);
		lblCurrentBetTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentBetTotal.setForeground(Color.ORANGE);
		lblCurrentBetTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCurrentBetTotal.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		dealerPanel.add(lblCurrentBetTotal);
		contentPane.setLayout(gl_contentPane);
	}
}