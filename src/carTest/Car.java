package carTest;

public abstract class Car {
	public abstract void start( );
	public abstract void drive( );
	public abstract void stop( );
	public abstract void turnoff( );
	
	public void carwash( ) {
		System.out.println("������ �մϴ�." );
	}
	
	final public void run( ) {
		start( );
		drive( );
		stop( );
		turnoff( );
		carwash( );
	}
}
