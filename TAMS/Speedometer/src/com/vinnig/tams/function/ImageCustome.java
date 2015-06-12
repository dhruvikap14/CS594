package com.vinnig.tams.function;

import com.vinnig.tams.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;

public class ImageCustome extends ImageView{
	Paint paint;
	float direction=0.0f;
	Bitmap bm;
	
	

	public ImageCustome(Context context) {
		super(context);
	
		 bm = BitmapFactory.decodeResource(getResources(),
				 R.drawable.compass_main);
		 
		 this.setImageBitmap(bm);
		
		 
		
	}



	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		int hieght=this.getHeight();
		int width=this.getWidth();
		canvas.rotate(direction, width/2,hieght/2);
		
		super.onDraw(canvas);
		
		
	}
	
	public void setDirection(float direction)
	{
		this.direction=-direction;
		this.invalidate();
	}

	
	
}
