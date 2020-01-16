package swingPractice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class DrCanvas extends Canvas {
	private MsPaint msPaint;
	ShapeDTO dto;
	private boolean fill;
	private int shape;

	public DrCanvas(MsPaint msPaint) {
		this.msPaint = msPaint;
		this.setBackground(new Color(244, 224, 254)); // 연보라 색으로
		// 이벤트
	}

	@Override
	public void paint(Graphics g) {
		dto = new ShapeDTO();

		// 좌표
		int x1 = Integer.parseInt(msPaint.getX1T().getText().trim());// 양쪽의 공백을 제거해서 가져옴
		int y1 = Integer.parseInt(msPaint.getY1T().getText().trim());
		int x2 = Integer.parseInt(msPaint.getX2T().getText().trim());
		int y2 = Integer.parseInt(msPaint.getY2T().getText().trim());
		int z1 = Integer.parseInt(msPaint.getZ1T().getText().trim());
		int z2 = Integer.parseInt(msPaint.getZ2T().getText().trim());
		dto.setX1(x1);
		dto.setY1(y1);
		dto.setX2(x2);

		dto.setY2(y2);
		dto.setZ1(z1);
		dto.setZ2(z2);

		// 색
		switch (msPaint.getCombo().getSelectedIndex()) {
		case 0:
			g.setColor(new Color(255, 0, 0));
			dto.setColor(g.getColor());
			break;
		case 1:
			g.setColor(new Color(255, 100, 0));
			dto.setColor(g.getColor());
			break;
		case 2:
			g.setColor(new Color(255, 255, 0));
			dto.setColor(g.getColor());
			break;
		case 3:
			g.setColor(new Color(0, 255, 0));
			dto.setColor(g.getColor());
			break;
		case 4:
			g.setColor(new Color(0, 0, 255));
			dto.setColor(g.getColor());
			break;
		case 5:
			g.setColor(new Color(0, 0, 150));
			dto.setColor(g.getColor());
			break;
		case 6:
			g.setColor(new Color(255, 0, 255));
			dto.setColor(g.getColor());
			break;
		}

		// 도형

		if (msPaint.getFill().isSelected()) {
			fill = true;
			if (msPaint.getLine().isSelected()) {
				shape = 0;
			} else if (msPaint.getCircle().isSelected()) {
				shape = 1;
			} else if (msPaint.getRect().isSelected()) {
				shape = 2;
			} else if (msPaint.getRoundRect().isSelected()) {
				shape = 3;
			} else if (msPaint.getPen().isSelected()) {
				shape = 7;
			}
		} else if (!msPaint.getFill().isSelected()) {
			fill = false;
			if (msPaint.getLine().isSelected()) {
				shape = 0;
			} else if (msPaint.getCircle().isSelected()) {
				shape = 4;
			} else if (msPaint.getRect().isSelected()) {
				shape = 5;
			} else if (msPaint.getRoundRect().isSelected()) {
				shape = 6;
			} else if (msPaint.getPen().isSelected()) {
				shape = 7;

			}
		}
		dto.setFill(fill);
		dto.setShape(shape);
		msPaint.list.add(dto);
		System.out.println("draw");
		for (ShapeDTO dto : this.msPaint.list) {
			x1 = dto.getX1();
			y1 = dto.getY1();
			x2 = dto.getX2();
			y2 = dto.getY2();
			z1 = dto.getZ1();
			z2 = dto.getZ2();
			System.out.print("x1: " + x1);
			System.out.print(" x2: " + x2);
			System.out.print(" y1: " + y1);
			System.out.println(" y2: " + y2);
			g.setColor(dto.getColor());
			fill = dto.isFill();
			shape = dto.getShape();

			if (fill) {
				if (shape == 0) {
					g.drawLine(x1, y1, x2, y2);
				} else if (shape == 1) {
					g.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (shape == 2) {
					g.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (shape == 3) {
					g.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
				} else if (shape == 7) {
					g.drawLine(x2, y2, x2, y2);
				}
			} else if (!fill) {
				if (shape == 0) {
					g.drawLine(x1, y1, x2, y2);
				} else if (shape == 4) {
					g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (shape == 5) {
					g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (shape == 6) {
					g.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
				} else if (shape == 7) {
					g.drawLine(x2, y2, x2, y2);
				}
			}
		}
	}
}
