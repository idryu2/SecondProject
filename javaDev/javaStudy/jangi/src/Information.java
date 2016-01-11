import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


@SuppressWarnings("serial")
public class Information extends JPanel {
	JLabel RemainTime, PlayTime;
	JButton Startbu;
	JButton Endbu;
	JPanel jp2;
	JButton HansuBack;
	JToggleButton[] Player;
	PlayTimer PlayTimer;
	RemainTimer RemainTimer;
	JPanel[] PlayerPanel;
	int hours, mins, secs, hours1, mins1, secs1;
	double oo, xx, oo1, xx1;
	boolean loop, first = true, TurnIsChange = false;
	ImageIcon icon;
	
	boolean IsStart;
	void setTurnIsChangeToTrue() {// TurnIsChange를 True로 만듬.턴이바뀌면 남은시간 초기화를 위해서
		TurnIsChange = true;
		SetTurn();
	}
	void SetTurn(){//턴이 바뀌면 토글버튼도 바뀌게
		if(Player[0].isSelected()){
			Player[0].setSelected(false);
			Player[1].setSelected(true);
		}
		else{
			Player[1].setSelected(false);
			Player[0].setSelected(true);
		}
	}
	void ResetTimer(){
		PlayTime.setText("00:00:00");
		RemainTime.setText("00:00:00");
		HansuBack.setVisible(false);
		Startbu.setVisible(true);
		PlayTimer.suspend();
		RemainTimer.suspend();
		IsStart=false;
	}
	void setPlayerEatMal(int killedMal) {
		String MalImg = null;
		switch (killedMal) {
		case 1:
			MalImg = "images/chang.jpg";
			break;
		case 2:
			MalImg = "images/cha.jpg";
			break;
		case 3:
			MalImg = "images/po.jpg";
			break;
		case 4:
			MalImg = "images/ma.jpg";
			break;
		case 5:
			MalImg = "images/sang.jpg";
			break;
		case 6:
			MalImg = "images/sa.jpg";
			break;
		case 7:
			MalImg = "images/jol.jpg";
			break;
		case 8:
			MalImg = "images/rchang.jpg";
			break;
		case 9:
			MalImg = "images/rcha.jpg";
			break;
		case 10:
			MalImg = "images/rpo.jpg";
			break;
		case 11:
			MalImg = "images/rma.jpg";
			break;
		case 12:
			MalImg = "images/rsang.jpg";
			break;
		case 13:
			MalImg = "images/rsa.jpg";
			break;
		case 14:
			MalImg = "images/rjol.jpg";
			break;
		}
		PlayerPanel[KoreaChess.myTurn].add(new JLabel(new ImageIcon(MalImg)));
	}

