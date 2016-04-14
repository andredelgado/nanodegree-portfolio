package xyz.adelgado.nanodegreeportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void launchPopularMovies(View view) {
		showToast(getString(R.string.popular_movies));
	}

	public void launchStockHawk(View view) {
		showToast(getString(R.string.stock_hawk));
	}

	public void launchBuildBigger(View view) {
		showToast(getString(R.string.build_it_bigger));
	}

	public void launchAppMaterial(View view) {
		showToast(getString(R.string.make_your_app_material));
	}

	public void launchUbiquitous(View view) {
		showToast(getString(R.string.go_ubiquitous));
	}

	public void launchCapstone(View view) {
		showToast(getString(R.string.capstone));
	}

	private void showToast(String text) {
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}
}
