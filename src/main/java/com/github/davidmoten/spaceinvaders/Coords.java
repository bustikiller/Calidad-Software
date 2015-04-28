package com.github.davidmoten.spaceinvaders;

public class Coords {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	private int x, y;

	public Coords(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean isValid() {
		return (x >= 0 && x <= WIDTH && y >= 0 && y <= HEIGHT);
	}

	public void sum(Coords c) {
		x += c.x;
		y += c.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
