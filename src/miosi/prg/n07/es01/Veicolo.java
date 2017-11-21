package miosi.prg.n07.es01;

public class Veicolo {
	private Vector2D position;
	private Vector2D velocity;
	private Vector2D acceleration;

	public Veicolo() {
		position = new Vector2D();
		velocity = new Vector2D();
		acceleration = new Vector2D();
	}

	public Veicolo(Vector2D position, Vector2D velocity, Vector2D acceleration) {
		setPosition(position);
		setVelocity(velocity);
		setAccceleration(acceleration);
	}

	public void setPosition(Vector2D position) {
		this.position = position;
	}

	public Vector2D getPosition() {
		return position;
	}

	public void setVelocity(Vector2D velocity) {
		this.velocity = velocity;
	}

	public Vector2D getVelocity() {
		return velocity;
	}

	public void setAccceleration(Vector2D acceleration) {
		this.acceleration = acceleration;
	}

	public Vector2D getAcceleration() {
		return acceleration;
	}

	public void muovi(double t) {
		double newX = getPosition().getX() + getVelocity().getX() * t + getAcceleration().getX() * t * t;
		double newY = getPosition().getY() + getVelocity().getY() * t + getAcceleration().getY() * t * t;

		position.setX(newX);
		position.setY(newY);
	}
}