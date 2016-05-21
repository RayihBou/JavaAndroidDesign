package comrayihbou.github.javaandroiddesign;

import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button; //Importar Layout
import android.widget.RelativeLayout; //Importar Boton
import android.widget.EditText; //Importar Editor de Texto
import android.content.res.Resources; //Importar Recursos de Android
import android.util.TypedValue;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creacion de Layout
        RelativeLayout rayihLayout = new RelativeLayout(this);
        rayihLayout.setBackgroundColor(Color.CYAN);

        //Creacion de Boton
        Button rayihBoton = new Button(this);
        rayihBoton.setId(1);
        rayihBoton.setBackgroundColor(Color.BLACK);
        rayihBoton.setTextColor(Color.WHITE);
        rayihBoton.setText("Login");

        //Creacion de Parametros para el Boton
        RelativeLayout.LayoutParams detalleBoton = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        detalleBoton.addRule(RelativeLayout.CENTER_HORIZONTAL);
        detalleBoton.addRule(RelativeLayout.CENTER_VERTICAL);

        //Creacion de EditText
        EditText nombreUsuario = new EditText(this);
        nombreUsuario.setId(2);

        //Creacion de Parametros para el EditText
        RelativeLayout.LayoutParams detalleUsario = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        detalleUsario.addRule(RelativeLayout.ABOVE, rayihBoton.getId()); //Regla para ubicar el EditText encima del Boton de LoginIn
        detalleUsario.addRule(RelativeLayout.CENTER_HORIZONTAL);
        detalleUsario.setMargins(0,0,0,100);

        //Obtencion de recursos para asignarle el ancho al EditText
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics()
        );

        nombreUsuario.setWidth(px); //Asignarle el ancho de pixeles al EditText

        //Mostrar layout
        setContentView(rayihLayout);

        //Mostrar Boton
        rayihLayout.addView(rayihBoton, detalleBoton);

        //Mostrar EditText
        rayihLayout.addView(nombreUsuario, detalleUsario);





    }
}
