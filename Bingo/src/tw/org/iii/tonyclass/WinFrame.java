package tw.org.iii.tonyclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinFrame extends JFrame {
	private Map<String, List<JButton>> buttons = new HashMap<String,List<JButton>>();
	
	private JTextField jtfRoom,jtfName,jtfIP;
	private JTextArea jtaR,jtaD;
	private JScrollPane jspR,jspD;
	private JButton[] bingo;
	private JButton connectIP,start,auto,clear,exit;
	
	private void addButton(String key,JButton button,boolean flag) {
		if(! buttons.containsKey(key)) {
			buttons.put(key, new ArrayList<JButton>());
		}
		
		List<JButton> buttons = this.buttons.get(key);
		if(!buttons.contains(button)) {
			buttons.add(button);
			if(flag) {
				add(button);
			}
		}
		
	}
	
    private void addButton(String key, JButton button) {
        this.addButton(key, button, true);
    }
	
	
	private List<JButton> getButton(String key) {
        if (! buttons.containsKey(key))
            buttons.put(key, new ArrayList<JButton>());
        return buttons.get(key);
    }
	
	
	
	
	public WinFrame() {
		super("BinGo");
		setLayout(null);
		setBounds(100,100,716, 535);
		setResizable(false); //視窗無法調整大小
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jtfRoom = new JTextField();
		jtfName = new JTextField();
		jtfIP = new JTextField();
		jtaR = new JTextArea();
		jtaD = new JTextArea();
		jspR = new JScrollPane(jtaR);
		jspD = new JScrollPane(jtaD);
		connectIP = new JButton();
		start = new JButton("開始");
		auto = new JButton("自動選號");
		clear = new JButton("重新選號");
		exit = new JButton("離開");
		
        jtfName.setBounds(10, 10, 90, 30);
        jtfName.setEditable(false);
        add(jtfName);
		
        jtfRoom.setBounds(110, 10, 190, 30);
        jtfRoom.setEditable(false);
        jtfRoom.setText("未加入房間");
        add(jtfRoom);
		
        jtfIP.setBounds(310, 10, 280, 30);
        jtfIP.setEditable(false);
        jtfIP.setText("127.0.0.1");//預設IP
        add(jtfIP);
        
        connectIP.setBounds(600, 10, 90, 30);
        connectIP.setText("連接");
        add(connectIP);
        
        jspR.setBounds(500, 60, 140, 330);
        add(jspR);
        
        jspD.setBounds(550,410,140,80);
        add(jspD);
        
        
        start.setBounds(30,360,240,60);
        addButton("start", start);
        addButton("menu", start,false);
        
        auto.setBounds(280,360,240,60);
        addButton("auto", auto);
        addButton("menu", auto,false);
        
        clear.setBounds(30,430,240,60);
        addButton("clear", clear);
        addButton("menu", clear,false);
		
        exit.setBounds(280,430,240,60);
        addButton("exit", exit);
        addButton("menu", exit,false);
        
        for (JButton menu : this.getButton("menu")) {
            menu.setEnabled(false);
        }


	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		new WinFrame();

	}

}
