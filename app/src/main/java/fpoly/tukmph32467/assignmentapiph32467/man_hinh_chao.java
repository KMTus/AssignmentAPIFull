package fpoly.tukmph32467.assignmentapiph32467;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class man_hinh_chao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Tạo Intent để chuyển đến màn hình mới
                Intent intent = new Intent(man_hinh_chao.this, man_hinh_dang_nhap.class);
                startActivity(intent);
                finish(); // Kết thúc màn hình hiện tại
            }
        }, 3000);
    }
}