	public Information() {
		setLayout(null);
		icon = new ImageIcon("Images/board.jpg");
		jp2 = new JPanel();
		jp2.setLayout(null);
		add(jp2);
		TitledBorder TB = new TitledBorder(new LineBorder(Color.black));
		Font font = new Font("Arial", Font.ITALIC, 20);
		RemainTime = new JLabel();
		RemainTime.setBounds(0, 0, 200, 100);
		RemainTime.setHorizontalAlignment(SwingConstants.CENTER);
		RemainTime.setText("00:00:00");
		RemainTime.setBorder(TB);
		RemainTime.setFont(font);
		PlayTime = new JLabel(){
			public void paintComponents(Graphics g){
				//super.paintComponents(g);
				g.drawImage(icon.getImage(), 0, 0, 100, 80, null);
			}
		};
		PlayTime.setBounds(0, 100, 200, 80);
		PlayTime.setHorizontalAlignment(SwingConstants.CENTER);
		PlayTime.setText("00:00:00");
		PlayTime.setBorder(TB);
		PlayTime.setFont(font);
		
		HansuBack = new JButton();
		HansuBack.setBounds(0, 510, 100, 120);
		HansuBack.setVisible(false);
		HansuBack.setText("한수물리기");
		HansuBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				KoreaChess.changeTurn();
				setTurnIsChangeToTrue();
			}
		});

		Player = new JToggleButton[2];
		for (int i = 0; i < 2; i++) {
			Player[i] = new JToggleButton();
			Player[i].setText("Player " + (i + 1));
			Player[i].setBorder(TB);
			Player[i].setBounds(100 * i, 180, 100, 30);
			Player[i].setEnabled(false);
			add(Player[i]);
		}
		Player[0].setSelected(true);
		
		PlayerPanel = new JPanel[2];
		for (int i = 0; i < 2; i++) {
			PlayerPanel[i] = new JPanel();
			PlayerPanel[i].setLayout(new FlowLayout());
			PlayerPanel[i].setBounds(100 * i, 210, 100, 300);
			PlayerPanel[i].setBorder(TB);
			add(PlayerPanel[i]);
		}

		Startbu = new JButton();
		Startbu.setBounds(0, 510, 100, 120);
		Startbu.setText("시작");
		Startbu.addMouseListener(new ButtonMouseListener());
		Endbu = new JButton();
		Endbu.setBounds(100, 510, 100, 120);
		Endbu.setText("끝내기");
		Endbu.addMouseListener(new ButtonMouseListener());
		add(RemainTime);
		add(PlayTime);
		add(HansuBack);
		add(Startbu);
		add(Endbu);

		setFocusable(false);
		setLocation(655, 0);
		setSize(200, 730);
		setVisible(true);
		PlayTimer = new PlayTimer();
		RemainTimer = new RemainTimer();

	}

	class PlayTimer extends Thread {
		void timer1() {// 플레이 시간
			xx = (System.currentTimeMillis() - oo) / 1000d;
			hours = ((int) xx % 86400) / 3600;
			mins = ((int) xx % 3600) / 60;
			secs = (int) xx % 60;
			PlayTime.setText(String.format("%02d:%02d:%02d  ", hours, mins,
					secs));
			//le.repaint();
		}

		public void run() {
			// while (true) {
			while (true) {
				try {
					if (loop) {
						Thread.sleep(100);
						timer1();
					} else {
						Thread.sleep(1000 * 60 * 60 * 24); // 24시간 정지상태
					}
				} catch (InterruptedException e) {
					break;
				}
			}
			// }
		}
	}

	class RemainTimer extends Thread {
		void timer() {// 남은시간
			xx1 = (oo1 + (60000d) - System.currentTimeMillis()) / 1000d;
			hours1 = ((int) xx1 % 86400) / 3600;
			mins1 = ((int) xx1 % 3600) / 60;
			secs1 = (int) xx1 % 60;
			RemainTime.setText(String.format("%02d:%02d:%02d  ", hours1, mins1,
					secs1));
			// 턴이 바뀌었거나 시간이 초과됐을때
			if (oo1 + (60000d) - System.currentTimeMillis() <= 0d
					|| TurnIsChange) {
				if (oo1 + (60000d) - System.currentTimeMillis() <= 0d)// 만약 상태가
																		// 시간초과라면
					KoreaChess.changeTurn();// 턴을 바꾼다
				oo1 = System.currentTimeMillis();
				TurnIsChange = false;
			}
		}

		public void run() {
			// while (true) {
			while (true) {
				try {
					if (loop) {
						Thread.sleep(100);
						timer();
					} else {
						Thread.sleep(1000 * 60 * 60 * 24); // 24시간 정지상태
					}
				} catch (InterruptedException e) {
					break;
				}
				// }
			}
		}

	}

	class ButtonMouseListener implements MouseListener {

		@SuppressWarnings("deprecation")
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == Startbu) {
				
				if (first) {// 처음 시작 눌렀을때(처음 실행할때)
					loop = true;
					oo = System.currentTimeMillis();//기준 시간을 정한다.
					oo1 = System.currentTimeMillis();//기준 시간을 정함
					PlayTimer.start();
					RemainTimer.start();
					first = false;
				} else {// 끝내기 누른후 시작 눌렀을때(처음 실행이 아닐때)
					oo = System.currentTimeMillis();
					oo1 = System.currentTimeMillis();
					PlayTimer.resume();
					RemainTimer.resume();
				}
				IsStart=true;
				HansuBack.setVisible(true);
				Startbu.setVisible(false);
			} else if (e.getSource() == Endbu) {
				ResetTimer();
				IsStart=false;
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

	}
}
