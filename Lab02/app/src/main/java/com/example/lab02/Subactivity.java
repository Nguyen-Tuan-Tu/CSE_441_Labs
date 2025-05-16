package com.example.lab02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast; // Import Toast
import android.widget.TextView; // Import TextView (nếu bạn muốn tương tác với TextView trong dialog)


// Các import này có thể không cần thiết cho Activity dạng dialog,
// nhưng chúng không gây lỗi nếu có.
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lab02.R;

// Khai báo lớp Subactivity kế thừa từ AppCompatActivity
public class Subactivity extends AppCompatActivity {
    // Khai báo biến Button
    Button btnok;
    // TextView dialogMessage; // Khai báo TextView nếu cần tương tác

    // Phương thức onCreate() được gọi khi Activity được tạo lần đầu
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        // Bắt buộc phải gọi phương thức onCreate() của lớp cha
        // Điều này đảm bảo Activity được khởi tạo đúng cách bởi hệ thống Android
        super.onCreate(savedInstanceState);

        // Thiết lập layout cho Activity này từ file activity_subactivity.xml
        // Đảm bảo file activity_subactivity.xml tồn tại trong res/layout
        setContentView(R.layout.activity_subactivity); // Sử dụng layout activity_subactivity

        // Hiển thị Toast khi onCreate được gọi (để theo dõi vòng đời)
        Toast.makeText(this, "Subactivity: onCreate()", Toast.LENGTH_SHORT).show();

        // Tìm Button trong layout bằng ID R.id.btnok và gán vào biến btnok
        // Đảm bảo có một Button trong activity_subactivity.xml với ID là btnok
        btnok = findViewById(R.id.btnok);
        // Nếu bạn muốn tương tác với TextView trong dialog:
        // dialogMessage = findViewById(R.id.dialogMessage);
        // dialogMessage.setText("Nội dung mới của dialog");


        // Thiết lập lắng nghe sự kiện click cho nút btnok
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Hiển thị Toast khi nút OK được click
                Toast.makeText(Subactivity.this, "Subactivity: OK Clicked", Toast.LENGTH_SHORT).show();
                // Khi nút btnok được click, kết thúc Subactivity hiện tại
                // Điều này sẽ đóng dialog và quay về Activity trước đó (MainActivity)
                finish();
            }
        });
    }

    // Ghi đè các phương thức vòng đời khác để theo dõi bằng Toast
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Subactivity: onStart()", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Subactivity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Subactivity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Subactivity: onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Subactivity: onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Subactivity: onRestart()", Toast.LENGTH_SHORT).show();
    }
}

