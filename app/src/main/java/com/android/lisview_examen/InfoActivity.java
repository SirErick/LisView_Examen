package com.android.lisview_examen;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    public static String Posicion = "pos";

    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ImageView iv=(ImageView)findViewById(R.id.imageView);
        Drawable drawable1 = this.getResources().getDrawable(R.drawable.mercurio);
        Drawable drawable2 = this.getResources().getDrawable(R.drawable.venus);
        Drawable drawable3 = this.getResources().getDrawable(R.drawable.tierra);
        Drawable drawable4 = this.getResources().getDrawable(R.drawable.marte);
        Drawable drawable5 = this.getResources().getDrawable(R.drawable.jupiter);
        Drawable drawable6 = this.getResources().getDrawable(R.drawable.saturno);
        Drawable drawable7 = this.getResources().getDrawable(R.drawable.urano);
        Drawable drawable8 = this.getResources().getDrawable(R.drawable.neptuno);
        Drawable drawable9 = this.getResources().getDrawable(R.drawable.pluton);
        Intent newint = getIntent();
        Posicion = newint.getStringExtra(MainActivity.Posicion);
        num=Integer.parseInt(Posicion);
        if(num==0){
            setMercurio();
            iv.setImageDrawable(drawable1);
        }
        if(num==1){
            setVenus();
            iv.setImageDrawable(drawable2);
        }
        if(num==2){
            setTierra();
            iv.setImageDrawable(drawable3);
        }
        if(num==3){
            setMarte();
            iv.setImageDrawable(drawable4);
        }if(num==4){
            setJupiter();
            iv.setImageDrawable(drawable5);
        }
        if(num==5){
            setSaturno();
            iv.setImageDrawable(drawable6);
        }
        if(num==6){
            setUrano();
            iv.setImageDrawable(drawable7);
        }
        if(num==7){
            setNeptuno();
            iv.setImageDrawable(drawable8);
        }
        if(num==8){
            setPluton();
            iv.setImageDrawable(drawable9);
        }



    }
    public void setMercurio(){

            TextView quantityTextView = (TextView) findViewById(
                    R.id.textView);
            quantityTextView.setText("MERCURIO.\n" +"Distancia media al Sol: 57.870.000 Km.\n" +
                    "Diámetro: 4.850 Km.\n" +
                    "Duración de la traslación: 57 Km./seg. en el afelio\n" +
                    "Distancia máxima a la Tierra: 220 millones de Km.\n" +
                    "Volumen: 0,6 el de la Tierra\n" +
                    "Período de rotación (día): 88 días");


    }
    public void setVenus() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("VENUS.\n" +"Temperatura Media: 260°C.\n" +
                "Distancia media al Sol: 107.826.000 Km.\n" +
                "Diámetro: 12.373 Km.\n" +
                "Duración de la traslación: 224.7 días.\n" +
                "Distancia mínima a la Tierra: 42 millones de Km.\n" +
                "Período de rotación (día): 30 días\n" +
                "Gravedad: 0,81 de la Tierra"
        );
    }
    public void setTierra() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("TIERRA.\n" +"Diámetro de la Tierra en el ecuador: 12.756 Km.\n" +
                "Circunferencia de la Tierra en el ecuador: 40.076 Km.\n" +
                "Diámetro de la Tierra de uno a otro polo: 12.713,82 Km.\n" +
                "Circunferencia de la Tierra en los polos (meridianos): 40.009,152 Km.\n" +
                "Longitud de un grado de latitud en el ecuador: 110,576 Km.\n" +
                "Longitud de un grado de longitud en el ecuador: 111,307 Km.\n"

        );
    }
    public void setMarte() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("MARTE.\n" +"Satélites: 2\n" +
                "Distancia media al Sol: 227,8 millones de Km.\n" +
                "Recorrido de su órbita: 687 días\n" +
                "Velocidad orbital: 24,11 km/seg\n" +
                "Temperatura del suelo: + 32° a -70°C\n" +
                "Diámetro ecuatorial: 6.800 Km.\n" +
                "Volumen: 15 veces el de la Tierra\n" +
                "Período de rotación (día): 24 hs. 37′ 23″"
        );
    }
    public void setJupiter() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("JUPITER.\n" +
                "Posición: 778,570000 km.\n" +
                "Rotación.- Este planeta gira sobre su propio eje en 9,84 horas terrestres \n" +
                "Composición.- Su composición es básicamente gaseosa.\n" +
                "Gravedad.- Su gravedad es de  2,34 veces la de la tierra.\n"


        );
    }
    public void setSaturno() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText(
                "SATURNO.\n" +"Volumen: 719 veces el de la Tierra\n" +
                "Distancia media al Sol: 1.429.097.400 Km.\n" +
                "Diámetro ecuatorial: 120.800 Km.\n" +
                "Diámetro polar: 108.100 Km.\n" +
                "Periodo de rotación (día): 10 horas, 48 minutos\n" +
                "Período de traslación (año): 29,5 años\n" +
                "Gravedad en la superficie: 1,14 de la Tierra\n" +
                "Velocidad orbital: 9,7 Km./seg\n"

        );
    }
    public void setUrano() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("URANO.\n" +
                "Masa: 8.6810 x 1025 kg.\n" +
                "Volumen: 6.83344 x 1013 km3.\n" +
                "Densidad: 1.270 g/cm3.\n" +
                "Diámetro: 51118 km.\n" +
                "Temperatura efectiva: -216° centígrados."
        );
    }
    public void setNeptuno() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("NEPTUNO.\n" +"Volumen: 42 veces el de la Tierra\n" +
                "Distancia al Sol: 4.496.500.000 km\n" +
                "Diámetro ecuatorial: 44.600 km\n" +
                "Rotación (día): 16 horas\n" +
                "Traslación (año): 165 años\n" +
                "Gravedad en la superficie: 1.53 de la Tierra\n" +
                "Número de satélites: 2\n" +
                "Temperatura media diurna: 201°C bajo cero"
        );
    }
    public void setPluton() {

        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("PLUTON.\n" +"Volumen: 1.3 de la Tierra\n" +
                "Distancia al Sol: 5.906.292.500 Km.\n" +
                "Diámetro ecuatorial: 14.500 Km.\n" +
                "Traslación (ano): 248 años\n" +
                "Número de satélites: ninguno\n" +
                "Temperatura media diurna: 210°C bajo cero\n" +
                "Período de Rotación: 6,9 días"
        );
    }
}
