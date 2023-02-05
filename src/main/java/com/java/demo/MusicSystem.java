package com.java.demo;

public class MusicSystem extends Electornics{
private int musicSystemId;
private String musicSystemName;
private String musicSystemType;
static {// gets executed at the time of class load (only once).
	System.out.println("class MusicSystem loaded on method area. once at the time of class loading");
}
{
	System.out.println("gets executed at each object creation of MusicSystem");
}
public MusicSystem() {
	super();
	//System.out.println("No arg constructor of class MusicSystem called.");
}
public MusicSystem(int electronicC1, String electronicC2) {
	super(electronicC1, electronicC2);
	// TODO Auto-generated constructor stub
}
public MusicSystem( int electronicC1, String electronicC2,int musicSystemId, String musicSystemName,
		String musicSystemType) {
	super(electronicC1, electronicC2);
	this.musicSystemId = musicSystemId;
	this.musicSystemName = musicSystemName;
	this.musicSystemType = musicSystemType;
System.out.println("Para Constructor called");
}

public MusicSystem(int musicSystemId, String musicSystemName, String musicSystemType) {
	super();
	this.musicSystemId = musicSystemId;
	this.musicSystemName = musicSystemName;
	this.musicSystemType = musicSystemType;
}
public int getMusicSystemId() {
	return musicSystemId;
}
public void setMusicSystemId(int musicSystemId) {
	this.musicSystemId = musicSystemId;
}
public String getMusicSystemName() {
	return musicSystemName;
}
public void setMusicSystemName(String musicSystemName) {
	this.musicSystemName = musicSystemName;
}
public String getMusicSystemType() {
	return musicSystemType;
}
public void setMusicSystemType(String musicSystemType) {
	this.musicSystemType = musicSystemType;
}
@Override
public String toString() {
	return "\nMusicSystem [musicSystemId=" + musicSystemId + ", musicSystemName=" + musicSystemName + ", musicSystemType="
			+ musicSystemType + "]" + super.toString();
}

}
