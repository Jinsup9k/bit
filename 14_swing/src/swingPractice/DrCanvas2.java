package swingPractice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

@SuppressWarnings("serial")
public class DrCanvas2 extends Canvas {
	private MsPaint2 msPaint2;
	private Image bufferImg;
	private Graphics bufferG;

	public DrCanvas2(MsPaint2 msPaint2) {
		this.msPaint2 = msPaint2;
		this.setBackground(new Color(244, 244, 254)); // 연보라 색으로
		// 이벤트
	}

	@Override
	public void update(Graphics g) {
		Dimension d = this.getSize();

		if (bufferG == null) {
			bufferImg = this.createImage(d.width, d.height);
			bufferG = bufferImg.getGraphics();
		}
		// 같은 색깔의 바탕색으로 캔버스를 채운다
		bufferG.setColor(this.getBackground());
		bufferG.fillRect(0, 0, d.width, d.height);

		// 구그림
		legacy(g);

		// 신그림
		// 좌표
		int x1 = Integer.parseInt(msPaint2.getX1T().getText().trim());// 양쪽의 공백을 제거해서 가져옴
		int y1 = Integer.parseInt(msPaint2.getY1T().getText().trim());
		int x2 = Integer.parseInt(msPaint2.getX2T().getText().trim());
		int y2 = Integer.parseInt(msPaint2.getY2T().getText().trim());
		int z1 = Integer.parseInt(msPaint2.getZ1T().getText().trim());
		int z2 = Integer.parseInt(msPaint2.getZ2T().getText().trim());

		// 색
		switch (msPaint2.getCombo().getSelectedIndex()) {
		case 0:
			bufferG.setColor(new Color(255, 0, 0));
			break;
		case 1:
			bufferG.setColor(new Color(255, 100, 0));
			break;
		case 2:
			bufferG.setColor(new Color(255, 255, 0));
			break;
		case 3:
			bufferG.setColor(new Color(0, 255, 0));
			break;
		case 4:
			bufferG.setColor(new Color(0, 0, 255));
			break;
		case 5:
			bufferG.setColor(new Color(0, 0, 150));
			break;
		case 6:
			bufferG.setColor(new Color(255, 0, 255));
			break;
		case 7:
			bufferG.setColor(new Color(255, 255, 255));
			break;
		}

		// 도형
		if (msPaint2.getFill().isSelected()) {
			if (msPaint2.getLine().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);
			} else if (msPaint2.getCircle().isSelected()) {
				bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
			} else if (msPaint2.getRect().isSelected()) {
				bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
			} else if (msPaint2.getRoundRect().isSelected()) {
				bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
			} else if (msPaint2.getPen().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);
			}
		} else if (!msPaint2.getFill().isSelected()) {
			if (msPaint2.getLine().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);
			} else if (msPaint2.getCircle().isSelected()) {
				bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
			} else if (msPaint2.getRect().isSelected()) {
				bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
			} else if (msPaint2.getRoundRect().isSelected()) {
				bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
			} else if (msPaint2.getPen().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);
			}
		}
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(bufferImg, 0, 0, this);
	}

	private void legacy(Graphics g) {
		for (ShapeDTO2 dto : msPaint2.getList()) {
			// 좌표
			int x1 = dto.getX1();
			int y1 = dto.getY1();
			int x2 = dto.getX2();
			int y2 = dto.getY2();
			int z1 = dto.getZ1();
			int z2 = dto.getZ2();

			// 색
			switch (dto.getColor()) {
			case 0:
				bufferG.setColor(new Color(255, 0, 0));
				break;
			case 1:
				bufferG.setColor(new Color(255, 100, 0));
				break;
			case 2:
				bufferG.setColor(new Color(255, 255, 0));
				break;
			case 3:
				bufferG.setColor(new Color(0, 255, 0));
				break;
			case 4:
				bufferG.setColor(new Color(0, 0, 255));
				break;
			case 5:
				bufferG.setColor(new Color(0, 0, 150));
				break;
			case 6:
				bufferG.setColor(new Color(255, 0, 255));
				break;
			case 7:
				bufferG.setColor(new Color(255, 255, 255));
				break;
			}
			// 도형
			if (dto.isFill()) {
				if (dto.getShape() == Figure.LINE) {
					bufferG.drawLine(x1, y1, x2, y2);
				} else if (dto.getShape() == Figure.CIRCLE) {
					bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (dto.getShape() == Figure.RECT) {
					bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (dto.getShape() == Figure.ROUNDRECT) {
					bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1,
							z2);
				} else if (dto.getShape() == Figure.PEN) {
					bufferG.drawLine(x1, y1, x2, y2);
				}
			} else if (!dto.isFill()) {
				if (dto.getShape() == Figure.LINE) {
					bufferG.drawLine(x1, y1, x2, y2);
				} else if (dto.getShape() == Figure.CIRCLE) {
					bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (dto.getShape() == Figure.RECT) {
					bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (dto.getShape() == Figure.ROUNDRECT) {
					bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1,
							z2);
				} else if (dto.getShape() == Figure.PEN) {
					bufferG.drawLine(x1, y1, x2, y2);
				}
			}
		}

	}
}
