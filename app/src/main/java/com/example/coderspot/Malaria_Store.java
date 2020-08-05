package com.example.coderspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Malaria_Store extends AppCompatActivity {
    EditText patientName, diseaseName, id;
    Button button;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseUser user1 = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaria__store);

        patientName = findViewById(R.id.malaria_name);
        diseaseName = findViewById(R.id.disease_name);
        id = findViewById(R.id.malaria_id);
        button=findViewById(R.id.btn_malaria);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users").child(user1.getUid());
                String patient_Name = patientName.getText().toString();
                String disease_Name = diseaseName.getText().toString();
                String id_numnber = id.getText().toString();

                if (patient_Name.isEmpty()) {
                    patientName.setError("Enter Name");
                    patientName.requestFocus();
                } else if (disease_Name.isEmpty()) {
                    diseaseName.setError("Enter patient Name");
                    diseaseName.requestFocus();

                } else if (id_numnber.isEmpty()) {
                    id.setError("Enter Name");
                    id.requestFocus();

                }
                else if (!patient_Name .isEmpty() && !disease_Name .isEmpty() && !id_numnber.isEmpty()) {


                    MalariaHelper user = new MalariaHelper(patient_Name, disease_Name, id_numnber);

                    reference.child(id_numnber).setValue(user);

                    Toast.makeText(Malaria_Store.this, "DETAILS SAVED", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(Malaria_Store.this, Malaria.class));
                }
            }
        });
    }
}