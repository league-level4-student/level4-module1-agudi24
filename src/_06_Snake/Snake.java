package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		Location l = head.getLocation();
		switch(currentDirection) {
		case RIGHT:
			System.out.println("Right");
			l.x++;
		break;
		case LEFT:
			System.out.println("Left");
			l.x--;
		break;
		case UP:
			System.out.println("Up");
			l.y--;
		break;
		case DOWN:
			System.out.println("Down");
			l.y++;
		break;
		}

		//2. Iterate through the SnakeSegments in reverse order
		for(int i=snake.size()-1; i>=1;i--) {
			snake.get(i).setLocation(new Location(snake.get(i-1).getLocation().x,snake.get(i-1).getLocation().y));
			head.setLocation(snake.get(i).getLocation());
			canMove = true;
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		}
		
		//3. set the location of the head to the new location calculated in step 1
		

		//4. set canMove to true
		
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
		if(canMove == true) {
		currentDirection = d;
		}
		canMove = false;
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head
		head.setLocation(loc);
		//3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		int x = head.getLocation().x;
		int y = head.getLocation().y;
		if(x > _00_SnakeGame.WINDOW_WIDTH || y > _00_SnakeGame.WINDOW_HEIGHT || x < 0 || y < 0) {
			return true;
		}
		return false;
	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		for (int i = 2; i < snake.size(); i++) {
			if(head.getLocation().x == snake.get(i).getLocation().x && head.getLocation().y == snake.get(i).getLocation().y) {
				return true;
			}
		}
	
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		for (int i = 2; i < snake.size(); i++) {
			if(loc.x == snake.get(i).getLocation().x && loc.y == snake.get(i).getLocation().y) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
