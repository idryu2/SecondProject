import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class KoreaChess {
	final int NULL = 0;

	final int chang = 1;
	final int cha = 2;
	final int pho = 3;
	final int ma = 4;
	final int sang = 5;
	final int sa = 6;
	final int jol = 7;

	final int Rchang = 8;
	final int Rcha = 9;
	final int Rpho = 10;
	final int Rma = 11;
	final int Rsang = 12;
	final int Rsa = 13;
	final int Rjol = 14;

	static int myTurn = 0;
	boolean start = false;
	boolean janggun = false;
	Information information;
	CheckStart check;

	JFrame mainFrame;
	JPanel panel = new JPanel();
	JPanel gameZone = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(icon.getImage(), 0, 0, 653, getHeight(), null);
			setOpaque(false);
			super.paintComponent(g);
		}
	};
	ImageIcon icon;
	GameMenu menu;
	CheckMove checkmove = new CheckMove();
	int[][] janggiBoard;
	int[] malIndex, malIndextmp;
	
	//Sound killSound; 
	//Sound endSound;
	//Sound moveSound;
	//Sound repeatSound;

	public KoreaChess() {
		mainFrame = new JFrame();
		mainFrame.setTitle("!- Janggi. F -!");
		mainFrame.setLayout(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		information = new Information();
		icon = new ImageIcon("images/board.jpg");
		menu = new GameMenu();
		check = new CheckStart();

		//killSound = new Sound("media/kill.wav", false);
		//endSound = new Sound("media/end.wav", false);
		//moveSound = new Sound("media/move.wav", false);
		//repeatSound = new Sound("media/end.wav", true);

		panel.setLayout(null);
		gameZone.setLayout(null);
		janggiBoard = init();
		gameZone = Locate(janggiBoard, gameZone);
		panel.add(gameZone);
		panel.add(information);
		check.start();

		gameZone.setSize(653, 730);
		mainFrame.setJMenuBar(menu);
		mainFrame.setContentPane(panel);
		mainFrame.setBounds(100, 100, 862, 790/*760*/);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);

		//repeatSound.wakeup();
	}
	
	class CheckStart extends Thread {
		int count = 0;

		public void run() {
			// while (true) {
			while (true) {
				if(!information.IsStart && count==0){
					janggiBoard = init();
					gameZone.removeAll();
					gameZone = Locate(janggiBoard, gameZone);
					gameZone.repaint();
					myTurn = 0;
					information.Player[0].setSelected(true);
					information.Player[1].setSelected(false);
					count++;
				}else if(information.IsStart && count != 0){
					count = 0;
				}
					
			}
			// }
		}
	}

	public class mal extends JButton {
		int x;
		int y;
		ImageIcon icon;

		public mal(int i, int j, String imagePath) {
			setSize(40, 40);
			setLocation((i * 72 + 20), (j * 72 + 20));
			icon = new ImageIcon(imagePath);

			addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					if (information.IsStart) {

						JButton btn = (JButton) e.getSource();
						btn.setSelected(false);
						x = e.getXOnScreen() - mainFrame.getX();
						y = e.getYOnScreen() - mainFrame.getY() - 30;
						System.out.println(x + "  " + y);
						malIndex = getIndex(x, y);
						System.out.println(malIndex[0] + "  " + malIndex[1]);
						System.out
								.println(janggiBoard[malIndextmp[0]][malIndextmp[1]]);
						System.out.println(myTurn);
						if (janggiBoard[malIndextmp[0]][malIndextmp[1]] / 8 == myTurn) {
							if (malIndex[0] == malIndextmp[0]
									&& malIndextmp[1] == malIndex[1])
								;
							else if (checkmove
									.CheackMalMove(
											janggiBoard,
											janggiBoard[malIndextmp[0]][malIndextmp[1]],
											malIndextmp, malIndex)) {
								if (janggiBoard[malIndex[0]][malIndex[1]] == NULL) {
									janggiBoard[malIndex[0]][malIndex[1]] = janggiBoard[malIndextmp[0]][malIndextmp[1]];
									janggiBoard[malIndextmp[0]][malIndextmp[1]] = NULL;
									//moveSound.wakeup();
									checkJang();
								} else if (janggiBoard[malIndex[0]][malIndex[1]] / 8 == janggiBoard[malIndextmp[0]][malIndextmp[1]] / 8)
									;
								else if (janggiBoard[malIndex[0]][malIndex[1]] % 7 == 3
										&& janggiBoard[malIndextmp[0]][malIndextmp[1]] % 7 == 3)
									;
								else {

									if (myTurn == 0
											&& janggiBoard[malIndex[0]][malIndex[1]] == 8) {
										janggiBoard[malIndex[0]][malIndex[1]] = janggiBoard[malIndextmp[0]][malIndextmp[1]];
										janggiBoard[malIndextmp[0]][malIndextmp[1]] = NULL;
										start = false;
										//endSound.wakeup();
										JOptionPane.showConfirmDialog(null,
												"������ ����������.", "����",
												JOptionPane.WARNING_MESSAGE);
										information.IsStart = false;
										information.ResetTimer();
										information.IsStart=false;
										information.PlayerPanel[0].removeAll();
										information.PlayerPanel[1].removeAll();	
									} else if (myTurn == 1
											&& janggiBoard[malIndex[0]][malIndex[1]] == 1) {
										janggiBoard[malIndex[0]][malIndex[1]] = janggiBoard[malIndextmp[0]][malIndextmp[1]];
										janggiBoard[malIndextmp[0]][malIndextmp[1]] = NULL;
										start = false;
										//endSound.wakeup();
										JOptionPane.showConfirmDialog(null,
												"������ ����������.", "����",
												JOptionPane.WARNING_MESSAGE);
										information.IsStart = false;
										information.ResetTimer();
										information.IsStart=false;
										information.PlayerPanel[0].removeAll();
										information.PlayerPanel[1].removeAll();	
									} else {
										
										information.setPlayerEatMal(janggiBoard[malIndex[0]][malIndex[1]]);
										janggiBoard[malIndex[0]][malIndex[1]] = janggiBoard[malIndextmp[0]][malIndextmp[1]];
										janggiBoard[malIndextmp[0]][malIndextmp[1]] = NULL;
										//killSound.wakeup();
										checkJang();
									}
								}
							}
						}

						btn.setLocation(checkPlace(x, y));
						gameZone.removeAll();
						gameZone = Locate(janggiBoard, gameZone);
						gameZone.repaint();
						Rint(janggiBoard);
						System.out.println("");
					}

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					JButton btn = (JButton) e.getSource();
					btn.setSelected(false);
					x = e.getXOnScreen() - mainFrame.getX();
					y = e.getYOnScreen() - mainFrame.getY() - 30;
					malIndextmp = getIndex(x, y);
					System.out.println(malIndextmp[0] + "  " + malIndextmp[1]);

				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
				}
			});

			addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					if (information.IsStart) {
						JButton btn = (JButton) e.getSource();
						x = e.getXOnScreen() - mainFrame.getX();
						y = e.getYOnScreen() - mainFrame.getY();
						if (x < 650 && x > 10 && y < 770 && y > 10)
							btn.setLocation(x - 25, y - 60);
					}

				}

				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub

				}
			});
		}

		public void paintComponent(Graphics g) {
			g.drawImage(icon.getImage(), 0, 0, 40, 40, null);
			setOpaque(false);
		}
	}

	public int[] getIndex(int ox, int oy) {
		int[] Index = new int[2];
		Point tmp = new Point();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if ((tmp.x - ox) * (tmp.x - ox) + (tmp.y - oy) * (tmp.y - oy) > (((i + 1) * 72) - ox)
						* (((i + 1) * 72) - ox)
						+ (((j + 1) * 72) - oy)
						* (((j + 1) * 72) - oy)) {
					tmp.setLocation(i * 72 + 20, j * 72 + 20);
					Index[0] = i;
					Index[1] = j;
				}
			}
		}

		return Index;
	}

	public Point checkPlace(int ox, int oy) {
		Point Place = new Point();
		Point tmp = new Point();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if ((tmp.x - ox) * (tmp.x - ox) + (tmp.y - oy) * (tmp.y - oy) > (((i + 1) * 72) - ox)
						* (((i + 1) * 72) - ox)
						+ (((j + 1) * 72) - oy)
						* (((j + 1) * 72) - oy)) {
					tmp.setLocation(i * 72 + 20, j * 72 + 20);
				}
			}
		}
		Place.setLocation(tmp.getLocation());

		return Place;
	}

	public void Rint(int[][] janggiBoard) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" " + janggiBoard[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public int[][] init() {

		int[][] Janggipan = {
				{ cha, NULL, NULL, jol, NULL, NULL, Rjol, NULL, NULL, Rcha },
				{ sang, NULL, pho, NULL, NULL, NULL, NULL, Rpho, NULL, Rma },
				{ ma, NULL, NULL, jol, NULL, NULL, Rjol, NULL, NULL, Rsang },
				{ sa, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, Rsa },
				{ NULL, chang, NULL, jol, NULL, NULL, Rjol, NULL, Rchang, NULL },
				{ sa, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, Rsa },
				{ sang, NULL, NULL, jol, NULL, NULL, Rjol, NULL, NULL, Rsang },
				{ ma, NULL, pho, NULL, NULL, NULL, NULL, Rpho, NULL, Rma },
				{ cha, NULL, NULL, jol, NULL, NULL, Rjol, NULL, NULL, Rcha }

		};

		return Janggipan;
	}

	public JPanel Locate(int[][] board, JPanel Janggi) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if (board[i][j] == chang) {
					mal Pchang = new mal(i, j, "images/chang.jpg");
					Pchang.setBackground(Color.GREEN);
					Pchang.setName("images/chang.jpg");
					Janggi.add(Pchang);
				} else if (board[i][j] == cha) {
					mal Pcha = new mal(i, j, "images/cha.jpg");
					Pcha.setBackground(Color.GREEN);
					Pcha.setName("images/cha.jpg");
					Janggi.add(Pcha);
				} else if (board[i][j] == pho) {
					mal Ppho = new mal(i, j, "images/po.jpg");
					Ppho.setBackground(Color.GREEN);
					Ppho.setName("images/po.jpg");
					Janggi.add(Ppho);
				} else if (board[i][j] == ma) {
					mal Pma = new mal(i, j, "images/ma.jpg");
					Pma.setBackground(Color.GREEN);
					Pma.setName("images/ma.jpg");
					Janggi.add(Pma);
				} else if (board[i][j] == sang) {
					mal Psang = new mal(i, j, "images/sang.jpg");
					Psang.setBackground(Color.GREEN);
					Psang.setName("images/sang.jpg");
					Janggi.add(Psang);
				} else if (board[i][j] == sa) {
					mal Psa = new mal(i, j, "images/sa.jpg");
					Psa.setBackground(Color.GREEN);
					Psa.setName("images/sa.jpg");
					Janggi.add(Psa);
				} else if (board[i][j] == jol) {
					mal Pjol = new mal(i, j, "images/jol.jpg");
					Pjol.setBackground(Color.GREEN);
					Pjol.setName("images/jol.jpg");
					Janggi.add(Pjol);
				}

				else if (board[i][j] == Rchang) {
					mal Rchang = new mal(i, j, "images/rchang.jpg");
					Rchang.setBackground(Color.RED);
					Rchang.setName("images/rchang.jpg");
					Janggi.add(Rchang);
				} else if (board[i][j] == Rcha) {
					mal Rcha = new mal(i, j, "images/rcha.jpg");
					Rcha.setBackground(Color.RED);
					Rcha.setName("images/rcha.jpg");
					Janggi.add(Rcha);
				} else if (board[i][j] == Rpho) {
					mal Rpho = new mal(i, j, "images/rpo.jpg");
					Rpho.setBackground(Color.RED);
					Rpho.setName("����");
					Janggi.add(Rpho);
				} else if (board[i][j] == Rma) {
					mal Rma = new mal(i, j, "images/rma.jpg");
					Rma.setBackground(Color.RED);
					Rma.setName("images/rma.jpg");
					Janggi.add(Rma);
				} else if (board[i][j] == Rsang) {
					mal Rsang = new mal(i, j, "images/rsang.jpg");
					Rsang.setBackground(Color.RED);
					Rsang.setName("images/rsang.jpg");
					Janggi.add(Rsang);
				} else if (board[i][j] == Rsa) {
					mal Rsa = new mal(i, j, "images/rsa.jpg");
					Rsa.setBackground(Color.RED);
					Rsa.setName("images/rsa.jpg");
					Janggi.add(Rsa);
				} else if (board[i][j] == Rjol) {
					mal Rjol = new mal(i, j, "images/rjol.jpg");
					Rjol.setBackground(Color.RED);
					Rjol.setName("images/rjol.jpg");
					Janggi.add(Rjol);
				}
			}
		}

		return Janggi;
	}

	public void checkJang() {
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if (janggiBoard[i][j] == 8) {
					malIndex[0] = i;
					malIndex[1] = j;
					janggun = true;
				}
				if (janggun)
					break;
			}
			if (janggun)
				break;
		}
		janggun = false;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if (janggiBoard[i][j] / 8 == 0 && janggiBoard[i][j] != 0) {
					malIndextmp[0] = i;
					malIndextmp[1] = j;
					if (checkmove.CheackMalMove(janggiBoard,
							janggiBoard[i][j], malIndextmp, malIndex)) {
						JOptionPane.showConfirmDialog(null, "����������.", "����",
								JOptionPane.WARNING_MESSAGE);
						janggun = true;
					}
				}
				if (janggun)
					break;
			}
			if (janggun)
				break;
		}
		janggun = false;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if (janggiBoard[i][j] == 1) {
					malIndex[0] = i;
					malIndex[1] = j;
					janggun = true;
				}
				if (janggun)
					break;
			}
			if (janggun)
				break;
		}
		janggun = false;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if (janggiBoard[i][j] / 8 == 1) {
					malIndextmp[0] = i;
					malIndextmp[1] = j;
					if (checkmove.CheackMalMove(janggiBoard,
							janggiBoard[i][j], malIndextmp, malIndex)) {
						JOptionPane.showConfirmDialog(null, "����������.", "����",
								JOptionPane.WARNING_MESSAGE);
						janggun = true;
					}
				}
				if (janggun)
					break;
			}
			if (janggun)
				break;
		}
		janggun = false;
		
		
		if (myTurn == 0) {
			myTurn = 1;
			information.setTurnIsChangeToTrue();
		} else {
			myTurn = 0;
			information.setTurnIsChangeToTrue();
		}

	}

	public static void changeTurn() {
		if (myTurn == 0) {
			myTurn = 1;
		} else {
			myTurn = 0;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KoreaChess();
	}
}