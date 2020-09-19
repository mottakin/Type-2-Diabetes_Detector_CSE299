package com.example.diabeticspredictor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class FAQActivity extends AppCompatActivity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_q);
        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        TextView mTitleWindow1 = (TextView) findViewById(R.id.titleWindow1);
        TextView mMessageWindow1 = (TextView) findViewById(R.id.messageWindow1);
        TextView mTitleWindow2 = (TextView) findViewById(R.id.titleWindow2);
        TextView mMessageWindow2 = (TextView) findViewById(R.id.messageWindow2);
        TextView mTitleWindow3 = (TextView) findViewById(R.id.titleWindow3);
        TextView mMessageWindow3 = (TextView) findViewById(R.id.messageWindow3);
        TextView mTitleWindow4 = (TextView) findViewById(R.id.titleWindow4);
        TextView mMessageWindow4 = (TextView) findViewById(R.id.messageWindow4);
        TextView mTitleWindow5 = (TextView) findViewById(R.id.titleWindow5);
        TextView mMessageWindow5 = (TextView) findViewById(R.id.messageWindow5);
        TextView mTitleWindow6 = (TextView) findViewById(R.id.titleWindow6);
        TextView mMessageWindow6 = (TextView) findViewById(R.id.messageWindow6);
        TextView mTitleWindow7 = (TextView) findViewById(R.id.titleWindow7);
        TextView mMessageWindow7 = (TextView) findViewById(R.id.messageWindow7);






        mTitleWindow.setText("What causes high blood sugar?");
        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Many things can cause high blood sugar, but what we eat plays the biggest and most direct role in elevating blood sugar. When we eat carbohydrates, our body converts those carbohydrates into glucose, and this can play a role in raising blood sugar. Protein, to a certain degree, in high amounts can also raise blood sugar levels. Fat does not raise blood sugar levels. Stress leading to an increase in the hormone cortisol can also raise blood sugar levels.";
        stringBuilder.append(someMessage);
        mMessageWindow.setText(stringBuilder.toString());



        mTitleWindow1.setText("What's the difference between type 1 and type 2 diabetes?");

        String someMessage1 = "\u200DType 1 diabetes is an autoimmune condition that results in the body’s inability to produce insulin. People who suffer from Type 1 diabetes must be on insulin in order to keep glucose levels within normal limits.Type 2 diabetes is a disease in which either the body is able to produce insulin but is not able to produce enough or the body does not respond to the insulin that is being produced (known as insulin resistance). People with type 2 diabetes must be on a low carbohydrate diet to keep their diabetes from worsening.";
        stringBuilder.append(someMessage1);
        mMessageWindow1.setText(stringBuilder.toString());



        mTitleWindow2.setText("What should your fasting blood glucose be?");

        String someMessage2 = "A fasting blood sugar should be less than 100 in order to be considered normal.  A fasting blood sugar of >100 to 125 is consistent with prediabetes.  Fasting blood sugar levels of 126 or greater is diagnostic of diabetes.";
        stringBuilder.append(someMessage2);
        mMessageWindow2.setText(stringBuilder.toString());


        mTitleWindow3.setText("What is diabetic ketoacidosis?");

        String someMessage3 = "Diabetic ketoacidosis (or DKA) is a serious medical condition that can result from very high levels of ketones in the blood. If it is not recognized and treated right away, then it can lead to a coma or even death. Because it is such a serious condition, a person who develops diabetic ketoacidosis is usually admitted to the hospital for treatment.\n" +
                "\n" +
                "This condition occurs when the body’s cells are unable to use glucose for energy, and the body begins to break down fat for energy instead. Ketones are produced when the body breaks down fat, and very high levels of ketones can make the blood extremely acidic. The acidity can potentially cause coma and death.\n" +
                "\n" +
                "People with type 1 diabetes are at risk of developing diabetic ketoacidosis if they do not take their insulin, if they do not eat, or if they become sick for other reasons (such as an infection). It is very unusual for people with type 2 diabetes to develop diabetic ketoacidosis.";

        stringBuilder.append(someMessage3);
        mMessageWindow3.setText(stringBuilder.toString());


        mTitleWindow4.setText("How does Metformin treat prediabetes and type 2 diabetes?");
        String someMessage4 = "Metformin was first synthesized in the 1920s, but actually wasn’t approved for use for type 2 diabetes in the United States until 1995, under the brand name “Glucophage.” Metformin is also used for the treatment of prediabetes and polycystic ovarian syndrome (PCOS), although it is not currently FDA approved for this use.\n" +
                "\n" +
                "Interestingly, the mechanism of action of metformin is not fully understood. It appears to reduce glucose production in the liver, although there is now evidence that other factors may also play a role. Metformin is generally safe and well-tolerated by patients and does not tend to cause low blood glucose, so it is recommended as the first-line pharmacologic treatment for type 2 diabetes.";
        stringBuilder.append(someMessage4);
        mMessageWindow4.setText(stringBuilder.toString());




        mTitleWindow5.setText("What is type 1 diabetes?");
        String someMessage5 = "Type 1 diabetes is a condition where the body does not produce insulin.\n" +
                "\n" +
                "\u200DWhat is insulin? Insulin is a hormone that is needed for the body to move glucose from the blood into the body’s cells. All of the organs in the body, including the brain, the heart, and the lungs, are made of cells. These cells use glucose for energy, which is why it is important for the glucose to move from the bloodstream into the cells.\n" +
                "\n" +
                "The lack of insulin production in type 1 diabetes is usually caused by a problem with the pancreas. Type 1 diabetes is considered to be a permanent condition when it is diagnosed.\n" +
                "\n";
        stringBuilder.append(someMessage5);
        mMessageWindow5.setText(stringBuilder.toString());




        mTitleWindow6.setText("What are the signs and symptoms of prediabetes?");
        String someMessage6 = "Prediabetes is considered to be one of the most insidious precursors to diabetes because it may not have any signs or symptoms. This is why it is so important to do diagnostic blood tests checking a fasting glucose or hemoglobin A1c (HbA1c) test to establish a diagnosis of prediabetes. Many people who have prediabetes (which affects 84 million adults in the U.S.) do not have any symptoms. By the time symptoms occurs, the diagnosis has usually already progressed to diabetes. There are some rare situations in which an individual can present with diabetes-related complications such as a retinal bleed, neuropathy or even a stroke, while only having a diagnosis of prediabetes.";

        stringBuilder.append(someMessage6);
        mMessageWindow6.setText(stringBuilder.toString());


        mTitleWindow7.setText("What is the best diet for prediabetes?");
        String someMessage7 = "\u200D\u200DA low carbohydrate diet is the ideal diet for prediabetes. This is because prediabetes occurs when glucose levels start to rise and the body produces insulin to try and lower the glucose levels. If the body cannot produce enough insulin or if the insulin level that the body is producing is not enough to meet the demands of the high glucose load, then glucose levels continue to rise.\n" +
                "\n" +
                "A low carbohydrate diet can lower blood glucose levels and maintain a low blood glucose level.";

        stringBuilder.append(someMessage7);
        mMessageWindow7.setText(stringBuilder.toString());





















    }
}