package com.example.sepulveda_ochoa_eyder_pm01_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.concurrent.atomic.DoubleAccumulator;

public class 5MainActivity extends AppCompatActivity {

    private TextView txtOperacion; //Variable para mostrar la operacion
    private TextView resultadoFinal;
    private Double resultadoActual;
    private String resultadoParcial;
    private Double primerValor;
    private Double segundoValor;
    private String concatenar; //Variable para concatenar el numero anterior
    private Button btnBoton0;
    private Button btnBoton1;
    private Button btnBoton2;
    private Button btnBoton3;
    private Button btnBoton4;
    private Button btnBoton5;
    private Button btnBoton6;
    private Button btnBoton7;
    private Button btnBoton8;
    private Button btnBoton9;
    private Button btnAC;
    private Button btnMas;
    private Button btnMenos;
    private Button btnDivision;
    private Button btnMultiplica;
    private ImageButton btnBorrar;
    private Button btnPunto;
    private Button btnIgual;
    private Button btnPorciento;
    private Button opuesto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazamos el textView que refleja las operaciones en la IU con la variable txtOperacion de nuestro codigo
        txtOperacion = findViewById(R.id.textOperaciones);
        //Enlazamos el textView que refleja el resultado de las operaciones en la IU con la variable txtResultado de nuestro codigo
        resultadoFinal = findViewById(R.id.textResultado);

