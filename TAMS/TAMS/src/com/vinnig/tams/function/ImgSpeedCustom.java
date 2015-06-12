package com.vinnig.tams.function;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;

public class ImgSpeedCustom extends ImageView {
	Paint paint;
	float direction = 0.0f;
	Bitmap bm;

	public ImgSpeedCustom(Context context) {
		super(context);
	}
	
	public void setallImage(Context contex,double speed,Resources rs)
	{
		speed=Function.SpeedChanger(contex,speed);
		bm=Function.DigitalConveter(speed+"",rs);
		Function.StartSound(contex,speed);
		this.setImageBitmap(bm);
		this.setMinimumHeight(140);
		this.setMinimumWidth(300);
		this.setMaxHeight(140);
		this.setMaxWidth(300);
		
		
		
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	}
	public void setdirection(float direction)
	{
		this.direction=direction;
		this.invalidate();
		
	}

}
