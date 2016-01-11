import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class GameMenu extends JMenuBar {
	GameMenu() {
		JMenu fileMenu = new JMenu("File");
		JMenuItem New = new JMenuItem("New");
		JMenuItem Open = new JMenuItem("Open");
		JMenuItem Save = new JMenuItem("Save");
		JMenuItem Exit = new JMenuItem("Exit");

		fileMenu.add(New);
		fileMenu.addSeparator();
		fileMenu.add(Open);
		fileMenu.add(Save);
		fileMenu.addSeparator();
		fileMenu.add(Exit);
		
		JMenu editMenu= new JMenu("Edit");
		JMenuItem Edit = new JMenuItem("Edit");
		
		editMenu.add("Edit");

		add(fileMenu);
		add(editMenu);
		setVisible(true);
	}
}