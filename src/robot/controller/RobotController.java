package robot.controller;

import lejos.nxt.Motor;

public class RobotController
{
    public void drawLineForward(int speed, int time)
    {
	Motor.A.setSpeed(speed);
	Motor.B.setSpeed(speed);
	Motor.A.forward();
	Motor.B.forward();
	try
	{
	    Thread.sleep(time);
	}
	catch (InterruptedException e)
	{
	    e.printStackTrace();
	}
    }
    
    public void drawLineBackward(int speed, int time)
    {
	Motor.A.setSpeed(speed);
	Motor.B.setSpeed(speed);
	Motor.A.backward();
	Motor.B.backward();
	try
	{
	    Thread.sleep(time);
	}
	catch (InterruptedException e)
	{
	    e.printStackTrace();
	}
    }
    
    public void turnRight(int speed, int time)
    {
	Motor.A.setSpeed(speed);
	Motor.B.setSpeed(speed);
	Motor.A.forward();
	Motor.B.backward();
	try
	{
	    Thread.sleep(time);
	}
	catch (InterruptedException e)
	{
	    e.printStackTrace();
	}
    }
    
    public void start()
    {
	
    }
}
