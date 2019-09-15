package com.designpattern.adapter;

public class PenMarker implements Pen{

	PilotPen p=new PilotPen();
    ParkerPen prkpn=new ParkerPen();
	@Override
	public void startWritingAssignMentUsingPen() {
		p.write();
		prkpn.write();
	}

}
