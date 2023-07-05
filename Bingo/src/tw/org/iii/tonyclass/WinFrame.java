package tw.org.iii.tonyclass;

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
		this.addButton(key, button ,true);
		if(! buttons.containsKey(key)) {
			
		}
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
		start = new JButton();
		auto = new JButton();
		clear = new JButton();
		exit = new JButton();
		
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
        start.setText("開始");
        add(start);
        
        auto.setBounds(280,360,240,60);
        auto.setText("自動選號");
        add(auto);
        
        clear.setBounds(30,430,240,60);
        clear.setText("重新選號");
        add(clear);
		
        exit.setBounds(280,430,240,60);
        exit.setText("離開");
        add(exit);
        
        


	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		new WinFrame();

	}

}
