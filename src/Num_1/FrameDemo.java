package Num_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click");
		JButton bt = new JButton("tobeijing");
		
//		BorderLayout.WEST,
//		BorderLayout.EAST
		frame.getContentPane().add(bt);
		frame.getContentPane().add(button);
		frame.getContentPane().setVisible(true);
		frame.setSize(400,300);
		frame.setLocation(400, 200);
		/*button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				button.setText("welcome");
			}
		});//只要鼠标点击一下就监听到了，不管有没有点击到按钮
		bt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				bt.setText("beijing");
			}
		});*/
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button.setText("me");
			}
		});
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bt.setText("welcome");
			}
		});
		
		
		frame.setVisible(true);
	
	}
}
