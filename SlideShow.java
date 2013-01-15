package com.example.minidiary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageView;

public class SlideShow extends Activity{
	
	GalleryApp ga;
	Gallery gallery;
	ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.images_gallery);
		String uri=getIntent().getStringExtra(DetailForm.SHOW);
		gallery=(Gallery)findViewById(R.id.gallery2);
		imageView=(ImageView)findViewById(R.id.images2);
		ga=new GalleryApp(gallery, uri, SlideShow.this,imageView);
	}
}
