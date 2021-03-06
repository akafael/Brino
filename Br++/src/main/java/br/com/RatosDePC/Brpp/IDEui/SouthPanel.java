package br.com.RatosDePC.Brpp.IDEui;

/*
Copyright (c) 2016 StarFruitBrasil

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;

public class SouthPanel extends JPanel {
	private static JLabel placaCom;
	private static final long serialVersionUID = 1L;
	private Color branco = new Color(255, 255, 255);
	private Color verde = new Color(72, 155, 0);//11, 125, 73
	public static JTextArea LOG = new JTextArea(5, 10);
	public static JScrollPane LogPanel = new JScrollPane(LOG);
	
	public SouthPanel() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		add(LogPanel, BorderLayout.CENTER);
		LogPanel.setBackground(branco);
		DefaultCaret caret = (DefaultCaret) LOG.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		placaCom = new JLabel("Arduino Uno na COM1");
		setBackground(verde);
		placaCom.setForeground(branco);
		Font font = placaCom.getFont();
		// same font but bold
		Font boldFont = new Font(font.getFontName(), Font.ITALIC, font.getSize()-2);
		placaCom.setFont(boldFont);
		add(placaCom,BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		placaCom.setHorizontalAlignment(SwingConstants.RIGHT);
	}
	public static void updatePlacaCom(String Board, String com){
		placaCom.setText(Board+" na "+com);
	}

}
