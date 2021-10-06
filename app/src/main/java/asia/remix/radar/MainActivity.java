package asia.remix.radar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.View;

public class MainActivity extends AppCompatActivity{

	@Override
	protected void onCreate( Bundle savedInstanceState ){
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		View radarView = (View)findViewById( R.id.radarView );
		Animation animation= AnimationUtils.loadAnimation( this, R.anim.radar );
		radarView.startAnimation( animation );
	}
}