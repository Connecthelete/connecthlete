package com.example.connecthlete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;

public class SignUp extends AppCompatActivity {
   // private Button goSignin=(Button) findViewById(R.id.signupbuttonid);
    private String UserID;
    private DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText user_name = findViewById(R.id.usernameid);
        EditText pass_word = findViewById(R.id.pwdid);
        EditText ph_number = findViewById(R.id.phnoid);
        String sport = "";
        Button su_button = findViewById(R.id.signupbuttonid);
        DAOPlayer dao = new DAOPlayer();

        su_button.setOnClickListener(v->
        {

            Player play = new Player(user_name.getText().toString(), pass_word.getText().toString(), ph_number.getText().toString(), "");
            dao.add(play).addOnSuccessListener(suc->
            {
                Toast.makeText(this, "Signup successful", Toast.LENGTH_SHORT).show();

            });

            //find the uid here so we can use it in the next lines
            //UserID = FirebaseAuth.getInstance().getCurrentUser().getUid();


            Intent intent=new Intent(SignUp.this,FindPeople.class);
            intent.putExtra("uid",dao.getRef());
            startActivity(intent);
            finish();




//            HashMap<String, Object> hashMap = new HashMap<>();
//            hashMap.put("username", user_name.getText().toString());
//            hashMap.put("number", ph_number.getText().toString());
//            hashMap.put("sport", sport);
//            hashMap.put("password", pass_word.getText().toString());

//            dao.update("-NEV7npayJDtuY_Y-dOf", hashMap).addOnSuccessListener(suc->
//            {
//                Toast.makeText(this, "Signup updated", Toast.LENGTH_SHORT).show();
//
//            });
        });


//        goSignin.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Intent intent=new Intent(SignUp.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//
//
//        });




    }
}