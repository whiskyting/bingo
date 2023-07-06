package tw.org.iii.tonyclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class WinFrame extends JFrame {
	private Map<String, List<JButton>> buttons = new HashMap<String,List<JButton>>();
	
	private JTextField jtfRoom,jtfName,jtfIP;
	private JTextArea jtaR,jtaD;
	private JScrollPane jspR,jspD;
	private JButton[] bingo;
	private JButton connectIP,start,auto,clear,exit;
	private boolean room=false,ready=false,startF=false,yourturn=false,roomReady=false;
	private int[] nums;
	private int num = 0;
	private int width = -1;
	private int height = -1;
	private String roomID = "";
	
	
//	public  ClientFrame() {
//		regElement();
//		initComp();
//	}


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
	
	
	
	private List<JButton> getButton(String key) {
        if (! buttons.containsKey(key))
            buttons.put(key, new ArrayList<JButton>());
        return buttons.get(key);
    }
	
	
	
	
	public void regElement() {
		setTitle("BinGo");
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
        
        jspR.setBounds(550, 60, 140, 330);
        add(jspR);
        
        jspD.setBounds(550,410,140,80);
        add(jspD);
        
        
        start.setBounds(30,360,240,60);
        addButton("start", start,true);
        addButton("menu", start,false);
        
        auto.setBounds(280,360,240,60);
        addButton("auto", auto,true);
        addButton("menu", auto,false);
        
        clear.setBounds(30,430,240,60);
        addButton("clear", clear,true);
        addButton("menu", clear,false);
		
        exit.setBounds(280,430,240,60);
        addButton("exit", exit,true);
        addButton("menu", exit,false);
        
        for (JButton menu : this.getButton("menu")) {
            menu.setEnabled(false);
        }
        
        SwingUtilities.updateComponentTreeUI(this);

	}
	
	//遊戲運行初始化
	private void initComp() {
		connectIP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				start();
				checkProgress();
				
			}
		});
		
		auto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				auto();
				checkProgress();
				
			}
		});
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
				checkProgress();
				
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exit();
				checkProgress();
				
			}
		});
		
		jtaD.addKeyListener(new KeyListener() {
			
			boolean flagS = false;
			boolean flagE = false;
			
			
			@Override
			//按著不做功能
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			//釋放按鈕 未完成
			public void keyReleased(KeyEvent e) {
				if (flagE) { //按下enter
					if(flagS) { //強迫換行
						jtaD.setText(jtaD.getText()+"\r\n");
					}else { //送出
//						send
					}
				}
//				if ()
				
			}
			
			@Override
			//按下按鈕
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					flagE = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
					flagS = true;
				}
			}
		});
		
		
	}
	
	
	
	private void sendChat(String msg) {
		
	}
	
	
	
	
	private void checkProgress() {
		if(room) {
			if (startF) {
				for (JButton menu : this.getButton("menu")) {
					menu.setEnabled(false);
				}
			}else {
				for(JButton menu : this.getButton("munu")) {
					menu.setEnabled(true);
				}
			}
			
		}
	}
	
	
	//各按鈕功能
	private void start() {
		if (room) {
			if(ready) {
				
			}
			
		}
	}
	
	private void auto() {
		
	}
	
	private void clear() {
		
	}
	
	private void exit() {
		
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		WinFrame fwk =	new WinFrame();
		fwk.regElement();
		
	}

}
