package com.corejava.TypeCasting;

class X
{}
class Y extends X
{}
class Z extends Y
{}


public class ExplicitDownCating {

	public static void main(String[] args) {
		X x = new Y();
		Y y =(Y) x;
	//	Z z=(Z) x;

	}

}
