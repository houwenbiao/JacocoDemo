package com.jackhou.jacocodemo.app;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jackhou.jacocodemo.R;
import com.jackhou.jacocodemo.test.JacocoInstrumentation;
import com.jackhou.jacocodemo.utils.PermissionUtils;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.gen_jacoco_doc)
    Button mButton;

    public JacocoInstrumentation jacocoInstrumentation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        PermissionUtils.verifyStoragePermissions(this);
        jacocoInstrumentation = new JacocoInstrumentation();
    }

    @OnClick(R.id.gen_jacoco_doc)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.gen_jacoco_doc:
                jacocoInstrumentation.UsegenerateCoverageReport();
                break;

            default:
                break;
        }
    }
}
