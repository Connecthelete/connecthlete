package com.example.connecthlete;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DAOPlayer {
    private DatabaseReference databaseReference;
    public DAOPlayer(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Player.class.getSimpleName());
    }

    public Task<Void> add(Player play)
    {
        return databaseReference.push().setValue(play);

    }
    public String getRef(){
        return databaseReference.push().toString();
    }
    public Task<Void> update(String key, HashMap<String, Object> hashMap){
        return databaseReference.child(key).updateChildren(hashMap);
    }
}
