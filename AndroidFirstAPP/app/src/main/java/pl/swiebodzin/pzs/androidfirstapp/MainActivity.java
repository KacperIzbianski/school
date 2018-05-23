package pl.swiebodzin.pzs.androidfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//ctrl+spacja podpowiada
//deklaracja zmiennych
    EditText firstNumber;
    EditText secondNumber;

    int a, b, sum;
    TextView textSum;
    Button clearButton;
    Button sumButton;
    Button rozButton;
    Button mnozButton;
    Button dzielButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber); //findViewById wyszukuje w pliku wartosci podanej w nawiasie (R- odwołanie do pliku activity_main.xml.obiekt(np. id). nazwa)
        secondNumber = findViewById(R.id.secondNumber);
        textSum = findViewById(R.id.textSum);
        clearButton = findViewById(R.id.clearButton);
        sumButton = findViewById(R.id.sumButton);
        rozButton = findViewById(R.id.rozButton);
        mnozButton = findViewById(R.id.mnozButton);
        dzielButton = findViewById(R.id.dzielButton);

        sumButton.setOnClickListener(new View.OnClickListener() { //metody umozliwiajace klikniecie przycisku z efektem ktory trzba zaprogramować
            @Override
            public void onClick(View v) {
                // Integer zawiera opcje zamiany liczba na ciąg znakow  (np. parseInt)
                //toString zamienia na string
                if((firstNumber == null) || (secondNumber == null)) {
                    textSum.setText("Wprowadz obie liczby");
                }
                else {


                    a = Integer.parseInt(firstNumber.getText().toString());
                    //to samo co wyzej ale w dwóch linijkach
                    // String firstNumberString = firstNumber.getText().toString();
                    // a = Integer.parseInt(firstNumberString);
                    b = Integer.parseInt(secondNumber.getText().toString());

                    sum = getSum(a, b);
                    textSum.setText(String.valueOf(sum)); //wyswietlenie wyniku zamienionego ze stringa na liczbe
                }


            }
        });
        rozButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((firstNumber == null) || (secondNumber == null)) {
                    textSum.setText("Wprowadz obie liczby");
                }
                else {


                    a = Integer.parseInt(firstNumber.getText().toString());
                    b = Integer.parseInt(secondNumber.getText().toString());
                    sum = getRoz(a, b);
                    textSum.setText(String.valueOf(sum));
                }
            }
        });
        mnozButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((firstNumber == null) || (secondNumber == null)) {
                    textSum.setText("Wprowadz obie liczby");
                }
                else {


                    a = Integer.parseInt(firstNumber.getText().toString());
                    b = Integer.parseInt(secondNumber.getText().toString());
                    sum = getMnoz(a, b);
                    textSum.setText(String.valueOf(sum));
                }
            }
        });
        dzielButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((firstNumber.getText().toString().length() == 0) || (secondNumber.getText().toString().length() == 0)) {
                    textSum.setText("Jełopie nigdy nie dziel przez ZERO");
                }
                else {


                    if ((firstNumber == null) || (secondNumber == null)) {
                        textSum.setText("Wprowadz obie liczby");
                    } else {


                        a = Integer.parseInt(firstNumber.getText().toString());
                        b = Integer.parseInt(secondNumber.getText().toString());
                        sum = getDziel(a, b);
                        textSum.setText(String.valueOf(sum));
                    }
                }
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((firstNumber == null) || (secondNumber == null)){

                }
                else {
                    firstNumber.setText(" ");
                    secondNumber.setText(" ");
                    textSum.setText(" ");
                }
            }
        });
//todo napisac sprawdzanie w domu czy pola number 1 i number2 sa puste
    }
    public int getSum(int number1, int number2){

        return number1+number2;
    }

    public int getRoz(int number1, int number2){

        return number1-number2;
    }
    public int getMnoz(int number1, int number2){

        return number1*number2;
    }
    public int getDziel(int number1, int number2){

        return number1/number2;
    }

}