        /*
         * Asignamos el valor de 0 al pulsar boton cero
         * */
        btnBoton0 = findViewById(R.id.btnCero);
        btnBoton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("0");
            }
        });

        /*
         * Asignamos valor de 1 al pulsar el boton uno
         * */
        btnBoton1 = findViewById(R.id.btnUno);
        btnBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("1");
            }
        });

        /*
         * Asignamos valor de 2 al pulsar el boton dos
         * */
        btnBoton2 = findViewById(R.id.btnDos);
        btnBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("2");
            }
        });

        /*
         * Asignamos valor de 3 al pulsar el boton tres
         * */
        btnBoton3 = findViewById(R.id.btnTres);
        btnBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("3");
            }
        });

        /*
         * Asignamos valor de 4 al pulsar el boton cuatro
         * */
        btnBoton4 = findViewById(R.id.btnCuatro);
        btnBoton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("4");
            }
        });

        /*
         * Asignamos valor de 5 al pulsar el boton cinco
         * */
        btnBoton5 = findViewById(R.id.btnCinco);
        btnBoton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("5");
            }
        });

        /*
         * Asignamos valor de 6 al pulsar el boton seis
         * */
        btnBoton6 = findViewById(R.id.btnSeis);
        btnBoton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("6");
            }
        });

        /*
         * Asignamos valor de 7 al pulsar el boton siete
         * */
        btnBoton7 = findViewById(R.id.btnSiete);
        btnBoton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("7");
            }
        });

        /*
         * Asignamos valor de 8 al pulsar el boton ocho
         * */
        btnBoton8 = findViewById(R.id.btnOcho);
        btnBoton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("8");
            }
        });

        /*
         * Asignamos valor de 9 al pulsar el boton nueve
         * */
        btnBoton9 = findViewById(R.id.btnNueve);
        btnBoton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("9");
            }
        });

        /*
         * Configuración del boton resetear para borrar todo
         * */
        btnAC = findViewById(R.id.btnResetear);
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText("");
                resultadoFinal.setText("");
            }
        });

        //Configurar el boton para el signo +
        btnMas = findViewById(R.id.btnSuma);
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //trim().length()-->Devuelve una copia de la cadena, con los espacios en blanco iniciales y finales omitidos.
                concatenarValores("+");
            }
        });

        //Configurar el boton para el signo -
        btnMenos = findViewById(R.id.btnRestar);
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("-");
            }
        });

        //Configurar el boton para el signo ÷
        btnDivision = findViewById(R.id.btnDividir);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = txtOperacion.getText().toString();
                concatenarValores("÷");
            }
        });

        //Configurar el boton para el signo x
        btnMultiplica = findViewById(R.id.btnMultiplicar);
        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("*");
            }
        });

        //Boton para borrar el ultimo caracter
        btnBorrar = findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//Borrar el ultimo caracter asignado
                concatenar = txtOperacion.getText().toString();
                if (concatenar.length() > 0) {
                    String nuevaOperacion = concatenar.substring(0, concatenar.length() - 1);
                    txtOperacion.setText(nuevaOperacion);
                }
            }
        });

        //Boton para asignar punto
        btnPunto = findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores(".");
            }
        });

        //Configuracion boton igual
        btnIgual = findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = txtOperacion.getText().toString();
                resultadoParcial = resultadoFinal.getText().toString();
                if (!concatenar.isEmpty() && !resultadoParcial.isEmpty()) {
                    operaciones("");
                } else if (!concatenar.isEmpty() && resultadoParcial.isEmpty()) {
                    operaciones("=");
                }
                resultadoFinal.setText("");
                txtOperacion.setText(resultadoParcial);

            }
        });

        //Configuración porciento
        btnPorciento = findViewById(R.id.btnPorcentaje);
        btnPorciento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarValores("%");
            }
        });

        //Boton opuesto
        opuesto = findViewById(R.id.btnOpuesto);
        opuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = txtOperacion.getText().toString();
                if (!concatenar.isEmpty()) {
                    if (concatenar.startsWith("-")) {
                        concatenar = concatenar.substring(1, concatenar.length());
                    } else {
                        concatenar = "-" + concatenar;
                    }
                }
                txtOperacion.setText(concatenar);
            }
        });

    }

    /**
     * @param valorPulsado
     */

    public void concatenarValores(String valorPulsado) {
        concatenar = txtOperacion.getText().toString(); // concatena el anterior numero con los siguientes
        resultadoParcial = resultadoFinal.getText().toString();
        if (concatenar.isEmpty()) {
            if (valorPulsado.equals("÷")
                    || valorPulsado.equals("*")
                    || valorPulsado.equals("+")
                    || valorPulsado.equals("%")) {
                concatenar = "";
            } else {
                concatenar += valorPulsado;
            }
        } else if (valorPulsado.equals("÷")
                || valorPulsado.equals("*")
                || valorPulsado.equals("+")
                || valorPulsado.equals("-")
                || valorPulsado.equals(".")) {
            if ((resultadoParcial.endsWith("÷")
                    || resultadoParcial.endsWith("*")
                    || resultadoParcial.endsWith("+")
                    || resultadoParcial.endsWith("-")
                    || resultadoParcial.endsWith(".")) && concatenar.isEmpty()) {
                resultadoParcial = resultadoParcial.substring(0, resultadoParcial.length() - 1) + valorPulsado;
            } else if (resultadoParcial.isEmpty() && (concatenar.endsWith("-")
                    || concatenar.endsWith("."))) {
                concatenar = "";
            } else {
                operaciones(valorPulsado);
            }
        } else {
            concatenar += valorPulsado;
        }
        resultadoFinal.setText(resultadoParcial);
        txtOperacion.setText(concatenar);
    }

    /**
     * @param valorPulsado
     */
    public void operaciones(String valorPulsado) {
        String temporal;
        if (valorPulsado.equals(".")) {
            concatenar += valorPulsado;
        } else if (resultadoParcial.contains("+")) {//Retorna el indice del signo +
            calcularValores("+");
            resultadoActual = primerValor + segundoValor;
            calcularValorFinal(valorPulsado);
        } else if (resultadoParcial.contains("-")) {
            calcularValores("-");
            resultadoActual = primerValor - segundoValor;
            calcularValorFinal(valorPulsado);
        } else if (resultadoParcial.contains("*")) {
            calcularValores("*");
            resultadoActual = primerValor * segundoValor;
            calcularValorFinal(valorPulsado);
        } else if (resultadoParcial.contains("÷")) {
            calcularValores("÷");
            resultadoActual = primerValor / segundoValor;
            calcularValorFinal(valorPulsado);
        } else if (valorPulsado.equals("=")) {
            if (comprobarPorcentaje(concatenar)) {
                primerValor = sacarPorcentaje(Double.parseDouble(concatenar.substring(0, concatenar.length() - 1)));
            } else {
                primerValor = Double.parseDouble(concatenar);
            }
            resultadoActual = primerValor;
            calcularValorFinal(valorPulsado);
        } else {
            resultadoParcial = concatenar + valorPulsado;
            concatenar = "";
        }
    }

    /**
     * @param valorPulsado
     */
    public void calcularValorFinal(String valorPulsado) {
        String temporal = "" + resultadoActual;
        if (Long.parseLong(temporal.substring(temporal.indexOf(".") + 1)) > 0) {
            if (valorPulsado.equals("=")) {
                resultadoParcial = "" + resultadoActual;
            } else {
                resultadoParcial = resultadoActual + valorPulsado;
            }
        } else {
            if (valorPulsado.equals("=")) {
                resultadoParcial = "" + Long.parseLong(temporal.substring(0, temporal.indexOf(".")));
            } else {
                resultadoParcial = "" + Long.parseLong(temporal.substring(0, temporal.indexOf("."))) + valorPulsado;
            }

        }
        concatenar = "";
    }

    /**
     * @param valor
     * @return
     */
    public Double sacarPorcentaje(Double valor) {
        return (valor * 1) / 100;
    }

    /**
     * @param valor
     * @return
     */
    public boolean comprobarPorcentaje(String valor) {
        if (valor.endsWith("%")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param valorPulsado
     * @return
     */
    public String determinarValor(String valorPulsado) {
        return resultadoParcial.substring(0, resultadoParcial.lastIndexOf(valorPulsado));// Saca el numero desde la posicion 0 hasta la possicion antes del operando
    }

    /**
     * @param operacion
     */
    public void calcularValores(String operacion) {
        String temporal = determinarValor(operacion);
        if (comprobarPorcentaje(temporal)) {
            primerValor = sacarPorcentaje(Double.parseDouble(temporal.substring(0, temporal.length() - 1)));
        } else {
            primerValor = Double.parseDouble(temporal);
        }
        if (comprobarPorcentaje(concatenar)) {
            segundoValor = sacarPorcentaje(Double.parseDouble(concatenar.substring(0, concatenar.length() - 1)));
        } else {
            segundoValor = Double.parseDouble(concatenar);
        }
    }


}