package br.edu.ifsp.scl.ads.pdm.cadastro;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Formulario {
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private CheckBox emailCb;
    private RadioButton masculinoRb, femininoRb;
    private EditText cidadeEt;
    private Spinner estadosSp;

    //Setters
    public void setNomeEt(EditText nomeEt) {
        this.nomeEt = nomeEt;
    }

    public void setTelefoneEt(EditText telefoneEt) {
        this.telefoneEt = telefoneEt;
    }

    public void setEmailEt(EditText emailEt) {
        this.emailEt = emailEt;
    }

    public void setEmailCb(CheckBox emailCb) {
        this.emailCb = emailCb;
    }

    public void setMasculinoRb(RadioButton masculinoRb) {
        this.masculinoRb = masculinoRb;
    }

    public void setFemininoRb(RadioButton femininoRb) {
        this.femininoRb = femininoRb;
    }

    public void setCidadeEt(EditText cidadeEt) {
        this.cidadeEt = cidadeEt;
    }

    public void setEstadosSp(Spinner estadosSp) {
        this.estadosSp = estadosSp;
    }
    //Getters

    public EditText getNomeEt() {
        return nomeEt;
    }

    public EditText getTelefoneEt() {
        return telefoneEt;
    }

    public EditText getEmailEt() {
        return emailEt;
    }

    public CheckBox getEmailCb() {
        return emailCb;
    }

    public RadioButton getMasculinoRb() {
        return masculinoRb;
    }

    public RadioButton getFemininoRb() {
        return femininoRb;
    }

    public EditText getCidadeEt() {
        return cidadeEt;
    }

    public Spinner getEstadosSp() {
        return estadosSp;
    }

    @Override
    public String toString() {
        return nomeEt.getText().toString() + "\n"
                + telefoneEt.getText().toString() + "\n"
                + emailEt.getText().toString() + "\n"
                + (emailCb.isChecked()? emailCb.getText().toString() : "Não foi checado") + "\n"
                + (masculinoRb.isChecked()? masculinoRb.getText().toString() : femininoRb.getText().toString()) +"\n"
                + cidadeEt.getText().toString() + "\n";
                /*+ ((TextView) estadosSp.getSelectedView()).getText().toString() + "\n"; -- ESEE ÚLTIMO NÃO DEU BOM*/
    }

}
