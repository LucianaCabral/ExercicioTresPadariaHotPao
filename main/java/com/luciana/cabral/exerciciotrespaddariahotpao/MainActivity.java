package com.luciana.cabral.exerciciotrespaddariahotpao;

import androidx.appcompat.app.AppCompatActivity;
/* a padaria hot-pão vende uma certa quantidade de pães franceses e uma quantidade de
broas a cada dia. cada pãozinho custa r$ 0,12 e a broa custa r$ 1,50. ao final do dia, o dono
quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto' deve guardar
numa conta de poupança (10% do total arrecadado). você foi contratado para fazer os cálculos
para o dono. com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de
broas, e depois calcular os dados solicitados*/
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText quantidadePaes;
    EditText quantidadeBroas;
    Button botaoCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantidadePaes = (findViewById(R.id.quantidade_paes_vendidos_edt));
        quantidadeBroas = (findViewById(R.id.quantidade_broas_vendidas_edt));
        botaoCalcular = findViewById(R.id.button_tela);
        botaoCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    Double nquantidadePaes = Double.parseDouble(quantidadePaes.getText().toString());
    Double nquantidadeBroas = Double.parseDouble(quantidadeBroas.getText().toString());
    Double total = this.calcularProdutosVendidos(nquantidadePaes,nquantidadeBroas);
    Toast.makeText(this, "O total a ser colocado na poupança deve ser: " + total.toString(), Toast.LENGTH_SHORT).show();
    }

    private Double calcularProdutosVendidos(Double quantidadePaes, Double quantidadeBroas) {
        Double totalVendas = (quantidadePaes * 0.12) + (quantidadeBroas * 1.50);
        totalVendas = totalVendas*10/100;
        return totalVendas;
    }

}